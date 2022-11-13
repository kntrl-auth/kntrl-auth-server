package app.kntrl.client

import app.kntrl.client.openapi.api.AuthorisationApi
import app.kntrl.client.openapi.model.AuthorizeRes
import app.kntrl.client.openapi.model.RateLimiterReq

class RateLimiterSvc(private val session: Session) {
    fun limit(rateLimiterId: String, quotaToBurn: Double): AuthorizeRes = handleErr(session) {
        AuthorisationApi(session.authenticatedOpenapiClient())
            .limit(RateLimiterReq().id(rateLimiterId).quotaToBurn(quotaToBurn))
    }
}