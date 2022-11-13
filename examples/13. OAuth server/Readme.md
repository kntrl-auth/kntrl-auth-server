## OAuth2 in a nutshell

OAuth2 protocol allow another user/site/app act on behalf of current user.

So usually it consists of next steps:
1. Third party app developer creates user/project/app on your website.
2. Your website generates `client_id` and `client_secret` for developer's app.
3. When developer's app is going to do something on your website on behalf of some another user registered on your website, 
it redirects to your website page (called `authorization URL`) with `client_id`, `scopes`, `redirectUri` query params.
4. Your website checks `client_id`
5. Your website logs in a user.
6. Your website redirects back to developer's app website (to `redirect_uri`) and sends `access_token` as a query param.

In this way developer's app receives access token that it can use to access your website.

Instead of `access_token` your website can give back `authorization_code` that can be exchanged for `access_token` later.
Because this can be done on developer's app backend, it allows your website to check `client_secret` additionally.
(Storing `client_secret` in frontend app code is unsafe and makes no sense).

## OAuth2 server implementation with Kntrl

Basically we need 4 entries:
1. `app` - just regular sign-in for a user.
2. `oauthApp` - entry for app authentication (verifying `client_id`, `client_secret` and `redirect_uri`).
3. `implicitFlow` - entry that will add scopes to our session.
4. `authorizationCodeFlow` - entry that will be used by app backend to exchange authorization code for access token.

When app requests implicit flow, we use `oauthApp` entry to validate third-party app `client_id`, 
then `app` entry to log in user, and finally `implicitFlow` to add `scopes` and `client_id` to a session.

When app requests authorization code flow, we are using `authorizationCode` auth to create new authorization code.
Then we can sign in this user with given `authorizationCode`.