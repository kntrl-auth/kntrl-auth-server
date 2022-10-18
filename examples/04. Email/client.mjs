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
    console.log(`Email sent, check http://localhost:1080`)
  } else {
    console.log(`Failed to send email "${res.authRes.email.err.devMsg}"`)
  }
}

// Confirm email
async function example2() {
  // const sessionId = '<paste session id here>'
  // const codeId = '<paste code id here>'
  // const code = '<paste code here>'

  const sessionId = '1ed4ed2b-366f-62da-bd45-c3da6756c93d'
  const codeId = '1n8u8M3LyrbHBUJVUfSxfObr2rFkrAuSnz7F5e7N3USy8YKwrmBRKYT1bA1aHhE1TZx1YFYUScFxIvhON'
  const code = '244649'

  await new Kntrl().session().confirmAuth({
    sessionId,
    receivedCodes: {
      email: {
        [codeId]: code
      }
    }
  });
}

// example1().then(() => {}).catch(err => console.log(err));
example2().then(() => {}).catch(err => console.log(err));