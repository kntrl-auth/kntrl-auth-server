import {Kntrl} from '../../.client/node_modules/kntrl-client/index.js';
import Prompt from '../../.client/node_modules/prompt-sync/index.js';

const prompt = Prompt({});

async function example() {
  const email = `mail-${Math.random()}@example.org`;

  // Sign up with email
  const signUpSession = new Kntrl().newSession({
    entry: 'app',
    signUp: true,
  });
  const signUpRes = await signUpSession.authenticate({
    factors: {
      // Enable a second factor during sign-up
      second: null
    },
    authReqs: {
      password: {},
      email: { email },
      // Adding current IP by IP auth
      ip: {}
    }
  });
  await signUpSession.user.confirmAuth({
    receivedCodes: {
      email: {
        [signUpRes.authRes.email.sentCode.id]: prompt('Enter received code from email (http://localhost:1080): ')
      }
    }
  });


  console.log('Email auth is skipped because the same IP:', (await new Kntrl().newSession({
    entry: 'app',
    logins: {
      // Because the email auth is not listed in the first factor, it must be explicitly provided as login.
      email
    },
    signIn: true,
  }).authenticate({
    authReqs: {
      password: {
        // Use the generated password from the sign-up session
        password: signUpRes.authRes.password.resData.password
      },
      email: {
        email
      },
      ip: {}
    }
  })).authRes);
}

example().catch(err => console.log(err));