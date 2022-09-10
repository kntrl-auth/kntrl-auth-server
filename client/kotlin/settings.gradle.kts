rootProject.name = "kotlin-client"

if (file("generated").exists()) {
    includeBuild("generated")
}