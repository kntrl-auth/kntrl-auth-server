package app.kntrl.client

import app.kntrl.client.generated.api.SessionApi
import app.kntrl.client.generated.api.TokenApi
import app.kntrl.client.generated.infra.ApiClient
import app.kntrl.client.generated.model.*
import app.kntrl.client.generated.model.Session as SessionModel

class Session(
    client: ApiClient,
    private val accessToken: String?, private var newSessionReq: NewSessionReq?,
) : SessionModel() {
    private val client = ApiClient(client.httpClient).apply {
        basePath = client.basePath
        setApiKey(accessToken)
    }
    private val sessionApi = SessionApi(this.client)

    val server = Server(client)

    init {
        id = ""
        entry = newSessionReq?.entry ?: ""
        identifiedBy = emptyList()
        userId = ""
        authenticatedBy = emptyMap()
        unconfirmedAuths = emptyMap()
        nextFactors = emptyList()
        signedInAt = 0
        expiresAt = 0
        refreshedAt = 0
        newUser = false
        device = Device().type("").userAgent("").browser("").mobile(false)
        systemAccess = false
        expired = false
        authenticated = false
    }

    fun get(): SessionModel = handleErr {
        val res = sessionApi.session
        update(null, res)
        res
    }

    fun authenticate(
        authReqs: Map<String, Any?>? = null,
        factors: Map<String, String>? = null,
    ): AuthenticateRes = handleErr {
        val res = if (newSessionReq != null) {
            sessionApi.newSession(newSessionReq!!.apply {
                this.factors = factors
                this.authReqs = authReqs
            })
        } else {
            sessionApi.authenticate(AuthenticateReq().apply {
                this.factors = factors
                this.authReqs = authReqs
            })
        }
        if (res.tokens?.access != null) newSessionReq = null
        update(res.tokens, res.session)
        res
    }

    fun confirm(receivedCodes: Map<String, Map<String, String>>): AuthenticateRes = handleErr {
        val res = sessionApi.confirmSessionAuths(
            ConfirmSessionAuthsReq().receivedCodes(receivedCodes))
        update(res.tokens, res.session)
        res
    }

    fun signOut() = handleErr {
        sessionApi.signOut()
    }

    fun refresh(refreshToken: String): RefreshTokenRes = handleErr {
        val res = TokenApi(client).refreshToken(RefreshTokenReq().refreshToken(refreshToken))
        update(res.tokens, res.session)
        res
    }

    fun newSession(entry: String) = Session(client, accessToken, NewSessionReq()
        .entry(entry).signIn(true))

    private fun update(tokens: Tokens?, session: SessionModel?) {
        tokens?.access?.let(client::setApiKey)
        session?.also {
            id = it.id
            entry = it.entry
            identifiedBy = it.identifiedBy
            userId = it.userId
            authenticatedBy = it.authenticatedBy
            unconfirmedAuths = it.unconfirmedAuths
            nextFactors = it.nextFactors
            signedInAt = it.signedInAt
            expiresAt = it.expiresAt
            refreshedAt = it.refreshedAt
            newUser = it.newUser
            device = it.device
            systemAccess = it.systemAccess
            expired = it.expired
            authenticated = it.authenticated
        }
    }

    class Factors : LinkedHashMap<String, String>() {
        fun factor(factor: String, auth: String): Factors {
            put(factor, auth)
            return this
        }
    }

    class AuthReqs : LinkedHashMap<String, Any?>() {
        fun req(auth: String, req: Any?): AuthReqs {
            put(auth, req)
            return this
        }
    }
}