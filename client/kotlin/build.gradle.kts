@file:Suppress("UnstableApiUsage")

import com.vanniktech.maven.publish.SonatypeHost
import org.hidetake.gradle.swagger.generator.GenerateSwaggerCode

plugins {
    kotlin("jvm") version "1.6.21"
    id("org.hidetake.swagger.generator") version "2.19.2"
    id("com.vanniktech.maven.publish") version "0.21.0"
}

group = "app.kntrl"
version = "0.9"

sourceSets.main {
    // Include as sources to include only necessary dependencies and publish only single jar
    java.srcDirs("generated/src/main/java")
    java.srcDirs("./src")
}

repositories {
    mavenCentral()
}

dependencies {
    swaggerCodegen("org.openapitools:openapi-generator-cli:6.2.0")

    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")
    implementation("com.google.code.gson:gson:2.10")
    implementation("io.gsonfire:gson-fire:1.8.5")
    implementation("javax.ws.rs:javax.ws.rs-api:2.1.1")
    implementation("javax.annotation:javax.annotation-api:1.3.2")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("io.swagger:swagger-annotations:1.6.8")
}

tasks.register<GenerateSwaggerCode>("generateOpenapiClient") {
    group = "openapi"
    language = "java"
    inputFile = file("../openapi-no-polymorphism.yaml")
    outputDir = project.projectDir.resolve("generated")
    additionalProperties = mapOf(
        "apiPackage" to "app.kntrl.client.openapi.api",
        "invokerPackage" to "app.kntrl.client.openapi.infra",
        "modelPackage" to "app.kntrl.client.openapi.model",
        "groupId" to "app.kntrl",
        "artifactId" to "client-openapi",
        "artifactVersion" to "0.9",
        "hideGenerationTimestamp" to "true",
        "disallowAdditionalPropertiesIfNotPresent" to "false",
        "useRuntimeException" to "true",
    )
    doLast {
        file("generated/docs").walk(FileWalkDirection.BOTTOM_UP).forEach(File::delete)
        file("generated/src/test").walk(FileWalkDirection.BOTTOM_UP).forEach(File::delete)
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
tasks.compileKotlin {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}


mavenPublishing {
    publishToMavenCentral(SonatypeHost.S01)
    signAllPublications()

    pom {
        name.set("Kntrl client")
        description.set("Java/Kotlin client for Kntrl authentication server")

        licenses {
            license {
                name.set("The Apache License, Version 2.0")
                url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
            }
        }

        developers {
            developer {
                id.set("dmitryb.dev")
                name.set("Dmytro Barannik")
                email.set("dmitryb.dev@gmail.com")
            }
        }
    }
}