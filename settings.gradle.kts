enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "HoleCounter"
include(":androidApp")
include(":shared")
include(":shared:data")
include(":shared:domain")
include(":shared:presentation")
include(":shared:presentation:ui")
include(":shared:presentation:viewmodels")
include(":shared:data:user")
