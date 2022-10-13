package app.kntrl.client

import app.kntrl.client.generated.api.ServerApi
import app.kntrl.client.generated.infra.ApiClient
import app.kntrl.client.generated.infra.ApiException
import app.kntrl.client.generated.model.*

class ServerSvc(private val session: Session) {
    fun health(key: String? = null): HealthRes = try {
        handleErr(session) { ServerApi(session._authenticatedOpenapiClient()).health(key) }
    } catch (ex: ApiException) {
        if (ex.code != 0) throw ex

        val status = HealthStatusRes().apply {
            status = HealthStatus.ERR
            msg = ex.cause?.message
        }
        HealthRes().apply {
            db = DbHealthRes().apply {
                user = status
                session = status
                rateLimiter = status
            }
            auth = emptyMap()
            this.status = status.status
            this.msg = status.msg
        }
    }

    fun cfg(): SHAppCfg = handleErr(session) { ServerApi(session._authenticatedOpenapiClient()).cfg() }
}