rootProject.name = "kt-client"

if (file("generated").exists()) {
    includeBuild("generated")
}