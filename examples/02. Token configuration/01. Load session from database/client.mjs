import {Kntrl} from '../../.client/node_modules/kntrl-client/index.js';

async function example() {
  const tokens = await loadSessionTokens();
  console.log(tokens.access)

  const session = new Kntrl().session(tokens);
  // This line will likely be used on backend to validate the session.
  await session.authorize();

  await session.signOut();

  try {
    // Session is expired after sign-out.
    await session.authorize();
  } catch (err) {
    console.log(err.code);
  }
}

async function loadSessionTokens() {
  /*
    In real world you will likely load previously received tokens from local storage
    e.g.
    const tokens = {
      access: localStorage.getItem('access-token'),
      refresh: localStorage.getItem('refresh-token'),
    };
  */

  const signUpSession = new Kntrl().newSession({
    entry: 'app',
    logins: {
      username: `John-${Math.random()}`,
    },
    signUp: true,
  });
  const signUpRes = await signUpSession.authenticate({
    authReqs: {
      password: {}
    }
  });
  return signUpRes.tokens;
}

example().catch(err => console.log(err));