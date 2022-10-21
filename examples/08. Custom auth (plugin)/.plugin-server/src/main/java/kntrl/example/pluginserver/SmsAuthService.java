package kntrl.example.pluginserver;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import kntrl.example.generated.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

@RestController
@RequestMapping("/my/api/auth-plugins/sms/plugin/auth")
public class SmsAuthService {
    private final static String REQ_DATA_PHONE = "phone";
    private final static String REQ_DATA_MSG_TYPE = "msgType";

    private final static String RES_DATA_PHONE = "phone";
    private final static String PUBLIC_DATA_PHONE = "phone";

    @PostMapping("authenticate/dry-run")
    DryRunAuthRes authenticateDryRun(@RequestBody AuthReq req) {
        return logRequest("authenticate/dry-run", req, () -> dryRun(req, false));
    }

    @PostMapping("authenticate")
    AuthRes authenticate(@RequestBody AuthReq req) {
        return logRequest("authenticate", req, () -> sendAuthSms(req));
    }

    @PostMapping("update/dry-run")
    DryRunAuthRes updateAuthDryRun(@RequestBody AuthReq req) {
        return logRequest("update/dry-run", req, () -> dryRun(req, true));
    }

    @PostMapping("update")
    AuthRes updateAuth(@RequestBody AuthReq req) {
        return logRequest("update", req, () -> sendAuthSms(req));
    }

    @ExceptionHandler({ AuthPluginException.class })
    ResponseEntity<Map<String, String>> onError(AuthPluginException ex) {
        System.out.println("Error: " + ex.getErr());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getErr());
    }

    private DryRunAuthRes dryRun(AuthReq req, Boolean isUpdate) {
        Optional<String> phoneFromReq = Optional.of(req.getReqData().get(REQ_DATA_PHONE))
                .map(Object::toString)
                .map(SmsAuthService::parsePhone);

        String phone;
        if (isUpdate) {
            // When updating phone, new phone must be present in the request.
            phone = phoneFromReq.orElseThrow(() -> AuthPluginException.incorrectRequest);
        } else {
            // When authenticating using phone, phone can be taken from request (identification) or from auth data
            // (action confirmation)
            Optional<String> phoneFromAuthData = Optional.of(req.getAuthData())
                    .map(authData -> (String) authData.getPublic().get(PUBLIC_DATA_PHONE));
            if (phoneFromAuthData.isPresent() && phoneFromReq.isPresent()
                    && !phoneFromAuthData.get().equals(phoneFromReq.get())) {
                throw AuthPluginException.incorrectPhone;
            }
            phone = phoneFromAuthData.or(() -> phoneFromReq).orElseThrow(() -> AuthPluginException.incorrectRequest);
        }

        return new DryRunAuthRes()
                .authData(new DryRunAuthResAuthData().login(phone))
                .resData(Map.of(RES_DATA_PHONE, phone));
    }

    private static AuthRes sendAuthSms(AuthReq req) {
        // Phone is already parsed during dry-run
        String parsedPhone = ((String) req.getDryRunAuthResData().get(RES_DATA_PHONE));

        sendSms(parsedPhone, req.getCodeToSend().getCode(), req.getReqData());

        return new AuthRes()
                .authData(new AuthResAuthData()
                        ._public(Map.of(PUBLIC_DATA_PHONE, parsedPhone))
                        ._private(Map.of())
                        .login(parsedPhone))
                .resData(Map.of(RES_DATA_PHONE, parsedPhone));
    }

    private static String parsePhone(String phoneRaw) {
        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
        try {
            Phonenumber.PhoneNumber phoneNumber = phoneUtil.parse(phoneRaw, "US");

            if (!phoneUtil.isValidNumber(phoneNumber)) throw AuthPluginException.invalidPhone;

            return phoneUtil.format(phoneNumber, PhoneNumberUtil.PhoneNumberFormat.E164);
        } catch (NumberParseException e) {
            throw AuthPluginException.notAPhoneNumber;
        }
    }

    private static void sendSms(String phone, String code, Map<String, Object> reqData) {
        String text = createSmsMessage(reqData) + code;
        System.out.println("Sending sms to " + phone + "...");
        System.out.println("Sms: " + text);
        System.out.println("Sms sent.");
    }

    private static String createSmsMessage(Map<String, Object> reqData) {
        String messageType = Optional.of(reqData.get(REQ_DATA_MSG_TYPE))
                .map(Object::toString)
                .orElse("default");
        switch (messageType) {
            case "signUp": return "To confirm the phone number, enter the code: ";
            case "payment": return "To confirm the payment, enter the code: ";
            default: return "To confirm the action, enter the code: ";
        }
    }

    private static <RS> RS logRequest(String actionName, Object rq, Supplier<RS> action) {
        System.out.println("Handling " + actionName + " request: " + rq);
        RS res = action.get();
        System.out.println("Response: " + res);
        return res;
    }

    public static class AuthPluginException extends RuntimeException {
        public static AuthPluginException incorrectRequest =
                new AuthPluginException("INTEGRATION_ERR", "Incorrect sms auth request");
        public static AuthPluginException invalidPhone =
                new AuthPluginException("PHONE_NUMBER_IS_INVALID", "Invalid phone number");
        public static AuthPluginException notAPhoneNumber =
                new AuthPluginException("PHONE_NUMBER_IS_INVALID", "Not a phone number");
        public static AuthPluginException incorrectPhone =
                new AuthPluginException("PHONE_NUMBER_IS_INCORRECT", "Incorrect phone number");

        private final Map<String, String> err;

        public AuthPluginException(String code, String devMsg) {
            this.err = Map.of(
                    PluginClientErrProps.CODE.toString(), code,
                    PluginClientErrProps.DEVMSG.toString(), devMsg
            );
        }

        public Map<String, String> getErr() {
            return err;
        }
    }
}
