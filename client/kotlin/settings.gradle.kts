rootProject.name = "client"

if (file("generated").exists()) {
    includeBuild("generated")
}