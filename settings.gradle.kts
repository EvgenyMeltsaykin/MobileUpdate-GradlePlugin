enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "KonturMobileUpdateGradlePlugin"
include(":app")
include(":feature:feature1")
include(":common:base-feature")
include(":feature:feature2")
include(":feature:feature3")
include(":feature:feature3")
