import {Kntrl} from '../.client/node_modules/kntrl-client/index.js';
import Prompt from '../.client/node_modules/prompt-sync/index.js';

const prompt = Prompt({});

async function example() {
  console.log('1. Create or open facebook app: https://developers.facebook.com/apps');
  console.log('2. Edit kntrl.json5, put your app details there. Restart kntrl app.');

  console.log('3. Set appId (aka clientId) and redirectUri here. Don\'t forget, to add redirect-uri on developer page');
  const appId = '<app-id>';
  const redirectUri = 'https://oauthdebugger.com/debug';

  console.log('4. Log in to facebook by link: ' +
    `https://www.facebook.com/v15.0/dialog/oauth?client_id=${appId}&redirect_uri=${encodeURIComponent(redirectUri)}&scope=openid`);

  const authorizationCode = prompt("Enter authorization code: ");

  // Backend code
  const session = new Kntrl().newSession({
    entry: 'app',
    // Sign in if account exists
    signIn: true,
    // Create new account if not exists
    signUp: true
  });

  const res = await session.authenticate({
    authReqs: {
      facebook: {
        authorizationCode,
        redirectUri
      }
    }
  });

  console.log('Facebook auth result:', res.authRes.facebook);
  console.log('New user:', res.user.new);
}

example().catch(err => console.log(err));