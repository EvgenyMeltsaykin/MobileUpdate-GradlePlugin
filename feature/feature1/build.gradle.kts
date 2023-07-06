plugins {
    id("convention.feature.view")
    id("convention.testing")
}

android {
    namespace = "com.emeltsaykin.feature.feature1"
}

dependencies {
    implementation(libs.coreKtx)
    implementation(libs.appcompat)
    implementation(libs.material)
}