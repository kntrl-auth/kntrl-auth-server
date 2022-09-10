import org.hidetake.gradle.swagger.generator.GenerateSwaggerCode

plugins {
    kotlin("jvm") version "1.6.21"
    id("org.hidetake.swagger.generator") version "2.19.2"
}

group = "kntrl"
version = "1.0"

sourceSets.main {
    java.srcDirs("./src")
}

repositories {
    mavenCentral()
}

dependencies {
    swaggerCodegen("org.openapitools:openapi-generator-cli:6.0.1")
    implementation("kntrl:client:1.0")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
}

tasks.register<GenerateSwaggerCode>("generateApi") {
    group = "openapi"
    language = "kotlin"
    rawOptions = listOf("-g", "jaxrs-cxf")
    inputFile = file("./plugin-openapi.yaml")
    outputDir = project.projectDir.resolve("generated")
}

tasks.compileKotlin {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}