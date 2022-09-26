# Configuration

When started the app creates a file `kntrl.json5` with bootstrap configuration. 
Json schema will be crated near this file as `kntrl.schema.json`, use it for autocompletion.

Parts of configuration can be overridden by environment variables using KNTRL_CAMEL_CASE names of properties or by 
app command line arguments as `dot.separated.paths.to.property`. E.g.:

```shell
export KNTRL_AUTHS_PASSWORD_MINLENGTH=8
export KNTRL_DB_USER="{ sqlite: './sqlite-db-file' }"
java -jar <path-to-app>.jar --auths.password.requireNumber true --db.session "{ sqlite: './sqlite-db-file' }"
```