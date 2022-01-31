plugins {
    id("com.android.application") version "7.1.0" apply false
    id("com.android.library") version "7.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.5.21" apply false
    id(Detekt.gradlePlugin) version Detekt.version
}

tasks.register("clean").configure {
    delete(rootProject.buildDir)
}