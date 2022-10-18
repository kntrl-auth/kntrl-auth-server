LOGIN=Login-$RANDOM

printf 'Use auth named "password"\n'
curl -X POST "http://localhost:9876/api/session" \
  -H 'Content-Type: application/json' \
  -d "{
        \"entry\": \"app\",
        \"logins\": {
          \"username\": \"$LOGIN\"
        },
        \"signUp\": true,
        \"authReqs\": {
          \"password\": {
            \"password\": \"Abcdef1@\",
            \"confirmPassword\": \"Abcdef1@\"
          }
        }
      }"


printf '\n\nPrecheck password\n'
curl -X POST "http://localhost:9876/api/session" \
  -H 'Content-Type: application/json' \
  -d "{
        \"entry\": \"app\",
        \"logins\": {
          \"username\": \"$LOGIN\"
        },
        \"signUp\": true,
        \"authReqs\": {
          \"password\": {
            \"password\": \"Abcdef1@\",
            \"confirmPassword\": \"Abcdef1@\"
          }
        },
        \"dryRun\": true
      }"

printf '\n\nConfirm password field is not required\n'
curl -X POST "http://localhost:9876/api/session" \
  -H 'Content-Type: application/json' \
  -d "{
        \"entry\": \"app\",
        \"logins\": {
          \"username\": \"$LOGIN\"
        },
        \"signUp\": true,
        \"authReqs\": {
          \"password\": {
            \"password\": \"Abcdef1@\"
          }
        }
      }"

printf '\n\nPassword can be generated automatically\n'
curl -X POST "http://localhost:9876/api/session" \
  -H 'Content-Type: application/json' \
  -d "{
        \"entry\": \"app\",
        \"logins\": {
          \"username\": \"$LOGIN\"
        },
        \"signUp\": true,
        \"authReqs\": {
          \"password\": {}
        }
      }"

printf '\n\nSign in with wrong password\n'
curl -X POST "http://localhost:9876/api/session" \
  -H 'Content-Type: application/json' \
  -d "{
        \"entry\": \"app\",
        \"logins\": {
          \"username\": \"$LOGIN\"
        },
        \"signIn\": true,
        \"authReqs\": {
          \"password\": {
            \"password\": \"1234\"
          }
        }
      }"