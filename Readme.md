<p align="center">
    <img alt="kntrl" src="logo.png" width="170"/> 
</p>
<h1 align="center">Authentication server</h1>
<div align="center">
that supports custom authenticators, multifactor authentication, 
integration with existing database and codebase via plugins, action confirmation and many more

[Getting started](#-getting-started) •
[Learn by example](#learn-by-example) •
[API docs](#-api-docs)
</div>


## ⭐ Features

- Authenticate by **password, email, IP, secret questions**, **Facebook** OAuth2, **Google** OAuth2, etc.
- **API key** management supported
- Configurable **multifactor authentication**
- **Action confirmation** (e.g. "enter the code from email to confirm payment")
- Restore account access (e.g. "forgot password") supported
- Configurable **token rotation** (access and refresh tokens)
- Clint side access token caching and signature (**JWT** supported)
- **Rate limiting** with hierarchy (multiple limits per request)
- Error messages with custom localisation, custom email templates supported
- **Postgres, Mysql, Mongodb, Sqlite, Redis**, in-memory databases.
- **Plugin API** allows to connect new databases, implement new authenticators (e.g. SMS) with minimum efforts using any language
- Easy integration. Generate any language client using **OpenAPI** generators


## 🚀 Getting started

### Run

#### ☕ Option 1 - run Java app
- Download the latest distribution from  [Releases](../../../releases)
- Start application:
```shell
java -jar kntrl.jar
```

#### 🐳 Option 2 - run with docker compose
- Create `docker-compose.yml` file:
```yml
version: "3.1"
services:
  kntrl:
    image: kntrl/self-hosted
    ports:
    - "9876:9876"
```
- Execute `$ docker compose up`

### Test setup
Execute HTTP request:
```shell
curl -X 'GET' 'http://localhost:9876/api/server/health' -H 'accept: application/json'
```
P.S. It's recommended to set the `healthCheckKey` property in the config to make health API require `key` query-param and
restrict access to this endpoint.


### Configure

#### Option 1 - Modify `kntrl.json5` file
When started, the app creates the file `kntrl.json5` that contains app config and the `kntrl.schema.json` with json-schema 
for that file in a working directory.
If you're using docker, make sure you have specified volume:

`docker-compose.yml`
```yml
version: "3.1"
services:
  kntrl:
    image: kntrl/self-hosted
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
    image: kntrl/self-hosted
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

## 📖 Guides

### Architecture/API overview
Read [app architecture overview](arch.md) to grasp main concepts.

### Learn by example
Then read the guide in [examples folder](examples). It contains configuration and integration examples for common cases.


## 🛠️ Integrate with frontend/backend

### Get/create Kntrl API client

#### Option 1 - use existing SDK
- [Java/Kotlin client](client/kotlin/Readme.md)
- [JavaScript/TypeScript client](client/typescript/Readme.md)

#### Option 2 - use OpenAPI generator
Generate an HTTP client for any other language by any OpenApi generator (e.g. [this](https://openapi-generator.tech)).
The OpenAPI specification is located in [client folder](client):

- [openapi-no-polymorphism.yaml](client/openapi-no-polymorphism.yaml) - simplified specification (without inheritance and polymorphism). All generators should support this specification.
- [openapi-no-additionalProperties.yaml](client/openapi-no-additionalProperties.yaml) - the same as one above, but with workaround for additionalProperties handling bug in some generators.
- [openapi-no-inheritance.yaml](client/openapi-no-inheritance.yaml) - simplified specification (without inheritance). Some generators support this.
- [openapi.yaml](client/openapi.yaml) - specification with discriminators and inheritance. Most of the generators produce incorrect code for this.

**TL;DR;** if you're not sure which specification to use, just use [openapi-no-polymorphism.yaml](client/openapi-no-polymorphism.yaml), and then
[openapi-no-additionalProperties.yaml](client/openapi-no-additionalProperties.yaml) if former one doesn't work. E.g.:
```shell
openapi-generator-cli generate -i ./client/openapi-no-polymorphism.yaml -g go -o ./generated/client
```
**WARN**: it's strongly recommended to disable rejection of not-known fields. E.g. for java generator set 
`disallowAdditionalPropertiesIfNotPresent` to `false`, or disable Jackson FAIL_ON_UNKNOWN_PROPERTIES.

#### Option 3 - call HTTP API manually
Check [API docs](https://kntrl-auth.github.io/kntrl-auth-server/apidocs) for HTTP API documentation.


### Use client
Check corresponding files in [examples folder](examples) for usage examples.


## 📑 API docs

For full specification of app features, check these docs:

- [Configuration API](https://kntrl-auth.github.io/kntrl-auth-server/apidocs/cfg)
- [Frontend/Backend integration API](https://kntrl-auth.github.io/kntrl-auth-server/apidocs)
- [Plugin API](https://kntrl-auth.github.io/kntrl-auth-server/apidocs/plugin)


## 🔒 License

This repo includes clients for the Kntrl authentication server, examples of usage distributed under MIT license. You can do 
whatever you want with this.

The self-hosted Kntrl server (which you download from releases page) is proprietary, you're not allowed to modify or sell it;
you can use it for any kind of software, but you are not allowed to provide it as Software as a Service.

#### Is the app sources available anywhere?

Right now no sources provided, but the app will likely be open sourced in the near future.

If maintenance of this product is finished - all the sources will be published immediately.