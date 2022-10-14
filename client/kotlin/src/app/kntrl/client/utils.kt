package app.kntrl.client

 import app.kntrl.client.generated.infra.ApiException
 import app.kntrl.client.generated.model.AnyErr
 import app.kntrl.client.generated.model.Err

fun <T> handleErr(
    retryOnExpiredTokenOn: Session? = null,
    action: () -> T,
): T {
    fun parseAnyErr(ex: ApiException): T = try {
        val err = Err.fromJson(ex.responseBody);
        val kntrlEx = KntrlException(AnyErr.fromJson(ex.responseBody), err)

        if (err.code == "TOKEN_EXPIRED" && retryOnExpiredTokenOn != null) {
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
    private val anyErr: AnyErr,
    val err: Err,
) : RuntimeException("Kntrl API error (${err.code}): ${err.devMsg}"),
    Map<String, Any> by anyErr.additionalProperties {

    val code: String = err.code
    val devMsg: String = err.devMsg
    val msg: String? = err.msg
}

class ReceivedCodes : LinkedHashMap<String, MutableMap<String, String>>() {
    fun received(auth: String, codeId: String, code: String) {
        computeIfAbsent(auth) { LinkedHashMap() }[codeId] = code
    }
}