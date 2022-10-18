import app.kntrl.client.Kntrl;
import app.kntrl.client.ReceivedCodes;
import app.kntrl.client.Session;
import app.kntrl.client.generated.model.AuthExecRes;
import app.kntrl.client.generated.model.AuthenticateRes;
import app.kntrl.client.generated.model.SaveUserRes;

class Example04 {
    public static void main(String[] args) {
        exampleSignUp();
//        exampleConfirmAuth();
    }

    // Sign up with email
    static void exampleSignUp() {
        Session session = new Kntrl().newSession("app", false, true);
        AuthenticateRes res = session.authenticate(new Session.AuthReqs()
              .req("email", new Session.AuthReq()
                      .email("mail-" + Math.random() + "@example.org")
                      .template("welcome")
              )
        );

        if (res.getAuthRes().get("email").getStatus().equals(AuthExecRes.StatusEnum.OK)) {
            System.out.println("Email sent, check http://localhost:1080");
        } else {
            System.out.println("Failed to send email " + res.getAuthRes().get("email").getErr().getDevMsg());
        }
    }

    // Confirm email
    static void exampleConfirmAuth() {
        String userId = "<paste user id here>";
        String codeId = "<paste code id here>";
        String code = "<paste code here>";

        SaveUserRes res = new Kntrl().session().user().confirmAuth(
                userId,
                new ReceivedCodes().received("email", codeId, code)
        );

        if (res.getAuthRes().get("email").getStatus().equals(AuthExecRes.StatusEnum.OK)) {
            System.out.println("Email confirmed");
        } else {
            System.out.println("Failed to confirm email " + res.getAuthRes().get("email").getErr().getDevMsg());
        }
    }
}
