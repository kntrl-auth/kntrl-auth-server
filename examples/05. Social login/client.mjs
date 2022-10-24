import {Kntrl} from '../.client/node_modules/kntrl-client/index.js';
import Prompt from '../.client/node_modules/prompt-sync/index.js';

const prompt = Prompt({});

async function example() {
  console.log('1. Create or open facebook app: https://developers.facebook.com/apps');
  console.log('2. Edit kntrl.json5, put your app details there.');

  console.log('3. Set appId (aka clientId) and redirectUri here');
  const appId = '394838444474913';
  const redirectUri = 'https://example.org';

  console.log('4. Login to facebook by link: ' +
    `https://www.facebook.com/v15.0/dialog/oauth?client_id=${appId}&redirect_uri=${redirectUri}`);

  console.log('5. Set authorizationCode (code query param from url after facebook redirect)');
  const authorizationCode = 'AQDxGgaStTvSYyWicC6-LWZHl8d3zT19oIoiOAVykpg5ahjwUOQigReIKoe8Hg8o7c5MSJIMwKC08LWsgAc1VExIIiwhHA-Jzq8E3B_w6CsK1Zn2SaTD2_piaCx6_pBV4w-3PcvN3LdiI80-hUmfyVElS5h4XZmazpE7CppsmgcQc6BSzeVBU18Vaf18qO5TOLkSFEGpoTHwU8sCb2woQyywVtSgdTerathK6aiJ1ZtndF-A3evuSOmINNQn8VO10AHz_Qu3_V33gjhrcTlhuMv9UkUVBzOAnAC-2BbHqq6Pdpl00WzicF95kTrGNhEiLGUUy-fnCtuVhQqNCmBOWGZRTh_z35wteUeTpXbvpQHr1l-ZZLq2Fc4NsLugZy1zkgo#_=_'

  // Backend code
  const session = new Kntrl().newSession({
    entry: 'app',
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
}

example().catch(err => console.log(err));