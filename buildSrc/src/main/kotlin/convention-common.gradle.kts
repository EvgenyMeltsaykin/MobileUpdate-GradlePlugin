import com.android.build.gradle.BaseExtension
import org.gradle.api.JavaVersion

fun android(configuration: BaseExtension.() -> Unit) = configure(configuration)

plugins {
    id("org.jetbrains.kotlin.android")
}

android {
    setCompileSdkVersion(33)

    defaultConfig {
        minSdk = 26
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}