import {Kntrl} from '../../.client/node_modules/kntrl-client/index.js';
import Prompt from '../../.client/node_modules/prompt-sync/index.js';

const prompt = Prompt({});

async function example() {
  const username = `John-${Math.random()}`;

  // Sign up with username and password
  const signUpSession = new Kntrl().newSession({
    entry: 'app',
    logins: {
      username
    },
    signUp: true,
  });
  const signUpRes = await signUpSession.authenticate({
    authReqs: {
      password: {},
    }
  });


  try {
    console.log('Although the second factor isn\'t enabled, user can\'t login to the "payment" entry, until email is added');
    await signUpSession.newSession({
      entry: 'payment'
    }).authenticate();
  } catch (e) {
    console.log(e);
  }


  const saveEmailRes = await signUpSession.user.save({
    authReqs: {
      email: {
        email: `mail-${Math.random()}@example.org`
      }
    }
  });
  await signUpSession.user.confirmAuth({
    receivedCodes: {
      email: {
        [saveEmailRes.authRes.email.sentCode.id]: prompt('Enter received code from email (http://localhost:1080): ')
      }
    }
  });

  console.log('Although the second factor isn\'t enabled, the "payment" entry still requires it');
  console.log((await signUpSession.newSession({
    entry: 'payment'
  }).authenticate()).session.nextFactors);
}

example().catch(err => console.log(err));