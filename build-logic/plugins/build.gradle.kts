plugins {
    `kotlin-dsl`
}

dependencies {
    compileOnly("com.android.tools.build:gradle:7.0.4")
    compileOnly("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
}

gradlePlugin {
    plugins {
        register("common-plugin") {
            id = "convention.common"
            implementationClass = "com.emeltsaykin.buildlogic.plugins.CommonPlugin"
        }
        register("feature-plugin") {
            id = "convention.feature"
            implementationClass = "com.emeltsaykin.buildlogic.plugins.FeaturePlugin"
        }
        register("test-plugin") {
            id = "convention.testing"
            implementationClass = "com.emeltsaykin.buildlogic.plugins.TestingPlugin"
        }
    }
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}