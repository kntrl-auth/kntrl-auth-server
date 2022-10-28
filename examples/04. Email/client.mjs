import {AuthStatus, Kntrl} from '../.client/node_modules/kntrl-client/index.js';
import Prompt from '../.client/node_modules/prompt-sync/index.js';

const prompt = Prompt({});

// Sign up with email
async function example() {
  const session = new Kntrl().newSession({
    entry: 'app',
    signUp: true,
  });
  const signUpRes = await session.authenticate({
    authReqs: {
      email: {
        email: `mail-${Math.random()}@example.org`,
        template: 'welcome'
      }
    }
  });
  if (signUpRes.authRes.email.status === AuthStatus.Ok) {
    console.log(`Email sent, check http://localhost:1080`);
  } else {
    console.log(`Failed to send email "${signUpRes.authRes.email.err.devMsg}"`);
    return;
  }


  // Confirming without access token, e.g. from another device
  const userId = prompt('paste user id here: ');
  const codeId = prompt('paste code id here: ');
  const code = prompt('paste code here: ');

  const confirmRes = await new Kntrl().session().user.confirmAuth({
    userId,
    receivedCodes: {
      email: {
        [codeId]: code
      }
    }
  });

  if (confirmRes.authRes.email.status === AuthStatus.Ok) {
    console.log(`Email confirmed`)
  } else {
    console.log(`Failed to confirm email "${confirmRes.authRes.email.err.devMsg}"`)
  }
}

example().catch(err => console.log(err));