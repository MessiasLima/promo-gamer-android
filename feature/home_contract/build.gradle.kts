plugins {
    id(Android.GradlePlugin.library)
    id(Kotlin.GradlePlugin.android)
}

apply(from = "$rootDir/script/module/feature.gradle")

dependencies {
    implementation(project(Module.Core.ui))
    api(project(Module.Core.navigation_contract))
}