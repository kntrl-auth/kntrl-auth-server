package app.kntrl.client

import app.kntrl.client.generated.api.ServerApi
import app.kntrl.client.generated.infra.ApiClient
import app.kntrl.client.generated.infra.ApiException
import app.kntrl.client.generated.model.DbHealthRes
import app.kntrl.client.generated.model.HealthRes
import app.kntrl.client.generated.model.HealthStatus
import app.kntrl.client.generated.model.HealthStatusRes
import kntrl.client.generated.model.*

class Server(client: ApiClient) {
    private val api = ServerApi(client)

    fun health(): HealthRes = try {
        handleErr {
            api.health()
        }
    } catch (ex: ApiException) {
        if (ex.code != 0) throw ex

        val status = HealthStatusRes().apply {
            status = HealthStatus.ERR
            msg = ex.message
        }
        HealthRes().apply {
            db = DbHealthRes().apply {
                user = status
                session = status
            }
            auth = emptyMap()
            this.status = status.status
            this.msg = status.msg
        }
    }

    fun cfg(): AppCfg = handleErr { api.cfg() }
}