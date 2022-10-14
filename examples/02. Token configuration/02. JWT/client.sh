ACCESS_TOKEN="<paste_access_token_here>"

printf 'Check that session is valid\n'
curl -X GET "http://localhost:9876/api/authorize?access-token=$ACCESS_TOKEN"

printf '\n\nSign out\n'
curl -X DELETE "http://localhost:9876/api/session?access-token=$ACCESS_TOKEN"

printf '\n\nToken still valid until expiration as it cached in JWT\n'
curl -X GET "http://localhost:9876/api/authorize?access-token=$ACCESS_TOKEN"