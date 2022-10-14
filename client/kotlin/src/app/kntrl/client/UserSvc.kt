package app.kntrl.client

import app.kntrl.client.generated.api.UserApi
import app.kntrl.client.generated.model.ConfirmUserAuthsReq
import app.kntrl.client.generated.model.SaveUserReq
import app.kntrl.client.generated.model.SaveUserRes
import app.kntrl.client.generated.model.User as UserModel

class UserSvc(private val session: Session) {
    fun get(): UserModel = handleErr(session) { UserApi(session._authenticatedOpenapiClient()).user }
    fun save(req: SaveUserReq): SaveUserRes = handleErr(session) {
        UserApi(session._authenticatedOpenapiClient()).saveUser(req)
    }
    fun confirmAuth(receivedCodes: Map<String, Map<String, String>>): SaveUserRes = handleErr(session) {
        UserApi(session._authenticatedOpenapiClient())
            .confirmUserAuths(ConfirmUserAuthsReq().receivedCodes(receivedCodes))
    }
}

fun SaveUserReq.enableFactor(factor: String) = this.putFactorsItem(factor, true)
fun SaveUserReq.disableFactor(factor: String) = this.putFactorsItem(factor, false)

fun SaveUserReq.saveLogin(type: String, login: String) = this.putLoginsItem(type, login)
fun SaveUserReq.removeLogin(type: String) = this.putLoginsItem(type, null)

//fun SaveUserReq.enableAuth(auth: String, reqBuilder: (AuthenticateReqAuthReqsValue) -> Any) =
//    this.putAuthReqsItem(auth, reqBuilder)
fun SaveUserReq.disableAuth(auth: String) = this.putAuthReqsItem(auth, null)