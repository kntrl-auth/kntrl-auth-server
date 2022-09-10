import { ConfirmUserAuthsReq, SaveUserReq, SaveUserRes, User as UserModel, UserApi } from '../generated';
import { handleErr } from './utils';
import { Session } from './session';

export class UserSvc {
    private readonly api: UserApi;

    constructor(private readonly session: Session) {
        this.api = new UserApi(session._serverCfg());
    }

    async get(): Promise<UserModel> {
        return handleErr(this.api.getUser(await this.session._authenticatedAxiosCfg()), this.session);
    }

    async save(req: SaveUserReq): Promise<SaveUserRes> {
        return handleErr(this.api.saveUser(req, await this.session._authenticatedAxiosCfg()), this.session);
    }

    async confirmAuth(req: ConfirmUserAuthsReq): Promise<SaveUserRes> {
        return handleErr(this.api.confirmUserAuths(req, await this.session._authenticatedAxiosCfg()), this.session);
    }
}