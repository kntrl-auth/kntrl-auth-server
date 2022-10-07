package app.kntrl.client

import app.kntrl.client.generated.infra.ApiClient
import app.kntrl.client.generated.model.NewSessionReq

class Kntrl(serverUrl: String = "http://localhost:9876") {
    private val client = ApiClient().apply {
        basePath = serverUrl
    }

    fun newSession(
        entry: String,
        logins: Map<String, String>? = null,
        signIn: Boolean = false,
        signUp: Boolean = false,
    ) = Session(client, null, NewSessionReq().apply {
        this.entry = entry
        this.logins = logins
        this.signIn = signIn
        this.signUp = signUp
    })

    fun session(accessToken: String? = null) = Session(client, accessToken, null)

    class Logins : LinkedHashMap<String, String>() {
        fun login(type: String, login: String): Logins {
            put(type, login)
            return this
        }
    }
}