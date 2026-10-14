pluginManagement {
  repositories {
    maven { url = uri("${rootDir}/offline-repo") }
    google()
    mavenCentral()
    gradlePluginPortal()
  }
}

plugins { id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0" }

dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    maven { url = uri("${rootDir}/offline-repo") }
    google()
    mavenCentral()
  }
}

rootProject.name = "Horti AI"

include(":app")
