import {Kntrl,AuthStatus} from '../.client/node_modules/kntrl-client/index.js';
import Prompt from '../.client/node_modules/prompt-sync/index.js';

const prompt = Prompt({});

// Sign up
async function example() {
  const signUpSession = new Kntrl().newSession({
    entry: 'app',
    signUp: true
  });

  const validatePhone = await signUpSession.authenticate({
    authReqs: {
      phone: {
        phone: 'not a phone'
      }
    }
  });
  console.log('Phone validation result:', validatePhone.authRes.phone.err);

  const signUpRes = await signUpSession.authenticate({
    authReqs: {
      phone: {
        phone: '+1-202-555-0167',
        msgType: 'signUp'
      }
    }
  });
  console.log('Phone auth result:', signUpRes.authRes.phone);

  if (signUpRes.authRes.phone.status === AuthStatus.Ok) {
    const confirmAuthRes = await signUpSession.user.confirmAuth({
      receivedCodes: {
        phone: {
          [signUpRes.authRes.phone.sentCode.id]: prompt('Enter received code (shown in plugin-server logs): ')
        }
      }
    });
    console.log('Phone confirmation result:', confirmAuthRes.authRes.phone);
  }
}

// Sign in
async function example2() {
  // Use phone number as a login
  const identifyByLoginSession = new Kntrl().newSession({
    entry: 'app',
    logins: {
      phone: '+12025550167'
    },
    signIn: true
  });
  const phoneAsALoginRes = await identifyByLoginSession.authenticate();
  console.log('Required factors after identification by phone:', phoneAsALoginRes.session.nextFactors)

  // Phone field is not required (will be extracted from auth-data)
  let authResult = await identifyByLoginSession.authenticate({
    authReqs: {
      phone: {}
    }
  });
  console.log(authResult.authRes.phone.status, authResult.session.unconfirmedAuths.phone);


  // Use auth for identification (login is extracted during dry-run)
  const identifyByAuthSession = new Kntrl().newSession({
    entry: 'app',
    signIn: true
  });
  authResult = await identifyByAuthSession.authenticate({
    authReqs: {
      phone: {
        phone: '+1-202-555-0167'
      }
    }
  });
  console.log(authResult.authRes.phone.status, authResult.session.unconfirmedAuths.phone);
}

example().then(example2).catch(err => console.log(err))