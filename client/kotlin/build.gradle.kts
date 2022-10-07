import org.hidetake.gradle.swagger.generator.GenerateSwaggerCode

plugins {
    kotlin("jvm") version "1.6.21"
    id("org.hidetake.swagger.generator") version "2.19.2"
}

group = "app.kntrl"
version = "0.9"

sourceSets.main {
    java.srcDirs("./src")
}

repositories {
    mavenCentral()
}

dependencies {
    swaggerCodegen("org.openapitools:openapi-generator-cli:6.0.0")
    api("app.kntrl:openapi-client:0.9")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
}

tasks.register<GenerateSwaggerCode>("generateApi") {
    group = "openapi"
    language = "java"
    inputFile = file("../openapi.yaml")
    outputDir = project.projectDir.resolve("generated")
    additionalProperties = mapOf(
        "apiPackage" to "app.kntrl.client.generated.api",
        "invokerPackage" to "app.kntrl.client.generated.infra",
        "modelPackage" to "app.kntrl.client.generated.model",
        "groupId" to "app.kntrl",
        "artifactId" to "openapi-client",
        "artifactVersion" to "0.9",
    )
    doLast {
        file("generated/docs").walk(FileWalkDirection.BOTTOM_UP).forEach(File::delete)
        file("generated/src/test").walk(FileWalkDirection.BOTTOM_UP).forEach(File::delete)
    }
}

tasks.compileKotlin {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}