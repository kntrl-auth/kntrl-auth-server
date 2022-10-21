import {Kntrl,AuthStatus} from '../.client/node_modules/kntrl-client/index.js';
import Prompt from '../.client/node_modules/prompt-sync/index.js';

const prompt = Prompt({});

async function example() {
  const signUpSession = new Kntrl().newSession({
    entry: 'app',
    signUp: true
  });

  const validatePhone = await signUpSession.authenticate({
    authReqs: {
      sms: {
        phone: '+123 not a phone'
      }
    }
  });
  console.log('Phone validation result:', validatePhone.authRes.sms.err);

  const signUpRes = await signUpSession.authenticate({
    authReqs: {
      sms: {
        phone: '+1-202-555-0167',
        msgType: 'signUp'
      }
    }
  });
  console.log('Phone auth result:', signUpRes.authRes.sms);

  if (signUpRes.authRes.sms.status === AuthStatus.Ok) {
    const confirmAuthRes = await signUpSession.user.confirmAuth({
      receivedCodes: {
        sms: {
          [signUpRes.authRes.sms.sentCode.id]: prompt('Enter received code (shown in plugin-server logs): ')
        }
      }
    });
    console.log('Phone confirmation result:', confirmAuthRes.authRes.sms);
  }
}

example().then(() => {}).catch(err => console.log(err));