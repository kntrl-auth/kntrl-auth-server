package app.kntrl.client

import app.kntrl.client.generated.infra.ApiException
import app.kntrl.client.generated.model.AnyErr

fun <T> handleErr(
    retryOnExpiredTokenOn: Session? = null,
    action: () -> T,
): T {
    fun parseAnyErr(ex: ApiException): T = try {
        val anyErr = AnyErr.fromJson(ex.responseBody);
        val kntrlEx = KntrlException(AnyErr.fromJson(ex.responseBody))

        if (anyErr.code == "TOKEN_EXPIRED" && retryOnExpiredTokenOn != null) {
            retryOnExpiredTokenOn.refreshAccessToken(null, kntrlEx)
            handleErr(null, action)
        } else {
            throw kntrlEx
        }
    } catch (th: Throwable) {
        throw th as? KntrlException ?: ex
    }

    return try {
        action()
    } catch (ex: ApiException) {
        parseAnyErr(ex)
    }
}

class KntrlException(
    private val err: AnyErr,
) : RuntimeException("Kntrl API error (${err.code}): ${err.devMsg}"),
    Map<String, Any> by err.additionalProperties {

    val code: String = err.code
    val devMsg: String = err.devMsg
    val msg: String? = err.msg
}

class ReceivedCodes : LinkedHashMap<String, MutableMap<String, String>>() {
    fun received(auth: String, codeId: String, code: String) {
        computeIfAbsent(auth) { LinkedHashMap() }[codeId] = code
    }
}