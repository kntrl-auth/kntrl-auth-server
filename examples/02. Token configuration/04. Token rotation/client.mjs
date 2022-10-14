import {Kntrl} from '../../.client/node_modules/kntrl-client/index.js';

async function example() {
  const tokens = await loadSessionTokens();
  console.log(tokens.access)
  console.log(tokens.refresh)

  const session = new Kntrl().session(tokens);

  // In JS sdk tokens are rotated automatically as long as refresh token provided above, no action needed
  await session.authorize();

  // But anyway session can be refreshed manually
  await session.refreshAccessToken()
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
      password: {
        password: 'Abcdef1@'
      }
    }
  });
  return signUpRes.tokens;
}

example().then(() => {}).catch(err => console.log(err));