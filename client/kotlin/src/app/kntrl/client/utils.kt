package app.kntrl.client

import app.kntrl.client.generated.infra.ApiException
import app.kntrl.client.generated.model.AnyErr
import app.kntrl.client.generated.model.ClientErr
import app.kntrl.client.generated.model.Err

fun <T> handleErr(action: () -> T): T {
    fun parseAnyErr(ex: ApiException): Nothing = try {
        throw KntrlErr(AnyErr.fromJson(ex.responseBody))
    } catch (th: Throwable) {
        throw ex
    }

    fun parseErr(ex: ApiException): Nothing = try {
        throw KntrlErr(Err.fromJson(ex.responseBody))
    } catch (th: Throwable) {
        parseAnyErr(ex)
    }

    try {
        return action()
    } catch (ex: ApiException) {
        parseErr(ex)
    }
}

class KntrlErr(val err: Err) : RuntimeException("Kntrl api error") {
    val clientErr: ClientErr? = err as? ClientErr
}


class ReceivedCodes : LinkedHashMap<String, MutableMap<String, String>>() {
    fun received(auth: String, codeId: String, code: String) {
        computeIfAbsent(auth) { LinkedHashMap() }[codeId] = code
    }
}