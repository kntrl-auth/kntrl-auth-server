### How to read these examples

Example folders may contain:
- `Readme.md` with description of an example
- `docker-compose.yml` is docker environment to run an example
- `kntrl.json5` file contains the app configuration
- `client.**` contains short example of frontend and/or backend integration

### How to run these examples

1. Start server:
open example folder `$ cd <example>`, start via docker compose: `$ docker compose up`

2. Import client project from `examples/.client`. This folder contains build files for gradle and npm.

3. Run corresponding client file from example folder.