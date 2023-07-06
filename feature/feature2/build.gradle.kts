plugins {
    id("convention.feature.compose")
}

android {
    namespace = "com.emeltsaykin.feature.feature2"
}

dependencies {
    implementation(libs.coreKtx)
    implementation(libs.appcompat)
}