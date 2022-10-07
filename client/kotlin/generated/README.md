# openapi-client

Kntrl API
- API version: 1.0
  - Build date: 2022-10-07T14:36:53.211699+03:00[Europe/Kiev]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>app.kntrl</groupId>
  <artifactId>openapi-client</artifactId>
  <version>0.9</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "app.kntrl:openapi-client:0.9"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-client-0.9.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import app.kntrl.client.generated.infra.ApiClient;
import app.kntrl.client.generated.infra.ApiException;
import app.kntrl.client.generated.infra.Configuration;
import app.kntrl.client.generated.infra.auth.*;
import app.kntrl.client.generated.infra.models.*;
import app.kntrl.client.generated.api.AuthorisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    AuthorisationApi apiInstance = new AuthorisationApi(defaultClient);
    AuthoriseReq authoriseReq = new AuthoriseReq(); // AuthoriseReq | 
    try {
      AuthoriseRes result = apiInstance.authorize(authoriseReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorisationApi#authorize");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthorisationApi* | [**authorize**](docs/AuthorisationApi.md#authorize) | **POST** /api/authorise | 
*AuthorisationApi* | [**limit**](docs/AuthorisationApi.md#limit) | **POST** /api/rate-limiter/limit | 
*ServerApi* | [**cfg**](docs/ServerApi.md#cfg) | **GET** /api/server/cfg | 
*ServerApi* | [**health**](docs/ServerApi.md#health) | **GET** /api/server/health | 
*SessionApi* | [**authenticate**](docs/SessionApi.md#authenticate) | **PATCH** /api/session | 
*SessionApi* | [**confirmSessionAuths**](docs/SessionApi.md#confirmSessionAuths) | **POST** /api/session/auth/confirm | 
*SessionApi* | [**delSession**](docs/SessionApi.md#delSession) | **DELETE** /api/session/{session-id} | 
*SessionApi* | [**getAll**](docs/SessionApi.md#getAll) | **GET** /api/session/all | 
*SessionApi* | [**getSession**](docs/SessionApi.md#getSession) | **GET** /api/session | 
*SessionApi* | [**newSession**](docs/SessionApi.md#newSession) | **POST** /api/session | 
*SessionApi* | [**signOut**](docs/SessionApi.md#signOut) | **DELETE** /api/session | 
*SignatureApi* | [**getPublicKey**](docs/SignatureApi.md#getPublicKey) | **GET** /api/signature/public-key | 
*SignatureApi* | [**sign**](docs/SignatureApi.md#sign) | **POST** /api/signature/sign | 
*SignatureApi* | [**verify**](docs/SignatureApi.md#verify) | **POST** /api/signature/verify | 
*TokenApi* | [**refreshToken**](docs/TokenApi.md#refreshToken) | **POST** /api/token/refresh | 
*UserApi* | [**confirmUserAuths**](docs/UserApi.md#confirmUserAuths) | **POST** /api/user/auth/confirm | 
*UserApi* | [**editUser**](docs/UserApi.md#editUser) | **PATCH** /api/user/{id} | 
*UserApi* | [**getUser**](docs/UserApi.md#getUser) | **GET** /api/user | 
*UserApi* | [**saveUser**](docs/UserApi.md#saveUser) | **PATCH** /api/user | 


## Documentation for Models

 - [AccessDenied](docs/AccessDenied.md)
 - [AccessTokenCfg](docs/AccessTokenCfg.md)
 - [AnswerErr](docs/AnswerErr.md)
 - [AnyErr](docs/AnyErr.md)
 - [AppSecretAuthCfg](docs/AppSecretAuthCfg.md)
 - [AuthCfg](docs/AuthCfg.md)
 - [AuthCodeHandlerCfg](docs/AuthCodeHandlerCfg.md)
 - [AuthData](docs/AuthData.md)
 - [AuthExecRes](docs/AuthExecRes.md)
 - [AuthIsNotConfirmed](docs/AuthIsNotConfirmed.md)
 - [AuthIsNotEnabled](docs/AuthIsNotEnabled.md)
 - [AuthRequiresAnother](docs/AuthRequiresAnother.md)
 - [AuthUserCfg](docs/AuthUserCfg.md)
 - [AuthenticateReq](docs/AuthenticateReq.md)
 - [AuthenticateRes](docs/AuthenticateRes.md)
 - [AuthoriseReq](docs/AuthoriseReq.md)
 - [AuthoriseRes](docs/AuthoriseRes.md)
 - [BuiltInAuthCfg](docs/BuiltInAuthCfg.md)
 - [Cache](docs/Cache.md)
 - [ClientErr](docs/ClientErr.md)
 - [Code](docs/Code.md)
 - [CodeCfg](docs/CodeCfg.md)
 - [CodeIsExpired](docs/CodeIsExpired.md)
 - [CodeIsIncorrect](docs/CodeIsIncorrect.md)
 - [CodeTooManyAttempts](docs/CodeTooManyAttempts.md)
 - [CodeVerifier](docs/CodeVerifier.md)
 - [ConfirmSessionAuthsReq](docs/ConfirmSessionAuthsReq.md)
 - [ConfirmUserAuthsReq](docs/ConfirmUserAuthsReq.md)
 - [DbHealthRes](docs/DbHealthRes.md)
 - [DbsCfg](docs/DbsCfg.md)
 - [DbsCfgRateLimiter](docs/DbsCfgRateLimiter.md)
 - [DbsCfgSession](docs/DbsCfgSession.md)
 - [DbsCfgUser](docs/DbsCfgUser.md)
 - [Device](docs/Device.md)
 - [EditUserReq](docs/EditUserReq.md)
 - [EmailAuthCfg](docs/EmailAuthCfg.md)
 - [EmailIsIncorrect](docs/EmailIsIncorrect.md)
 - [EntryAccessTokenCfg](docs/EntryAccessTokenCfg.md)
 - [EntryCfg](docs/EntryCfg.md)
 - [Err](docs/Err.md)
 - [ErrAuthExecRes](docs/ErrAuthExecRes.md)
 - [FindSessionsRes](docs/FindSessionsRes.md)
 - [HealthRes](docs/HealthRes.md)
 - [HealthStatus](docs/HealthStatus.md)
 - [HealthStatusRes](docs/HealthStatusRes.md)
 - [I18nCfg](docs/I18nCfg.md)
 - [InMemoryCfg](docs/InMemoryCfg.md)
 - [InTokenCfg](docs/InTokenCfg.md)
 - [IntegrationErr](docs/IntegrationErr.md)
 - [IpAuthCfg](docs/IpAuthCfg.md)
 - [IpNew](docs/IpNew.md)
 - [JdbcCfg](docs/JdbcCfg.md)
 - [Login](docs/Login.md)
 - [LoginId](docs/LoginId.md)
 - [MongoCfg](docs/MongoCfg.md)
 - [MysqlCfg](docs/MysqlCfg.md)
 - [NewSessionReq](docs/NewSessionReq.md)
 - [NextFactor](docs/NextFactor.md)
 - [NoAuthAvailableForFactor](docs/NoAuthAvailableForFactor.md)
 - [OAuthCfg](docs/OAuthCfg.md)
 - [OkAuthExecRes](docs/OkAuthExecRes.md)
 - [PasswordAuthCfg](docs/PasswordAuthCfg.md)
 - [PasswordHistoryCfg](docs/PasswordHistoryCfg.md)
 - [PasswordIsIncorrect](docs/PasswordIsIncorrect.md)
 - [PasswordIsInvalid](docs/PasswordIsInvalid.md)
 - [PasswordStrengthRequirements](docs/PasswordStrengthRequirements.md)
 - [PluginClientErr](docs/PluginClientErr.md)
 - [PluginErr](docs/PluginErr.md)
 - [PostgresCfg](docs/PostgresCfg.md)
 - [QuestionsAnswersIncorrect](docs/QuestionsAnswersIncorrect.md)
 - [QuestionsAnswersInvalid](docs/QuestionsAnswersInvalid.md)
 - [QuestionsAuthCfg](docs/QuestionsAuthCfg.md)
 - [RateLimiterCfg](docs/RateLimiterCfg.md)
 - [RateLimiterReq](docs/RateLimiterReq.md)
 - [RedisCfg](docs/RedisCfg.md)
 - [RefreshTokenCfg](docs/RefreshTokenCfg.md)
 - [RefreshTokenReq](docs/RefreshTokenReq.md)
 - [RefreshTokenRes](docs/RefreshTokenRes.md)
 - [RemoteAuthCfg](docs/RemoteAuthCfg.md)
 - [RemoteDbCfg](docs/RemoteDbCfg.md)
 - [SHAppCfg](docs/SHAppCfg.md)
 - [SHAppCfgAuthsValue](docs/SHAppCfgAuthsValue.md)
 - [SHHttpCfg](docs/SHHttpCfg.md)
 - [SaveUserReq](docs/SaveUserReq.md)
 - [SaveUserRes](docs/SaveUserRes.md)
 - [ServerErr](docs/ServerErr.md)
 - [Session](docs/Session.md)
 - [SessionExpired](docs/SessionExpired.md)
 - [SignatureIsIncorrect](docs/SignatureIsIncorrect.md)
 - [SkippedAuthExecRes](docs/SkippedAuthExecRes.md)
 - [SqliteCfg](docs/SqliteCfg.md)
 - [TokenCfg](docs/TokenCfg.md)
 - [TokenExpired](docs/TokenExpired.md)
 - [TokenHandlerCfg](docs/TokenHandlerCfg.md)
 - [Tokens](docs/Tokens.md)
 - [TooManyReqs](docs/TooManyReqs.md)
 - [Unauthenticated](docs/Unauthenticated.md)
 - [UnconfirmedAuth](docs/UnconfirmedAuth.md)
 - [UnconfirmedAuthData](docs/UnconfirmedAuthData.md)
 - [User](docs/User.md)
 - [UserLoginAlreadyTaken](docs/UserLoginAlreadyTaken.md)
 - [UserNotFound](docs/UserNotFound.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### access-token

- **Type**: API key
- **API key parameter name**: access-token
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


