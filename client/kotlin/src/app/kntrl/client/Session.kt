package app.kntrl.client

import app.kntrl.client.openapi.api.AuthorisationApi
import app.kntrl.client.openapi.api.SessionApi
import app.kntrl.client.openapi.api.TokenApi
import app.kntrl.client.openapi.infra.ApiClient
import app.kntrl.client.openapi.model.*
import app.kntrl.client.openapi.model.Session as SessionModel

class Session(
    private val client: ApiClient,
    private var tokens: Tokens?, private var newSessionReq: NewSessionReq?,
) : SessionModel() {
    val server = ServerSvc(this)
    @get:JvmName("user") val user = UserSvc(this)
    val rateLimiter = RateLimiterSvc(this)

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

    fun get(): SessionModel = handleErr(this) {
        val res = SessionApi(authenticatedOpenapiClient()).session
        update(null, res)
        res
    }


    fun authenticate(req: AuthenticateReq): AuthenticateRes = handleErr(this) {
        val res = if (newSessionReq != null) {
            SessionApi(authenticatedOpenapiClient()).newSession(newSessionReq!!.apply {
                factors = req.factors
                authReqs = req.authReqs
                dryRun = req.dryRun
            })
        } else {
            SessionApi(authenticatedOpenapiClient()).authenticate(req)
        }
        if (res.tokens?.access != null) newSessionReq = null
        update(res.tokens, res.session)
        res
    }

    fun confirm(receivedCodes: Map<String, Map<String, String>>): AuthenticateRes = confirm(null, receivedCodes)
    fun confirm(sessionId: String?, receivedCodes: Map<String, Map<String, String>>): AuthenticateRes = handleErr(this) {
        val res = SessionApi(authenticatedOpenapiClient()).confirmSessionAuths(
            ConfirmSessionAuthsReq().sessionId(sessionId).receivedCodes(receivedCodes))
        update(res.tokens, res.session)
        res
    }

    fun signOut() = signOut(null)
    fun signOut(sessionId: String?) = handleErr(this) {
        if (sessionId != null) {
            SessionApi(authenticatedOpenapiClient()).delSession(sessionId)
        } else {
            SessionApi(authenticatedOpenapiClient()).signOut()
        }
    }

    fun refreshAccessToken() = refreshAccessToken(null)
    fun refreshAccessToken(refreshToken: String?) = refreshAccessToken(refreshToken, null)
    fun refreshAccessToken(
        overrideRefreshToken: String?,
        errOnMissingToken: Exception?,
    ): RefreshTokenRes = handleErr {
        val refreshToken = overrideRefreshToken
            ?: tokens?.refresh
            ?: throw (errOnMissingToken ?: IllegalArgumentException("No refresh token"))

        val res = TokenApi(client).refreshToken(RefreshTokenReq().refreshToken(refreshToken))
        update(res.tokens, res.session)
        res
    }

    fun accessToken() = accessToken(1000)
    fun accessToken(refreshBeforeExpireMs: Long): String? {
        if (tokens?.refresh == null) return this.tokens?.access;

        if (tokens!!.accessTokenExpiresAt!! - System.currentTimeMillis() < refreshBeforeExpireMs) {
            this.refreshAccessToken()
        }
        return tokens?.access
    }

    fun newSession(entry: String) = Session(
        client, tokens,
        NewSessionReq().entry(entry).signIn(true),
    )

    fun authorize() = authorize(null)
    fun authorize(rateLimiter: RateLimiterReq?): AuthorizeRes = handleErr(this) {
        AuthorisationApi(authenticatedOpenapiClient())
            .authorize(AuthorizeReq().rateLimiter(rateLimiter))
    }

    fun allSession() = allSession(null, null)
    fun allSession(entry: String) = allSession(entry, null)
    fun allSession(entry: String?, userId: String?) = handleErr(this) {
        SessionApi(authenticatedOpenapiClient()).getAll(entry, userId)
    }

    fun authenticatedOpenapiClient() = if (this.tokens == null) {
        this.client
    } else {
        ApiClient(client.httpClient).apply {
            basePath = client.basePath
            setBearerToken(accessToken())
        }
    }

    private fun update(tokens: Tokens?, session: SessionModel?) = synchronized(this) {
        tokens?.also { this.tokens = tokens }
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

    class AuthReqs : AuthenticateReq() {
        fun req(auth: String, req: AuthenticateReqAuthReqsValue?): AuthReqs {
            putAuthReqsItem(auth, req)
            return this
        }
        fun req(auth: String, factor: String, req: AuthenticateReqAuthReqsValue?): AuthReqs {
            putAuthReqsItem(auth, req)
            putFactorsItem(auth, factor)
            return this
        }
        fun enableFactor(factor: String): AuthReqs {
            putFactorsItem(factor, null)
            return this
        }
        fun dryRun(): AuthReqs {
            dryRun(true)
            return this
        }
    }
}

class AuthReq : AuthenticateReqAuthReqsValue()