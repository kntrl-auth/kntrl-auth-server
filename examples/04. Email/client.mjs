import {AuthStatus, Kntrl} from '../.client/node_modules/kntrl-client/index.js';

// Sign up with email
async function exampleSignUp() {
  const session = new Kntrl().newSession({
    entry: 'app',
    signUp: true,
  });
  const res = await session.authenticate({
    authReqs: {
      email: {
        email: `mail-${Math.random()}@example.org`,
        template: 'welcome'
      }
    }
  });
  if (res.authRes.email.status === AuthStatus.Ok) {
    console.log(`Email sent, check http://localhost:1080`)
  } else {
    console.log(`Failed to send email "${res.authRes.email.err.devMsg}"`)
  }
}

// Confirm email
async function exampleConfirmAuth() {
  const userId = '<paste user id here>';
  const codeId = '<paste code id here>';
  const code = '<paste code here>';

  const res = await new Kntrl().session().user.confirmAuth({
    userId,
    receivedCodes: {
      email: {
        [codeId]: code
      }
    }
  });

  if (res.authRes.email.status === AuthStatus.Ok) {
    console.log(`Email confirmed`)
  } else {
    console.log(`Failed to confirm email "${res.authRes.email.err.devMsg}"`)
  }
}

exampleSignUp().then(() => {}).catch(err => console.log(err));
// exampleConfirmAuth().then(() => {}).catch(err => console.log(err));