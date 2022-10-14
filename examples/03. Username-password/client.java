import app.kntrl.client.Kntrl;
import app.kntrl.client.Session;
import app.kntrl.client.generated.model.AuthExecRes;
import app.kntrl.client.generated.model.AuthenticateRes;
import app.kntrl.client.generated.model.ErrCode;

class Example03 {
    public static void main(String[] args) {
        String login = "John-" + Math.random();

        Session signUpSession = new Kntrl().newSession(
                "app",
                new Kntrl.Logins().login("username", login),
                false,
                true
        );
        AuthenticateRes signUpRes = signUpSession.authenticate(
                new Session.AuthReqs().req("password", new Session.AuthReq()
                        .password("Abcdef1@")
                        .confirmPassword("Abcdef1@")),

//                Confirm password field is not required
//                new Session.AuthReqs().req("password", new Session.AuthReq().password("Abcdef1@")),

//                Password can be generated automatically
//                new Session.AuthReqs().req("password", new Session.AuthReq()),
                null
        );
        System.out.println(
                signUpRes.getAuthRes().get("password").getResData().getPassword() + " - " +
                signUpRes.getAuthRes().get("password").getResData().getStrength()
        );


        Session signInSession = new Kntrl().newSession(
                "app",
                new Kntrl.Logins().login("username", login),
                true,
                false
        );
        AuthenticateRes signInRes = signInSession.authenticate(
                new Session.AuthReqs().req("password", new Session.AuthReq().password("1234")),
                null
        );
        AuthExecRes passwordAuthRes = signInRes.getAuthRes().get("password");
        if (passwordAuthRes.getStatus() != AuthExecRes.StatusEnum.OK) {
            // handle password error
            System.out.println(passwordAuthRes.getErr().getMsg());
            if (passwordAuthRes.getErr().getCode().equals(ErrCode.PASSWORD_IS_INCORRECT.getValue())) {
                System.out.println("Incorrect password");
            }
        }
    }
}
