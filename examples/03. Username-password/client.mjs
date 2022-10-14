import {AuthStatus, ErrCode, Kntrl} from '../.client/node_modules/kntrl-client/index.js';

async function example() {
  const login = "John-" + Math.random();

  const signUpSession = new Kntrl().newSession({
    entry: 'app',
    logins: {
      username: login
    },
    signUp: true
  });
  const signUpRes = await signUpSession.authenticate({
    authReqs: {
      // Use auth named "password"
      password: {
        password: 'Abcdef1@',
        confirmPassword: 'Abcdef1@'
      }

      // Confirm password field is not required
      // password: {
      //   password: 'Abcdef1'
      // }

      // Password can be generated automatically
      // password: {}
    }
  });

  console.log(signUpRes.authRes.password.resData.password + ' - ' + signUpRes.authRes.password.resData.strength)

  const signInSession = new Kntrl().newSession({
    entry: 'app',
    logins: {
      username: login
    },
    signIn: true
  });
  const signInRes = await signInSession.authenticate({
    authReqs: {
      // Use auth named "password"
      password: {
        password: 'Abcdef1',
      }
    }
  });
  const passwordAuthRes = signInRes.authRes.password;
  if (passwordAuthRes.status !== AuthStatus.Ok) {
    // handle password error
    console.log(passwordAuthRes.err.msg);
    if (passwordAuthRes.err.code === ErrCode.PasswordIsIncorrect) {
      console.log("Incorrect password");
    }
  }
}

example().then(() => {}).catch(err => console.log(err));