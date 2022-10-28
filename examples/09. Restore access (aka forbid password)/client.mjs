import {Kntrl, AuthStatus} from '../.client/node_modules/kntrl-client/index.js';

async function example() {
  const username = `John-${Math.random()}`;

  const signUpSession = new Kntrl().newSession({
    entry: 'app',
    logins: { username },
    signUp: true,
  });
  console.log((await signUpSession.authenticate({
    authReqs: {
      password: {},
      questions: {
        answers: {
          HOMETOWN: 'New York',
          PET_NAME: 'Simon',
          FAVORITE_BAND: 'Imagine Dragons',
        }
      }
    }
  })).authRes.questions);

  const singInSession = new Kntrl().newSession({
    entry: 'app',
    logins: { username },
    signIn: true,
  });
  let res = await singInSession.authenticate({
    authReqs: {
      password: {
        password: '1234'
      }
    }
  });
  if (res.authRes.password.status === AuthStatus.Err) {
    console.log("Incorrect password:", res.authRes.password);
    // Forgot password
    const restoreAccessSession = new Kntrl().newSession({
      entry: 'forgotPassword',
      logins: { username },
      signIn: true,
    });
    res = await restoreAccessSession.authenticate({
      authReqs: {
        questions: {
          answers: {
            // Precise answers aren't required (requirements specified by config)
            HOMETOWN: 'new-york',
            PET_NAME: 'simon',
            FAVORITE_BAND: 'Probably Pink Floyd?',
          }
        }
      }
    });
    console.log('2 (specified by config) correct answers is enough:', res.authRes.questions, res.session.authenticated)
  }
}

example().catch(err => console.log(err));