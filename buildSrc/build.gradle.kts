plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

gradlePlugin {
    plugins {
        register("common-plugin") {
            id = "convention.common"
            implementationClass = "com.emeltsaykin.plugins.CommonPlugin"
        }
        register("feature-plugin") {
            id = "convention.feature"
            implementationClass = "com.emeltsaykin.plugins.FeaturePlugin"
        }
        register("test-plugin") {
            id = "convention.testing"
            implementationClass = "com.emeltsaykin.plugins.TestingPlugin"
        }
    }
}

dependencies {
    implementation("com.android.tools.build:gradle:7.0.4")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.20")
}
