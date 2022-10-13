package app.kntrl.client

import app.kntrl.client.generated.api.UserApi
import app.kntrl.client.generated.model.*
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

fun SaveUserReq.enableAuth(auth: String, req: AuthenticateReqAuthReqsValue) = this.putAuthReqsItem(auth, req)
fun SaveUserReq.enableAuth(auth: String, req: PasswordUpdateReq) = this.enableAuth(auth, AuthenticateReqAuthReqsValue(req))
fun SaveUserReq.enableAuth(auth: String, req: AppSecretReq) = this.enableAuth(auth, AuthenticateReqAuthReqsValue(req))
fun SaveUserReq.enableAuth(auth: String) = this.enableAuth(auth, mutableMapOf())
fun SaveUserReq.enableAuth(auth: String, req: OAuthReq) = this.enableAuth(auth, AuthenticateReqAuthReqsValue(req))
fun SaveUserReq.enableAuth(auth: String, req: QuestionsUpdateReq) = this.enableAuth(auth, AuthenticateReqAuthReqsValue(req))
fun SaveUserReq.enableAuth(auth: String, req: MutableMap<String, Any>): SaveUserReq {
    val reqJson = AuthReqDataJson()
    req.forEach { (k, v) -> reqJson.putAdditionalProperty(k, v) }
    return enableAuth(auth, AuthenticateReqAuthReqsValue(reqJson))
}

fun SaveUserReq.disableAuth(auth: String) = this.putAuthReqsItem(auth, null)