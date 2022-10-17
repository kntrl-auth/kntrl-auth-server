import {Kntrl, AuthStatus} from '../.client/node_modules/kntrl-client/index.js';

// Sign up with email
async function example1() {
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
    console.log('Email sent, check http://localhost:1080')
  } else {
    console.log(`Failed to send email "${res.authRes.email.err.devMsg}"`)
  }
}

example1().then(() => {}).catch(err => console.log(err));
// example2().then(() => {}).catch(err => console.log(err));