EMAIL=mail-$RANDOM@example.com

printf 'Sign up with email\n'
curl -X POST "http://localhost:9876/api/session" \
  -H 'Content-Type: application/json' \
  -d "{
        \"entry\": \"app\",
        \"signUp\": true,
        \"authReqs\": {
          \"email\": {
            \"email\": \"$EMAIL\",
            \"template\": \"welcome\"
          }
        }
      }"

printf '\n\nCheck http://localhost:1080'


USER_ID='<paste user id here>'
CODE_ID='<paste code id here>'
CODE='<paste code here>'

printf '\n\nConfirm email\n'
curl -X POST "http://localhost:9876/api/user/auth/confirm" \
  -H 'Content-Type: application/json' \
  -d "{
        \"userId\": \"$USER_ID\",
        \"receivedCodes\": {
          \"email\": {
            \"$CODE_ID\": \"$CODE\"
          }
        }
      }"