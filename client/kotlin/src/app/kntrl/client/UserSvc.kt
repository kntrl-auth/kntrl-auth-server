package app.kntrl.client

import app.kntrl.client.generated.api.UserApi
import app.kntrl.client.generated.model.AuthenticateReqAuthReqsValue
import app.kntrl.client.generated.model.ConfirmUserAuthsReq
import app.kntrl.client.generated.model.SaveUserRes
import app.kntrl.client.generated.model.SaveUserReq as SaveUserReqModel
import app.kntrl.client.generated.model.User as UserModel

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
}

class SaveUserReq : SaveUserReqModel() {
    fun enableFactor(factor: String): SaveUserReq {
        putFactorsItem(factor, true)
        return this
    }
    fun disableFactor(factor: String): SaveUserReq {
        putFactorsItem(factor, false)
        return this
    }

    fun saveLogin(type: String, login: String): SaveUserReq {
        putLoginsItem(type, login)
        return this
    }
    fun removeLogin(type: String): SaveUserReq {
        putLoginsItem(type, null)
        return this
    }

    fun enableAuth(auth: String, req: AuthenticateReqAuthReqsValue): SaveUserReq {
        putAuthReqsItem(auth, req)
        return this
    }
    fun disableAuth(auth: String): SaveUserReq {
        putAuthReqsItem(auth, null)
        return this
    }

    fun dryRun(): SaveUserReq {
        dryRun(true)
        return this
    }
}