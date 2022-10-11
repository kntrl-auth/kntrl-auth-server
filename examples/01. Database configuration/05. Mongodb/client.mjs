import {Kntrl} from '../../.client/node_modules/kntrl-client/index.js';

async function example() {
  const serverHealth = await new Kntrl().serverHealth();
  console.log(`User database health: ${serverHealth.db.user.status}`);
  console.log(`Session database health: ${serverHealth.db.user.status}`);
  console.log(`Rate-limiter database health: ${serverHealth.db.user.status}`);
}
example().then(() => {});