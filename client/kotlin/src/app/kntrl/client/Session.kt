package app.kntrl.client

import app.kntrl.client.generated.api.AuthorisationApi
import app.kntrl.client.generated.api.SessionApi
import app.kntrl.client.generated.api.TokenApi
import app.kntrl.client.generated.infra.ApiClient
import app.kntrl.client.generated.model.*
import app.kntrl.client.generated.model.Session as SessionModel

class Session(
    private val client: ApiClient,
    private var tokens: Tokens?, private var newSessionReq: NewSessionReq?,
) : SessionModel() {
    val server = ServerSvc(this)
    val user = UserSvc(this)

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
        val res = SessionApi(_authenticatedOpenapiClient()).session
        update(null, res)
        res
    }

    fun authenticate(
        authReqs: Map<String, AuthenticateReqAuthReqsValue?>? = null,
        factors: Map<String, String>? = null,
    ): AuthenticateRes = handleErr(this) {
        val res = if (newSessionReq != null) {
            SessionApi(_authenticatedOpenapiClient()).newSession(newSessionReq!!.apply {
                this.factors = factors
                this.authReqs = authReqs
            })
        } else {
            SessionApi(_authenticatedOpenapiClient()).authenticate(AuthenticateReq().apply {
                this.factors = factors
                this.authReqs = authReqs
            })
        }
        if (res.tokens?.access != null) newSessionReq = null
        update(res.tokens, res.session)
        res
    }

    fun confirm(receivedCodes: Map<String, Map<String, String>>): AuthenticateRes = handleErr(this) {
        val res = SessionApi(_authenticatedOpenapiClient()).confirmSessionAuths(
            ConfirmSessionAuthsReq().receivedCodes(receivedCodes))
        update(res.tokens, res.session)
        res
    }

    fun signOut() = handleErr(this) {
        SessionApi(_authenticatedOpenapiClient()).signOut()
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
        return tokens!!.access
    }

    fun newSession(entry: String) = Session(
        client, tokens,
        NewSessionReq().entry(entry).signIn(true),
    )

    fun authorize() = authorize(null)
    fun authorize(rateLimiter: RateLimiterReq?): AuthoriseRes = handleErr(this) {
        AuthorisationApi(_authenticatedOpenapiClient())
            .authorize(AuthoriseReq().rateLimiter(rateLimiter))
    }

    fun _authenticatedOpenapiClient() = if (this.tokens == null) {
        this.client
    } else {
        ApiClient(client.httpClient).apply {
            basePath = client.basePath
            setApiKey(accessToken())
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

    class AuthReqs : LinkedHashMap<String, AuthenticateReqAuthReqsValue?>() {
        fun req(auth: String, req: AuthenticateReqAuthReqsValue?): AuthReqs {
            put(auth, req)
            return this
        }
        fun req(auth: String, req: PasswordAuthenticateReq) = req(auth, req.let(::AuthenticateReqAuthReqsValue))
        fun req(auth: String, req: PasswordUpdateReq?) = req(auth, req.let(::AuthenticateReqAuthReqsValue))
        fun req(auth: String, req: AppSecretReq?) = req(auth, req?.let(::AuthenticateReqAuthReqsValue))
        fun req(auth: String, req: EmailAuthenticateReq) = req(auth, req.let(::AuthenticateReqAuthReqsValue))
        fun req(auth: String, req: EmailUpdateReq?) = req(auth, req?.let(::AuthenticateReqAuthReqsValue))
        fun req(auth: String) = req(auth, mutableMapOf())
        fun req(auth: String, req: OAuthReq?) = req(auth, req?.let(::AuthenticateReqAuthReqsValue))
        fun req(auth: String, req: QuestionsAuthenticateReq) = req(auth, req.let(::AuthenticateReqAuthReqsValue))
        fun req(auth: String, req: QuestionsUpdateReq?) = req(auth, req?.let(::AuthenticateReqAuthReqsValue))
        fun req(auth: String, req: MutableMap<String, Any>?): AuthReqs {
            val reqJson = AuthReqDataJson()
            req?.forEach { (k, v) -> reqJson.putAdditionalProperty(k, v) }
            return req(auth, AuthenticateReqAuthReqsValue(reqJson))
        }
    }
}