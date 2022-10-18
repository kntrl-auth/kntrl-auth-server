package app.kntrl.client

 import app.kntrl.client.generated.infra.ApiException
 import app.kntrl.client.generated.model.Err
 import app.kntrl.client.generated.model.ErrCode

fun <T> handleErr(
    retryOnExpiredTokenOn: Session? = null,
    action: () -> T,
): T {
    fun parseAnyErr(ex: ApiException): T = try {
        val kntrlEx = KntrlException(Err.fromJson(ex.responseBody))

        if (kntrlEx.code == ErrCode.TOKEN_EXPIRED.value && retryOnExpiredTokenOn != null) {
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

class KntrlException(val data: Err) : RuntimeException("Kntrl API error (${data.code}): ${data.devMsg}") {
    val code: String = data.code
    val devMsg: String = data.devMsg
    val msg: String? = data.msg
}

class ReceivedCodes : LinkedHashMap<String, MutableMap<String, String>>() {
    fun received(auth: String, codeId: String, code: String): ReceivedCodes {
        computeIfAbsent(auth) { LinkedHashMap() }[codeId] = code
        return this
    }
}