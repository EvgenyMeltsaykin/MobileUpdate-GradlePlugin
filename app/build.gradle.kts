plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("convention.common")
}

android {
    namespace = "com.emeltsaykin.konturmobileupdategradleplugin"

    defaultConfig {
        applicationId = "com.emeltsaykin.konturmobileupdategradleplugin"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
}