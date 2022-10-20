package kntrl.example.pluginserver;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import kntrl.example.generated.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.function.Supplier;

@RestController
@RequestMapping("/my/api/auth-plugins/sms/plugin/auth")
public class SmsAuthController {
    private final static String REQ_DATA_PHONE = "phone";
    private final static String REQ_DATA_MSG_TYPE = "msgType";

    private final static String DRY_RUN_RES_PHONE = "phone";
    private final static String PUBLIC_DATA_PHONE = "phone";

    @PostMapping("authenticate/dry-run")
    DryRunAuthRes authenticateDryRun(AuthReq req) {
        return logRequest("authenticate/dry-run", req, () -> dryRun(req));
    }

    @PostMapping("authenticate")
    AuthRes authenticate(AuthReq req) {
        return logRequest("authenticate", req, () -> sendAuthSms(req));
    }

    @PostMapping("update/dry-run")
    DryRunAuthRes updateAuthDryRun(AuthReq req) {
        return logRequest("update/dry-run", req, () -> dryRun(req));
    }

    @PostMapping("update")
    AuthRes updateAuth(AuthReq req) {
        return logRequest("update", req, () -> sendAuthSms(req));
    }

    @ExceptionHandler({ AuthPluginException.class })
    ResponseEntity<PluginClientErr> onError(AuthPluginException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getErr());
    }

    private DryRunAuthRes dryRun(AuthReq req) {
        String phone = Optional.of(req.getReqData().get(REQ_DATA_PHONE))
                .map(Object::toString)
                .map(SmsAuthController::parsePhone)
                .orElseThrow(() -> AuthPluginException.incorrectRequest);

        AuthResResData res = new AuthResResData();
        res.put(DRY_RUN_RES_PHONE, phone);

        return new DryRunAuthRes()
                .authData(new DryRunAuthResAuthData().login(phone))
                .resData(res);
    }

    private static AuthRes sendAuthSms(AuthReq req) {
        String parsedPhone = ((String) req.getDryRunAuthResData().get(DRY_RUN_RES_PHONE));

        sendSms(parsedPhone, req.getCodeToSend().getCode(), req.getReqData());

        AuthDataPublic publicData = new AuthDataPublic();
        publicData.put(PUBLIC_DATA_PHONE, parsedPhone);

        AuthResResData res = new AuthResResData();
        res.put(DRY_RUN_RES_PHONE, parsedPhone);

        return new AuthRes()
                .authData(new AuthResAuthData()
                        ._public(publicData)
                        .login(parsedPhone))
                .resData(res);
    }

    private static String parsePhone(String phoneRaw) {
        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
        try {
            Phonenumber.PhoneNumber phoneNumber = phoneUtil.parse(phoneRaw, "US");

            if (!phoneUtil.isValidNumber(phoneNumber)) throw AuthPluginException.incorrectPhone;

            return phoneUtil.format(phoneNumber, PhoneNumberUtil.PhoneNumberFormat.E164);
        } catch (NumberParseException e) {
            throw AuthPluginException.notAPhoneNumber;
        }
    }

    private static void sendSms(String phone, String code, AuthReqReqData reqData) {
        String text = createSmsMessage(reqData) + code;
        System.out.println("Sending sms to " + phone + "...");
        System.out.println("Sms: " + text);
        System.out.println("Sms sent.");
    }

    private static String createSmsMessage(AuthReqReqData reqData) {
        String messageType = reqData.get(REQ_DATA_MSG_TYPE).toString();
        switch (messageType) {
            case "signInOrUp": return "To confirm phone number, enter the code: ";
            case "payment": return "To confirm payment for, enter the code: ";
            default: return "To confirm action, enter the code: ";
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
        public static AuthPluginException incorrectPhone =
                new AuthPluginException("PHONE_NUMBER_IS_INCORRECT", "Incorrect phone number");
        public static AuthPluginException notAPhoneNumber =
                new AuthPluginException("PHONE_NUMBER_IS_INCORRECT", "Not a phone number");

        private final PluginClientErr err;

        public AuthPluginException(String code, String devMsg) {
            this.err = new PluginClientErr().code(code).devMsg(devMsg);
        }

        public PluginClientErr getErr() {
            return err;
        }
    }
}
