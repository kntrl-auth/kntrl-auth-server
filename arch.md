## Introduction

Usually process of access check consists of next phases:

- **Identification** - user gives information about who is they. E.g. provide username, email or facebook account.
- **Authentication** - user proves that they are really who they claim to be. E.g. password, code form email/sms, oauth2 authorisation code, etc.
- **Authorisation** - verifying that user has access to some resource.

Kntrl server takes care of identification and authentication and provides some limited possibilities for authorisation.
Why? Because access-check is app specific, resource can be limited by role, rating, users relationships, purchases, oauth2 scopes, etc.
Although there are some common approaches for authorisation, e.g. RBAC, we decided that it's not what Kntrl about right now.


## Identification

Identification is enabled by `logins` section in config. Login can be just a user-input text (like "username") or can be
provided by an authenticator (like "email" or "facebook").

Logins are logic-less - it's just the id of a user.


## Authentication

Authenticator - is a component that takes a user data from database (if the user already identified), an authentication request, 
a verification code (if it's specified in config) and executes one of next:

- Validates the request (dry-run). Short passwords and incorrect emails will be rejected.
- Verifies the authentication. E.g. password auth checks a password from the request against a password from the user data.
- Extracts user-id/login from the request. E.g. oauth2/facebook/google/etc. auth executes an oauth2 request to obtain
the user login / user id.
- Sends the verification code somewhere. E.g. email or sms - user must enter received code or click on a confirmation URL.
- Updates the user data, e.g. changes password.

For more details check [Plugin API](https://kntrl-auth.github.io/kntrl-auth-server/apidocs/plugin#tag/pluginauth).


## Authentication flow, 2FA, action confirmation, API keys

Next important concept is `entries`. For simplicity, you can think about entries as UI that handles sign-in or requests
confirmation from user. You may have separate entries for:

- Regular sign-in/sign-up.
- Access restoring (e.g. "forgot password").
- API key / third party app auth.
- Payment action.

For each entry you specify rules for authentication. E.g. regular sign-in may require user
to confirm identity by first factor (e.g. password or oauth2) and optional second factor (e.g. code from email).
For payments, you may require additional confirmation by code from email/sms. Or entry may have no additional rules,
like API-key entry that allows to just create new sessions and give access-token to a third-party application.

You may have as many entries as you need.

You may have as many factors per entry as you need. Factors can be required
(user can't enter if user don't have corresponding authenticator enabled) or optional (authenticator executed only if factor is enabled).


## Restoring access

Access restoring is handled by:

- Alternative authenticators. Every factor may specify several authenticators so a user can use another one if he lost main auth credentials.
E.g. entry `app` may have factor `first` that specifies two authenticators: `password` and `email`. If user forget a password,
they can use email authenticator instead of password and change password after successful sign-in with email auth. 
Remember that restore-access or forgot-password flow is just another way to sign-in. So alternative authenticators enables
reserve sign-in flow without breaking 2FA.
- Alternative entry. As restore-access usually has a separate UI, it makes sense to create separate entry for this flow.
Also, this flow may contain authenticators that are not available for regular sign-in. E.g. Secret-questions authenticator may be available
only for restoring access, but not for regular sign-in.


## Access checks

To allow/disallow the user to perform some actions on a backend side, you should validate the session by user access-token 
(check SDK/API docs/examples) and check that session `entry` and `userId` is allowed for this action (this is app-specific logic).