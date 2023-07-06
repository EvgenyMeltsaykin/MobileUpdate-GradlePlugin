plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("convention.common")
}

android {
    namespace = "com.emeltsaykin.konturmobileupdategradleplugin"

    defaultConfig {
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        applicationId = "com.emeltsaykin.konturmobileupdategradleplugin"
    }
}

dependencies {
    implementation(projects.common.baseFeature)
    implementation(projects.feature.feature1)
    implementation(projects.feature.feature2)
    implementation(projects.feature.feature3)
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.6.0")
}