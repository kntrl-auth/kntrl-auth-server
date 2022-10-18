printf 'Session can be refreshed manually\n'

printf 'Enter refresh token: '
read -r REFRESH_TOKEN

curl -X POST "http://localhost:9876/api/token/refresh" \
  -H 'Content-Type: application/json' \
  -d "{ \"refreshToken\": \"$REFRESH_TOKEN\" }"