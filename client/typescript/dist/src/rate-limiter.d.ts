import { AuthorizeRes, RateLimiterReq } from '../generated';
import { Session } from './session';
export declare class RateLimiterSvc {
    private readonly session;
    private readonly api;
    constructor(session: Session);
    limit(req: RateLimiterReq): Promise<AuthorizeRes>;
}
