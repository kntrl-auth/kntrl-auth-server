import {Kntrl} from '../.client/node_modules/kntrl-client/index.js';

async function example() {
  const session = new Kntrl().newSession({
    entry: 'app',
    logins: {
      username: `John-${Math.random()}`
    },
    signUp: true,
  });
  await session.authenticate({
    authReqs: {
      password: {},
    }
  });

  // Generate new API-key
  // As user already authenticated and no factors specified in 'apiKey' entry config,
  // no additional authentication is required
  let res = await session.newSession({
    entry: 'apiKey'
  }).authenticate();
  console.log('Access token:', res.tokens.access);

  // List all API keys
  console.log('All sessions:', await session.allSessions('apiKey'));

  // Remove session
  await session.signOut(res.session.id);
  console.log('All sessions after remove:', await session.allSessions('apiKey'));
}

example().catch(err => console.log(err));