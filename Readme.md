<p align="center">
    <img alt="kntrl" src="logo.png" width="170"/> 
</p>
<h1 align="center">Authentication server</h1>
<hr/>
<div align="center">
that supports custom authenticators, multifactor authentication, 
integration with existing database and codebase via plugins, action confirmation and many more

[Getting started](#getting-started) •
[Learn by example](#learn-by-example) •
[API docs](#api-docs)
</div>


## Features
<hr/>

- Authenticate by **password, email, IP, secret questions**, **Facebook** OAuth2, **Google** OAuth2, etc
- **API key** management supported
- Configurable **multifactor authentication**
- **Action confirmation**
- Restore account access (e.g "forgot password") supported
- Configurable **token rotation** (access and refresh tokens)
- Clint side access token caching and signature (**JWT** supported)
- **Rate limiting** with hierarchy (multiple limits)
- Error messages with custom localisation, custom email templates supported
- **Postgres, Mysql, Mongodb, Sqlite, Redis**, in-memory databases.
- **Plugin API** allows to connect new databases, implement new authenticators (e.g. SMS) with minimum efforts in any language
- Easy integration. Generate any language client using **OpenAPI** generators


## Getting started
<hr/>

### Run
#### Option 1 - run Java app
- Download the latest distribution from  [Releases](#api-docs)
- Start application:
```shell
java -jar kntrl.jar
```

#### Option 2 - run with docker compose
- Create `docker-compose.yml` file:
```yml
version: "3.1"
services:
  kntrl:
    image: kntrl/kntrl-self-hosted
    ports:
    - "9876:9876"
```
- Execute `$ docker compose up`

### Test setup
Execute HTTP request

### Configure

#### Option 1 - Modify `kntrl.json5` file
When started app creates file `kntrl.json5` that contains app config.
If you're using docker, make sure you specified volume:

`docker-compose.yml`
```yml
version: "3.1"
services:
  kntrl:
    image: kntrl/kntrl-self-hosted
    ports:
    - "9876:9876"
    volumes:
    - ./path/on/your/computer:/kntrl
```
#### Option 2 - Override config by environment variables
You can override any config value using `KNTRL_<UPPER_CASE_PATH>` styled path. E.g.:

`docker-compose.yml`
```yml
version: "3.1"
services:
  kntrl:
    image: kntrl/kntrl-self-hosted
    ports:
    - "9876:9876"
    environment:
      KNTRL_AUTHS: >
        {
          password: {
            minLength: 8,
            requireNumber: true
          }
        }
      KNTRL_DB_USER_SQLITE: "./user-db"
```

#### Option 3 - Override config by command line args:
```shell
java -jar kntrl.jar --auths "{ password: { minLength: 8, requireNumber: true } }" --db.user.sqlte "./user-db"
```

## Learn by example
<hr/>

### How to read/run examples



## API docs
<hr/>

- [Frontend/Backend integration API](#api-docs)
- [Configuration API](#api-docs)
- [Plugin API](#api-docs)

## License
<hr/>
