plugins {
    id("java-library")
    id(Kotlin.GradlePlugin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation(project(AppModule.domain))
}