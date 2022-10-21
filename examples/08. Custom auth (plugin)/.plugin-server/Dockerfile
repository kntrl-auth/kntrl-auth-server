FROM openjdk:9-jdk-slim as build

COPY /. /.

ENTRYPOINT [ "./gradlew", "bootRun" ]