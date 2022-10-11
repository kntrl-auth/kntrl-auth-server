package app.kntrl.client

import app.kntrl.client.generated.infra.ApiException
import app.kntrl.client.generated.model.AnyErr

fun <T> handleErr(action: () -> T): T {
    fun parseAnyErr(ex: ApiException): Nothing = try {
        throw KntrlException(AnyErr.fromJson(ex.responseBody))
    } catch (th: Throwable) {
        throw ex
    }

    try {
        return action()
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