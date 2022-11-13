import {ClientErrCode, Kntrl} from '../.client/node_modules/kntrl-client/index.js';

class ThisApp {
  username = `John-${Math.random()}`;
  oAuthApp;

  async createUser() {
    const session = new Kntrl().newSession({
      entry: 'app',
      logins: {
        username: this.username,
      },
      signUp: true,
    });
    await session.authenticate({
      authReqs: {
        password: {
          password: 'Abcdef1@'
        }
      }
    });
  }

  async createOAuthApp() {
    // Because app can belong to a project rather than to a user, OAuth app is a separate user.
    const session = new Kntrl().newSession({
      entry: 'oauthApp',
      signUp: true,
    });
    this.oAuthApp = (await session.authenticate({
      authReqs: {
        oauthApp: {
          redirectUris: [ 'localhost:8080' ],
        }
      }
    })).authRes.oauthApp.resData;
  }

  async openAuthorizationUrl(clientId, redirectUri, scopes, implicitFlow) {
    // Usually it's a frontend that logs in a user.

    // Validate client id.
    const verifyApp = async () => {
      const appSession = new Kntrl().newSession({
        entry: 'oauthApp',
        signIn: true,
      });
      // This will fail because of absence of client-secret, but it's ok, we just need to validate clientId and redirectUri
      const appAuthRes = await appSession.authenticate({
        authReqs: {
          oauthApp: {
            clientId,
            redirectUri,
          }
        }
      });
      if (appAuthRes.authRes.oauthApp.err.code === ClientErrCode.UserNotFound) throw 'Incorrect client-id';
      if (appAuthRes.authRes.oauthApp.err.incorrectRedirectUri) throw 'Incorrect redirect-uri';
    }

    const logInUser = async () => {
      const session = new Kntrl().newSession({
        entry: 'app',
        logins: {
          username: this.username,
        },
        signIn: true,
      });
      await session.authenticate({
        authReqs: {
          password: {
            password: 'Abcdef1@'
          }
        }
      });
      return session;
    }

    await verifyApp();
    const session = await logInUser();

    if (implicitFlow) {
      const oAuthSession = session.newSession({
        entry: 'implicitFlow'
      });
      // Add scopes to this session
      await oAuthSession.authenticate({
        authReqs: {
          scopes: {
            scopes
          }
        }
      });
      return { accessToken: oAuthSession.tokens.access }
    } else {
      // Create authorization code
      const res = await session.user.save({
        authReqs: {
          authorizationCode: {
            // give authorization code only for requested client-id
            agentLogins: [{
              type: 'oauthApp',
              login: clientId,
            }],
            scopes,
          }
        }
      });
      return { authorizationCode: res.authRes.authorizationCode.resData.authorizationCode };
    }
  }

  async exchangeAuthorizationCodeForAccessToken(clientId, clientSecret, redirectUrl, authorizationCode) {
    const verifyApp = async () => {
      const appSession = new Kntrl().newSession({
        entry: 'oauthApp',
        signIn: true,
      });
      // This will fail because of absence of client-secret, but it's ok, we just need to validate clientId and redirectUri
      const appAuthRes = await appSession.authenticate({
        authReqs: {
          oauthApp: {
            clientId: clientId,
            clientSecret: clientSecret,
            redirectUri: 'localhost:8080',
          }
        }
      });
      if (appAuthRes.authRes.oauthApp.err?.code === ClientErrCode.UserNotFound) throw 'Incorrect client-id';
      if (appAuthRes.authRes.oauthApp.err?.incorrectRedirectUri) throw 'Incorrect redirect-uri';
      if (appAuthRes.authRes.oauthApp.err?.incorrectSecret) throw 'Incorrect client-secret';
      return appAuthRes.tokens.access;
    }

    const appAccessToken = await verifyApp();

    const oAuthSession = new Kntrl().newSession({
      entry: 'authorizationCodeFlow',
      signIn: true,
    });
    await oAuthSession.authenticate({
      authReqs: {
        authorizationCode: {
          authorizationCode: authorizationCode,
          agentAccessToken: appAccessToken,
        }
      }
    });
    return { accessToken: oAuthSession.tokens.access }
  }

  async accessResourceOnBehalfOfAnotherUser(accessToken) {
    const authorizeRes = await new Kntrl().session(accessToken).authorize(); // or .get()
    const scopes = authorizeRes.session.data.scopes?.scopes || authorizeRes.session.data.authorizationCode?.scopes || [];
    console.log(scopes);
  }
}

const thisApp = new ThisApp();

async function setup() {
  await thisApp.createUser();
  await thisApp.createOAuthApp();
}

async function thirdPartyApp() {
  const { authorizationCode } = await thisApp.openAuthorizationUrl(
    thisApp.oAuthApp.clientId,
    'localhost:8080',
    [ 'profile' ],
    false,
  );

  const { accessToken } = await thisApp.exchangeAuthorizationCodeForAccessToken(
    thisApp.oAuthApp.clientId,
    thisApp.oAuthApp.clientSecret,
    'localhost:8080',
    authorizationCode,
  );

  await thisApp.accessResourceOnBehalfOfAnotherUser(accessToken);
}

setup().then(thirdPartyApp).catch(err => console.log(err));