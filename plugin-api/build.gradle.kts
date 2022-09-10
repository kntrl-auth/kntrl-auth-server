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
    swaggerCodegen("org.openapitools:openapi-generator-cli:6.0.0")
    implementation("kntrl:client:1.0")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
}

tasks.register<GenerateSwaggerCode>("generateApi") {
    group = "openapi"
    language = "kotlin"
    rawOptions = listOf("-g", "jaxrs-cxf")
    inputFile = file("../../backend/core/build/resources/main/static/plugin-openapi.yaml")
    outputDir = project.projectDir.resolve("generated")
//    additionalProperties = mapOf(
//        "apiPackage" to "kntrl.client.generated.api",
//        "invokerPackage" to "kntrl.client.generated.infra",
//        "modelPackage" to "kntrl.client.generated.model",
//        "groupId" to "kntrl",
//        "artifactId" to "client",
//        "artifactVersion" to "1.0",
//    )
//    doLast {
//        file("generated/docs").walk(FileWalkDirection.BOTTOM_UP).forEach(File::delete)
//        file("generated/src/test").walk(FileWalkDirection.BOTTOM_UP).forEach(File::delete)
//    }
}

tasks.compileKotlin {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}