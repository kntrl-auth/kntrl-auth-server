import { AuthenticateReq, Configuration, HealthRes, NewSessionReq, Tokens } from './generated';
import { Session } from './src/session';
import { AxiosRequestConfig } from 'axios';

export class Kntrl {
    constructor(readonly serverUrl: string = 'http://localhost:9876', readonly lang?: string) {}

    newSession(req: Omit<NewSessionReq, keyof AuthenticateReq>): Session { return new Session(this, req); }
    session(accessTokenOrTokens?: string | Tokens): Session {
        const tokens: Tokens | undefined = typeof accessTokenOrTokens == 'string'
            ? { access: accessTokenOrTokens, refresh: '', accessTokenExpiresAt: Date.now() + 1000 * 60 * 60 * 24 * 365 }
            : accessTokenOrTokens;
        return new Session(this, undefined, tokens)
    }

    serverHealth(key?: string): Promise<HealthRes> {
        return this.session().server.health(key);
    }
    _axiosCfg(): AxiosRequestConfig {
        const cfg: AxiosRequestConfig = {
            baseURL: this.serverUrl,
            headers: {},
        };
        if (this.lang) cfg.headers['Accept-Language'] = this.lang;
        return cfg;
    }
    _serverCfg(): Configuration { return new Configuration({ basePath: this._axiosCfg().baseURL }) }
}

export * from './generated';
export { Session as SessionModel } from './generated';
export { Session } from './src/session';
export { AuthExecResStatusEnum as AuthStatus } from './generated';