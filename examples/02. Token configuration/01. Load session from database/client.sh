LOGIN=Login-$RANDOM

printf 'Create new session\n'
# In real world you will likely load previously received access-token from file
curl -b .cookie -c .cookie --fail-with-body -X POST "http://localhost:9876/api/session" \
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

printf '\n\nCheck that session is valid\n'
curl -b .cookie -X POST "http://localhost:9876/api/authorize"

printf '\n\nSign out\n'
curl -b .cookie -X DELETE "http://localhost:9876/api/session"

printf '\n\nMust be expired after sign out\n'
curl -b .cookie -X POST "http://localhost:9876/api/authorize"