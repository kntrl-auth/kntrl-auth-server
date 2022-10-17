import { SHAppCfg, HealthRes } from '../generated';
import { Session } from './session';
export declare class ServerSvc {
    private readonly session;
    private readonly api;
    constructor(session: Session);
    health(key?: string): Promise<HealthRes>;
    cfg(): Promise<SHAppCfg>;
}
