import {
    AuthenticateReq,
    AuthenticateRes,
    AuthorisationApi,
    AuthoriseReq,
    AuthoriseRes,
    Configuration,
    ConfirmSessionAuthsReq,
    Device,
    FindSessionsRes,
    LoginId,
    NewSessionReq,
    NextFactor,
    RefreshTokenRes,
    Session as SessionModel,
    SessionApi,
    TokenApi,
    Tokens,
    UnconfirmedAuth,
} from '../generated';
import { handleErr, merge } from './utils';
import { UserSvc } from './user';
import { ServerSvc } from './server';
import { AxiosRequestConfig } from 'axios';
import { RateLimiterSvc } from './rate-limiter';
import { Kntrl } from '../index';

export class Session implements SessionModel {
    private readonly api: SessionApi;

    constructor(
        private kntrl: Kntrl,
        private newSessionReq: Omit<NewSessionReq, keyof AuthenticateReq> | undefined,
        readonly tokens: Tokens | undefined = undefined,
        readonly id: string = '',
        readonly entry: string = newSessionReq?.entry ?? '',
        readonly identifiedBy: Array<LoginId> = [],
        readonly authenticatedBy: Record<string, string> = {},
        readonly userId: string | undefined = undefined,
        readonly unconfirmedAuths: Record<string, UnconfirmedAuth> = {},
        readonly nextFactors: Array<NextFactor> = [],
        readonly signedInAt: number = 0,
        readonly expiresAt: number = 0,
        readonly newUser: boolean = false,
        readonly authenticated: boolean = false,
        readonly device: Device = { userAgent: '' },
        readonly refreshedAt: number = 0,
        readonly systemAccess: boolean = false,
    ) {
        this.api = new SessionApi(kntrl._serverCfg());
        this.user = new UserSvc(this);
        this.server = new ServerSvc(this);
        this.rateLimiter = new RateLimiterSvc(this)
    }

    async get(): Promise<SessionModel> {
        const res = await handleErr(this.api.getSession(await this._authenticatedAxiosCfg()), this);
        merge(this, res);
        return res;
    }

    async authenticate(req: AuthenticateReq = {}): Promise<AuthenticateRes> {
        const res = await handleErr(async () => {
            if (this.newSessionReq) {
                return this.api.newSession({
                    ...this.newSessionReq,
                    ...req,
                }, await this._authenticatedAxiosCfg());
            } else {
                return this.api.authenticate(req, await this._authenticatedAxiosCfg());
            }
        }, this);
        if (res?.tokens?.access) this.newSessionReq = undefined
        this.update(res);
        return res;
    }

    async confirmAuth(req: ConfirmSessionAuthsReq): Promise<AuthenticateRes> {
        const res = await handleErr(this.api.confirmSessionAuths(req, await this._authenticatedAxiosCfg()), this);
        this.update(res);
        return res;
    }

    async signOut(): Promise<void> {
        await handleErr(this.api.signOut(await this._authenticatedAxiosCfg()), this);
    }

    async refreshAccessToken(refreshToken?: string, errOnMissingToken?: any): Promise<RefreshTokenRes> {
        refreshToken = refreshToken || this.tokens?.refresh;
        if (!refreshToken) throw errOnMissingToken || 'No refresh token';

        const res = await handleErr(
            new TokenApi(this._serverCfg()).refreshToken({ refreshToken }, await this.kntrl._axiosCfg())
        );
        this.update(res);
        return res;
    }

    newSession(req: { entry: string }): Session {
        return new Session(this.kntrl, { entry: req.entry, signIn: true }, this.tokens);
    }

    async allSessions(entry?: string, userId?: string): Promise<FindSessionsRes> {
        return (await handleErr(this.api.getAll(entry, userId, await this._authenticatedAxiosCfg()), this));
    }

    async authorise(req: AuthoriseReq = {}): Promise<AuthoriseRes> {
        return handleErr(new AuthorisationApi(this._serverCfg()).authorize(req, await this._authenticatedAxiosCfg()), this);
    }

    async accessToken(refreshBeforeExpireMs: number = 1000) {
        if (!this.tokens?.refresh) return this.tokens?.access;

        if (this.tokens.accessTokenExpiresAt! - Date.now() < refreshBeforeExpireMs) await this.refreshAccessToken();
        return this.tokens?.access;
    }

    async _authenticatedAxiosCfg(): Promise<AxiosRequestConfig> {
        if (!this.tokens) return this.kntrl._axiosCfg();
        return {
            ...this.kntrl._axiosCfg(),
            headers: {
                ...this.kntrl._axiosCfg().headers,
                Authorization: `Bearer ${await this.accessToken()}`,
            },
        }
    }
    _serverCfg(): Configuration { return this.kntrl._serverCfg() }

    user: UserSvc;
    server: ServerSvc;
    rateLimiter: RateLimiterSvc

    private update(res: { tokens?: Tokens, session?: SessionModel }) {
        merge(this, res.session);
        if (res.tokens) (<any>this).tokens = res.tokens;
    }
}