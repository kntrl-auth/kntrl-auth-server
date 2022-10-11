import { ConfirmUserAuthsReq, SaveUserReq, SaveUserRes, User as UserModel } from '../generated';
import { Session } from './session';
export declare class UserSvc {
    private readonly session;
    private readonly api;
    constructor(session: Session);
    get(): Promise<UserModel>;
    save(req: SaveUserReq): Promise<SaveUserRes>;
    confirmAuth(req: ConfirmUserAuthsReq): Promise<SaveUserRes>;
}
