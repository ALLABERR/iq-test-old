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
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
rootProject.name = "iq"
include(":app")
include(":core:domain")
include(":core:data")
include(":ui:localization")
include(":ui:assets")
include(":ui:system")
include(":feature:home")
include(":core:navigation")
include(":feature:intro")
