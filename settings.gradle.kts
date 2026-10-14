pluginManagement {
  repositories {
    maven { url = uri("${rootDir}/offline-repo") }
    google()
    mavenCentral()
    gradlePluginPortal()
  }
}

dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    maven { url = uri("${rootDir}/offline-repo") }
    google()
    mavenCentral()
  }
}

rootProject.name = "AppleGrow"

include(":app")
