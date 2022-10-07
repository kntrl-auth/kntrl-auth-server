package app.kntrl.client

import app.kntrl.client.generated.api.UserApi
import app.kntrl.client.generated.infra.ApiClient
import app.kntrl.client.generated.model.ConfirmUserAuthsReq
import app.kntrl.client.generated.model.SaveUserReq
import app.kntrl.client.generated.model.SaveUserRes
import app.kntrl.client.generated.model.User as UserModel

class User(client: ApiClient) {
    private val api = UserApi(client)

    fun get(): UserModel = handleErr { api.user }
    fun save(req: SaveUserReq): SaveUserRes = handleErr {
        api.saveUser(req)
    }
    fun confirmAuth(receivedCodes: Map<String, Map<String, String>>): SaveUserRes = handleErr {
        api.confirmUserAuths(ConfirmUserAuthsReq().receivedCodes(receivedCodes))
    }
}

fun SaveUserReq.enableFactor(factor: String) = this.putFactorsItem(factor, true)
fun SaveUserReq.disableFactor(factor: String) = this.putFactorsItem(factor, false)

fun SaveUserReq.saveLogin(type: String, login: String) = this.putLoginsItem(type, login)
fun SaveUserReq.removeLogin(type: String) = this.putLoginsItem(type, null)

fun SaveUserReq.enableAuth(auth: String, authReq: Any) = this.putAuthReqsItem(auth, authReq)
fun SaveUserReq.disableAuth(auth: String) = this.putAuthReqsItem(auth, null)