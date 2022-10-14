REFRESH_TOKEN="<paste_access_token_here>"

printf 'Session can be refreshed manually\n'
curl -X POST "http://localhost:9876/api/token/refresh" \
  -H 'Content-Type: application/json' \
  -d "{ \"refreshToken\": \"$REFRESH_TOKEN\" }"