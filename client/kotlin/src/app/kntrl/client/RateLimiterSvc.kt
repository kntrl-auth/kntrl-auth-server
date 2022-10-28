package app.kntrl.client

import app.kntrl.client.generated.api.AuthorisationApi
import app.kntrl.client.generated.model.AuthorizeRes
import app.kntrl.client.generated.model.RateLimiterReq

class RateLimiterSvc(private val session: Session) {
    fun limit(rateLimiterId: String, quotaToBurn: Double): AuthorizeRes = handleErr(session) {
        AuthorisationApi(session.authenticatedOpenapiClient())
            .limit(RateLimiterReq().id(rateLimiterId).quotaToBurn(quotaToBurn))
    }
}