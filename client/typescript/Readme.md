<p align="center">
    <img alt="kntrl" src="https://github.com/kntrl-auth/kntrl-auth-server/raw/master/logo.png" width="170"/> 
</p>
<h1 align="center">Authentication server</h1>
<div align="center">
that supports custom authenticators, multifactor authentication, 
integration with existing database and codebase via plugins, action confirmation and many more

[GitHub repository](https://github.com/kntrl-auth/kntrl-auth-server)
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

You need to download and run Kntrl server first. Follow [these instructions](https://github.com/kntrl-auth/kntrl-auth-server#run)


## 📖 Guides

### Learn by example
Check [examples in the project repository](https://github.com/kntrl-auth/kntrl-auth-server/tree/master/examples).
It contains configuration and integration examples for common cases.

### API

Read guide in the [project repository](https://github.com/kntrl-auth/kntrl-auth-server#-api-docs)