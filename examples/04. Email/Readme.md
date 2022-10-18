## Email authentication

WHen email is saved, it can be used as a login - in this case flow is equal to [Username-password](../03.%20Username-password)
but with `email` instead of `username`.

Email authenticator also accepts `template` param. When specified, authenticator will use corresponding template from
configuration, otherwise default template is used. `<title>` from template will be used for subject of email.
For more details check API docs.

Application generating confirmation code that will be sent to email. You can show this code directly in an email template, or
create a URL/button that lead to a frontend page, so user doesn't need to enter the code manually.

### Passwordless authentication / forgot password sign-in

As email is a login and authenticator in the same time, it can be used it for authentication. This may be useful for
"forgot password" flow to allow user sign in with email only and then change password. To do this,
we set two alternative sign-in options (password or email) for `first` factor, and allow this
entry to edit user account.


## Localisation

All error messages are located in the ./.18n folder (specified in the `kntrl.json5` config). App will create templates
to help with creating text for error messages. This file may contain additional values specified and then be used by the
`i18n` handlebars helper in email templates.