import {Kntrl} from '../.client/node_modules/kntrl-client/index.js';

async function example() {
  const username = `John-${Math.random()}`;

  const signUpSession = new Kntrl().newSession({
    entry: 'app',
    logins: { username },
    signUp: true,
  });
  await signUpSession.authenticate({
    authReqs: {
      password: {},
    }
  });

  // This request will be delayed because of alignLoad enabled
  console.log('Request is delayed (max: 5 seconds), wait...');
  const signInSession = new Kntrl().newSession({
    entry: 'app',
    logins: { username },
    signIn: true,
  });
  console.log('Requested password auth result:', (await signInSession.authenticate({
    authReqs: {
      password: {
        password: 'This is a wrong password'
      },
    }
  })).authRes.password);

  console.log('Another attempt to guess password, without waiting enough time:', (await signInSession.authenticate({
    authReqs: {
      password: {
        password: 'This is a wrong password'
      },
    }
  })).authRes.password);

  // Server side: manual use of limiter
  console.log(
    'Limiter requires user-id, so session will be loaded and provided:',
    (await signUpSession.rateLimiter.limit({
      id: 'long',
      quotaToBurn: 0.1
    })).session.id
  );
  try {
    await signUpSession.authorize({
      rateLimiter: {
        id: 'short',
        quotaToBurn: 1.0
      }
    });
  } catch (e) {
    console.log('Authorize request result:', e);
  }
}

example().catch(err => console.log(err));