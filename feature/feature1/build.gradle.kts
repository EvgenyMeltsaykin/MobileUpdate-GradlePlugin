plugins {
    id("convention-feature")
    id("convention-testing")
}

android {
    namespace = "com.emeltsaykin.feature.feature1"
}

dependencies {
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.6.0")
}