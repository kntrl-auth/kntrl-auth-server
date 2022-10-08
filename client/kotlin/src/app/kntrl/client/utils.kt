package app.kntrl.client

import app.kntrl.client.generated.infra.ApiException
import app.kntrl.client.generated.model.AnyErr

fun <T> handleErr(action: () -> T): T {
    fun parseAnyErr(ex: ApiException): Nothing = try {
        throw KntrlErr(AnyErr.fromJson(ex.responseBody))
    } catch (th: Throwable) {
        throw ex
    }

    try {
        return action()
    } catch (ex: ApiException) {
        parseAnyErr(ex)
    }
}

class KntrlErr(val err: AnyErr) : RuntimeException("Kntrl api error")


class ReceivedCodes : LinkedHashMap<String, MutableMap<String, String>>() {
    fun received(auth: String, codeId: String, code: String) {
        computeIfAbsent(auth) { LinkedHashMap() }[codeId] = code
    }
}