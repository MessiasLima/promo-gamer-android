plugins {
    id(Android.GradlePlugin.library)
    id(Kotlin.GradlePlugin.android)
}

android {
    compileSdk = Android.compileSdk

    defaultConfig {
        minSdk = Android.minSdk
        targetSdk = Android.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

apply(from = "$rootDir/detekt.gradle")

dependencies {
    // Core
    implementation(Core.coreKtx)
    implementation(Activity.compose)
    implementation(Lifecycle.runtimeKtx)

    // Compose
    implementation(Compose.ui)
    implementation(Compose.material)
    implementation(Compose.uiToolingPreview)
    androidTestImplementation(Compose.uiTestJunit4)
    debugImplementation(Compose.uiTooling)
    debugImplementation(Compose.uiTestManifest)

    // Testing
    testImplementation(Junit.junit)
    androidTestImplementation(Test.Ext.junit)
    androidTestImplementation(Test.Espresso.core)
}