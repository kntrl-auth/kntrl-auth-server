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
    authReqs: {
      password: {},
      email: { email }
    }
  });
  await signUpSession.user.confirmAuth({
    receivedCodes: {
      email: {
        [signUpRes.authRes.email.sentCode.id]: prompt('Enter received code from email (http://localhost:1080): ')
      }
    }
  });


  console.log('Next factors before enabling second factor:', (await new Kntrl().newSession({
    entry: 'app',
    logins: {
      email,
    },
    signIn: true,
  }).authenticate()).session.nextFactors);

  await signUpSession.user.save({
    factors: {
      second: true
    }
  });
  console.log('Next factors after enabling second factor:', (await new Kntrl().newSession({
    entry: 'app',
    logins: {
      email
    },
    signIn: true,
  }).authenticate()).session.nextFactors);
}

example().catch(err => console.log(err));