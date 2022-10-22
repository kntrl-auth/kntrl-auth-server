import {Kntrl} from '../.client/node_modules/kntrl-client/index.js';
import Prompt from '../.client/node_modules/prompt-sync/index.js';

const prompt = Prompt({});

async function example() {
  const email = 'John-' + Math.random();

  const signUpSession = new Kntrl().newSession({
    entry: 'app',
    signUp: true
  });
  // Sign up, enable email auth, password auth and enable second factor
  const signUpRes = await signUpSession.authenticate({
    factors: {
      second: null,
    },
    authReqs: {
      password: {},
      email: {
        email: `${email}@example.com`
      }
    }
  });
  await signUpSession.user.confirmAuth({
    receivedCodes: {
      email: {
        [signUpRes.authRes.email.sentCode.id]: prompt('Enter received code from email (http://localhost:1080): ')
      }
    }
  });


  console.log('<payment requested>...');
  const paymentSession = signUpSession.newSession({
    entry: 'payment'
  });
  await paymentSession.authenticate();
  if (!paymentSession.authenticated) {
    console.log('Factors required:', paymentSession.nextFactors);
    const paymentRes = await paymentSession.authenticate({
      authReqs: {
        // Email field is not required, email will be extracted from user data.
        email: {}
      }
    });
    console.log('Next factors:', paymentSession.nextFactors);
    await paymentSession.confirmAuth({
      receivedCodes: {
        email: {
          [paymentRes.authRes.email.sentCode.id]: prompt('Enter received code from email (http://localhost:1080): ')
        }
      }
    });
    console.log('Authentication status:', paymentSession.authenticated)
  }
}

example().catch(err => console.log(err));