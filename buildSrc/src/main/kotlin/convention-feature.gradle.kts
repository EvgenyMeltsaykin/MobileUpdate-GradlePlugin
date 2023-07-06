import com.android.build.gradle.BaseExtension
import org.gradle.api.JavaVersion

fun android(configuration: BaseExtension.() -> Unit) = configure(configuration)

plugins {
    id("com.android.library")
    id("convention-common")
}

android {
    buildFeatures.apply {
        viewBinding = true
    }
}

dependencies {
    implementation(project(":common:base-feature"))
}