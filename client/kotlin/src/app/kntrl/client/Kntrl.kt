package app.kntrl.client

import app.kntrl.client.generated.infra.ApiClient
import app.kntrl.client.generated.model.NewSessionReq
import app.kntrl.client.generated.model.Tokens

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
    fun newSession(entry: String, signIn: Boolean = false, signUp: Boolean = false) =
        newSession(entry, null, signIn, signUp)

    fun session(tokens: Tokens) = Session(client, tokens, null)
    fun session(accessToken: String?) = session(Tokens().access(accessToken))
    fun session() = session(null)

    fun serverHealth(key: String? = null) = session().server.health(key)

    class Logins : LinkedHashMap<String, String>() {
        fun login(type: String, login: String): Logins {
            put(type, login)
            return this
        }
    }
}