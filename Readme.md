<p align="center">
    <img alt="kntrl" src="logo.png" width="170"/> 
</p>
<h1 align="center">Authentication server</h1>
<div align="center">
that supports custom authenticators, multifactor authentication, 
integration with existing database and codebase via plugins, action confirmation and many more

[Getting started](#getting-started) •
[Learn by example](#learn-by-example) •
[API docs](#api-docs)
</div>


## Features

- Authenticate by **password, email, IP, secret questions**, **Facebook** OAuth2, **Google** OAuth2, etc.
- **API key** management supported
- Configurable **multifactor authentication**
- **Action confirmation** (e.g. "enter code from email to confirm payment")
- Restore account access (e.g. "forgot password") supported
- Configurable **token rotation** (access and refresh tokens)
- Clint side access token caching and signature (**JWT** supported)
- **Rate limiting** with hierarchy (multiple limits per request)
- Error messages with custom localisation, custom email templates supported
- **Postgres, Mysql, Mongodb, Sqlite, Redis**, in-memory databases.
- **Plugin API** allows to connect new databases, implement new authenticators (e.g. SMS) with minimum efforts using any language
- Easy integration. Generate any language client using **OpenAPI** generators


## Getting started

### Run

#### Option 1 - run Java app
- Download the latest distribution from  [Releases](../../../releases)
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
    image: kntrl/kntrl-sh
    ports:
    - "9876:9876"
```
- Execute `$ docker compose up`

### Test setup
Execute HTTP request:
```shell

```


### Configure

#### Option 1 - Modify `kntrl.json5` file
When started, app creates file `kntrl.json5` that contains app config and `kntrl.schema.json` with json-schema 
for that file in a working directory.
If you're using docker, make sure you have specified volume:

`docker-compose.yml`
```yml
version: "3.1"
services:
  kntrl:
    image: kntrl/kntrl-sh
    ports:
    - "9876:9876"
    volumes:
    - ./path/on/your/computer:/kntrl
```

#### Option 2 - Override config by environment variables
You can override any config value using `KNTRL_<UPPER_CASE_PATH>` styled path. E.g. with docker:

`docker-compose.yml`
```yml
version: "3.1"
services:
  kntrl:
    image: kntrl/kntrl-sh
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
      KNTRL_DB_USER_SQLITE: ./user-db
```
or with command line:
```shell
export KNTRL_DB_USER_SQLITE=./user-db
java -jar kntrl.jar
```

#### Option 3 - Override config by command line args:
```shell
java -jar kntrl.jar --auths "{ password: { minLength: 8, requireNumber: true } }" --db.user.sqlte "./user-db"
```

## Learn by example
Read guide in [examples folder](examples/Readme.md). It contains configuration and integration examples for common cases.

## Integrate with frontend/backend

### Option 1 - using SDK
- [Java/Kotlin client](client/kotlin/Readme.md)
- [JavaScript/TypeScript client](client/typescript/Readme.md)

Check corresponding files in [examples folder](examples/Readme.md) for usage examples.

### Option 2 - using OpenAPI generator
Generate HTTP client for any other language by any OpenApi generator (e.g. [this](https://openapi-generator.tech)).
OpenAPI specification is located in [client folder](client):

- [openapi.yaml](client/openapi.yaml) - specification with discriminators and inheritance. Most of the generators produce incorrect code for this. 
- [openapi-no-inheritance.yaml](client/openapi-no-inheritance.yaml) - simplified specification (without inheritance). Some generators support this.
- [openapi-no-discriminators.yaml](client/openapi-no-discriminators.yaml) - simplified specification (without inheritance and discriminators). All generators should support this specification.

**TL;DR;** if you're not sure which specification to use, just use [openapi-no-discriminators.yaml](client/openapi-no-discriminators.yaml), e.g.:
```shell
openapi-generator-cli generate -i client/openapi-no-discriminators.yaml -g go -o /generated/client
```


## API docs

For full specification of app features, check these docs:

- [Configuration API](#api-docs)
- [Frontend/Backend integration API](#api-docs)
- [Plugin API](#api-docs)


## License

This repo includes clients for Kntrl authentication server, examples of usage distributed under MIT license. You can do 
whatever you want with this.

Self-hosted Kntrl server (that you download from releases page) is proprietary, you're not allowed to modify, sell,
you can use it for any kind of software but not for Software as a Service.

### Is app sources available anywhere?

Right now no sources provided, but likely this will be open sourced in the near future.

if maintenance of this product is finished - all the sources will be published.