package app.kntrl.client

import app.kntrl.client.generated.api.AuthorisationApi
import app.kntrl.client.generated.api.UserApi
import app.kntrl.client.generated.infra.ApiClient
import app.kntrl.client.generated.model.*
import app.kntrl.client.generated.model.User as UserModel

class RateLimiterSvc(private val session: Session) {
    fun limit(rateLimiterId: String, quotaToBurn: Double): AuthoriseRes = handleErr(session) {
        AuthorisationApi(session._authenticatedOpenapiClient())
            .limit(RateLimiterReq().id(rateLimiterId).quotaToBurn(quotaToBurn))
    }
}