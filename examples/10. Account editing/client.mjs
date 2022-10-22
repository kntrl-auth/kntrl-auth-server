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

  // Enable auth
  let res = await session.user.save({
    authReqs: {
      email: {
        email: `mail-${Math.random()}@example.org`
      }
    }
  });
  console.log('Enable email auth result:', res.user.auths.email, res.user.auths.email.sentCodes);

  // Update auth
  console.log('Update password, before:', (await session.user.get()).auths.password);
  res = await session.user.save({
    authReqs: {
      password: {}
    }
  });
  console.log('Update password auth result:', res.user.auths.password);

  // Remove auth
  console.log('Remove email auth, before:', res.user.auths);
  res = await session.user.save({
    authReqs: {
      email: null
    }
  });
  console.log('Remove email auth result:', res.user.auths);

  // Update login
  console.log('Update login, before:', (await session.user.get()).logins);
  res = await session.user.save({
    logins: {
      username: `John-2-${Math.random()}`
    }
  });
  console.log('Update login result:', res.user.logins);

  // Enable factor
  console.log('Enable factor, before:', (await session.user.get()).factors);
  res = await session.user.save({
    factors: {
      second: true
    }
  });
  console.log('Enable factor result:', res.user.factors);

  // Disable factor
  res = await session.user.save({
    factors: {
      second: false
    }
  });
  console.log('Disable factor result:', res.user.factors);
}

example().catch(err => console.log(err));