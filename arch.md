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

Authenticator - is a component that takes user data from database (if user already identified), authentication request, 
verification code (if it's specified in config) and executes one of next:

- Validates request (dry-run). Short passwords and incorrect emails will be rejected.
- Verifies authentication. Like password - it checks password from request against password from user data.
- Extracts user id from request. Like oauth2/facebook/google/etc. authentication - it executes oauth2 request to obtain
user login / user id.
- Sends verification code somewhere. Like email or sms - user must enter received code or click confirmation URL.
- Updates user data, e.g. changes password.

For more details check [Plugin API](#api-docs).


## Authentication flow, 2FA, action confirmation, API keys

Next important concept is `entries`. For simplicity, you can think about entries as UI that handles sign-in or requests
confirmation. You may have separate entries for:

- Regular sign-in/sign-up.
- Access restoring (e.g. "forgot password").
- API key.
- Payment action.

For each entry you specify rules for authentication. E.g. regular sign-in may require user
to confirm identity by first factor (e.g. password or oauth2) and optional second factor (e.g. code from email).
For payments, you may require additional confirmation by code from email/sms. Or entry may have no additional rules,
like API-key entry that allows to just create new sessions and give access-token to an application.

You may have as many entries as you need.

You may have as many factors per entry as you need. Factors can be required
(you can't enter if you don't have corresponding authenticator enabled) or optional (authenticator executed only if factor is enabled).


## Restoring access

Access restoring is handled by:

- Alternative authenticators. Every factor may specify several authenticators so user can use another one if he lost main.
E.g. entry `app` may have factor `first` that specifies two authenticators: `password` and `email`. If user forget a password,
they can use email authenticator instead and change password after successful sign-in. 
Remember that restore-access or forgot-password flow is just another way to sign-in. So alternative authenticators enables
reserve sign-in flow without breaking 2FA.
- Alternative entry. As restore-access usually has a separate UI, it makes sense to create separate entry for this flow.
Also, this flow may contain authenticators that are not available for regular sign-in. E.g. Secret-questions authenticator.