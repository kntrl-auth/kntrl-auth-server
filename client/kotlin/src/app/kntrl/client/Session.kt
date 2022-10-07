package app.kntrl.client

import app.kntrl.client.generated.api.SessionApi
import app.kntrl.client.generated.api.TokenApi
import app.kntrl.client.generated.infra.ApiClient
import app.kntrl.client.generated.model.*
import java.time.OffsetDateTime
import java.time.ZoneOffset
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

    init {
        id = ""
        entry = newSessionReq?.entry ?: ""
        identifiedBy = emptyList()
        authenticatedBy = emptyMap()
        unconfirmedAuths = emptyMap()
        nextFactors = emptyList()
        signedInAt = OffsetDateTime.now(ZoneOffset.UTC)
        newUser = false
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
        val res = TokenApi(client).refreshToken(refreshToken)
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
            authenticatedBy = it.authenticatedBy
            unconfirmedAuths = it.unconfirmedAuths
            nextFactors = it.nextFactors
            signedInAt = it.signedInAt
            newUser = it.newUser
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