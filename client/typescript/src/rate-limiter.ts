import { AuthorisationApi, AuthorizeRes, RateLimiterReq } from '../generated';
import { handleErr } from './utils';
import { Session } from './session';

export class RateLimiterSvc {
    private readonly api: AuthorisationApi;

    constructor(private readonly session: Session) {
        this.api = new AuthorisationApi(session._serverCfg());
    }

    async limit(req: RateLimiterReq): Promise<AuthorizeRes> {
        return handleErr(this.api.limit(req, await this.session._authenticatedAxiosCfg()), this.session);
    }
}