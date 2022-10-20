package kntrl.example.pluginserver;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import kntrl.example.generated.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my/api/auth-plugins/sms/plugin/auth")
public class SmsAuthController {

    @PostMapping("authenticate/dry-run")
    DryRunAuthRes authenticateDryRun(AuthReq req) {
        new AuthRes()
                .authData(new AuthResAuthData()
                        ._private(new AuthDataPrivate().)
                )
        PhoneNumberUtil.getInstance().parse()
    }

    @PostMapping("authenticate")
    AuthRes authenticate(AuthReq req) {

    }

    @PostMapping("update/dry-run")
    DryRunAuthRes updateAuthDryRun(AuthReq req) {

    }

    @PostMapping("update")
    AuthRes updateAuth(AuthReq req) {

    }

    private DryRunAuthRes dryRun(AuthReq req) {
        try {
            String phone = req.getReqData().
            PhoneNumberUtil.getInstance().parse(req.getReqData())
        }
    }

    @ExceptionHandler({ AuthPluginException.class })
    ResponseEntity<PluginClientErr> onError(AuthPluginException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getErr());
    }

    public static class AuthPluginException extends Exception {
        private final PluginClientErr err;

        public AuthPluginException(PluginClientErr err) {
            this.err = err;
        }

        public PluginClientErr getErr() {
            return err;
        }
    }

    public static class SmsPluginData extends AuthResResData {
        private final String phone;

        public SmsPluginData(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return phone;
        }
    }
}
