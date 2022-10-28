import { HealthRes, HealthStatus, ServerApi, ShAppCfg } from '../generated';
import { handleErr } from './utils';
import { Session } from './session';

export class ServerSvc {
    private readonly api: ServerApi;
    constructor(private readonly session: Session) {
        this.api = new ServerApi(session._serverCfg());
    }

    async health(key?: string): Promise<HealthRes> {
        try {
            return await handleErr(this.api.health(key, await this.session._authenticatedAxiosCfg()), this.session);
        } catch (err) {
            if (err.code && (err.devMsg || err.msg)) throw err;

            const status = {
                status: HealthStatus.Err,
                msg: err.message,
            };
            return {
                db: { user: status, session: status, rateLimiter: status },
                auth: {},
                ...status,
            };
        }
    }

    async cfg(): Promise<ShAppCfg> {
        return handleErr(this.api.cfg(await this.session._authenticatedAxiosCfg()), this.session);
    }
}