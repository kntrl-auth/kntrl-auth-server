import app.kntrl.client.AuthReq;
import app.kntrl.client.Kntrl;
import app.kntrl.client.ReceivedCodes;
import app.kntrl.client.Session;
import app.kntrl.client.openapi.model.AuthExecRes;
import app.kntrl.client.openapi.model.AuthenticateRes;
import app.kntrl.client.openapi.model.SaveUserRes;

import java.util.Scanner;

class Example04 {
    public static void main(String[] args) {
        Session session = new Kntrl().newSession("app", false, true);
        AuthenticateRes signUpRes = session.authenticate(new Session.AuthReqs()
                .req("email", new AuthReq()
                        .email("mail-" + Math.random() + "@example.org")
                        .template("welcome")
                )
        );

        if (signUpRes.getAuthRes().get("email").getStatus().equals(AuthExecRes.StatusEnum.OK)) {
            System.out.println("Email sent, check http://localhost:1080");
        } else {
            System.out.println("Failed to send email " + signUpRes.getAuthRes().get("email").getErr().getDevMsg());
        }


        // Confirming without access token, e.g. from another device
        Scanner scanner = new Scanner(System.in);
        System.out.print("paste user id here: ");
        String userId = scanner.nextLine();
        System.out.print("paste code id here: ");
        String codeId = scanner.nextLine();
        System.out.print("paste code here: ");
        String code = scanner.nextLine();

        SaveUserRes confirmRes = new Kntrl().session().user().confirmAuth(
                userId,
                new ReceivedCodes().received("email", codeId, code)
        );

        if (confirmRes.getAuthRes().get("email").getStatus().equals(AuthExecRes.StatusEnum.OK)) {
            System.out.println("Email confirmed");
        } else {
            System.out.println("Failed to confirm email " + confirmRes.getAuthRes().get("email").getErr().getDevMsg());
        }
    }
}
