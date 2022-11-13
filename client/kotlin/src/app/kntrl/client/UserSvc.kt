package app.kntrl.client

import app.kntrl.client.openapi.api.UserApi
import app.kntrl.client.openapi.model.AuthenticateReqAuthReqsValue
import app.kntrl.client.openapi.model.ConfirmUserAuthsReq
import app.kntrl.client.openapi.model.SaveUserRes
import app.kntrl.client.openapi.model.EditUserReq as EditUserReqModel
import app.kntrl.client.openapi.model.SaveUserReq as SaveUserReqModel
import app.kntrl.client.openapi.model.User as UserModel

class UserSvc(private val session: Session) {
    fun get(): UserModel = handleErr(session) { UserApi(session.authenticatedOpenapiClient()).user }
    fun save(req: SaveUserReqModel): SaveUserRes = handleErr(session) {
        UserApi(session.authenticatedOpenapiClient()).saveUser(req)
    }
    fun confirmAuth(receivedCodes: Map<String, Map<String, String>>): SaveUserRes = confirmAuth(null, receivedCodes)
    fun confirmAuth(userId: String?, receivedCodes: Map<String, Map<String, String>>): SaveUserRes = handleErr(session) {
        UserApi(session.authenticatedOpenapiClient())
            .confirmUserAuths(ConfirmUserAuthsReq().userId(userId).receivedCodes(receivedCodes))
    }

    fun edit(userId: String, req: EditUserReqModel): SaveUserRes = handleErr(session) {
        UserApi(session.authenticatedOpenapiClient()).editUser(userId, req)
    }
}

class SaveUserReq : SaveUserReqModel() {
    fun enableFactor(factor: String) = also { putFactorsItem(factor, true) }
    fun disableFactor(factor: String) = also { putFactorsItem(factor, false) }

    fun saveLogin(type: String, login: String) = also { putLoginsItem(type, login) }
    fun removeLogin(type: String) = also { putLoginsItem(type, null) }

    fun enableAuth(auth: String, req: AuthenticateReqAuthReqsValue) = also { putAuthReqsItem(auth, req) }
    fun disableAuth(auth: String) = also { putAuthReqsItem(auth, null) }

    fun dryRun() = also { dryRun(true) }
}

class EditUserReq : EditUserReqModel() {
    fun enableFactor(factor: String) = also { putFactorsItem(factor, true) }
    fun disableFactor(factor: String) = also { putFactorsItem(factor, false) }

    fun saveLogin(type: String, login: String) = also { putLoginsItem(type, login) }
    fun removeLogin(type: String) = also { putLoginsItem(type, null) }

    fun enableAuth(auth: String, req: AuthenticateReqAuthReqsValue) = also { putAuthReqsItem(auth, req) }
    fun disableAuth(auth: String) = also { putAuthReqsItem(auth, null) }

    fun dryRun() = also { dryRun(true) }
}