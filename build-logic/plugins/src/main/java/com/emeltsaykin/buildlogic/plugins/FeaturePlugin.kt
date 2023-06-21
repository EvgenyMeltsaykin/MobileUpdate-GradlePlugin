package com.emeltsaykin.buildlogic.plugins

import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

@Suppress("UnstableApiUsage")
class FeaturePlugin : BasePlugin() {
    override fun apply(target: Project) = target.applyAndroid()

    private fun Project.applyAndroid() {
        pluginManager.apply {
            apply("com.android.library")
            apply("org.jetbrains.kotlin.android")
            apply("convention.common")
        }

        android {
            buildFeatures.apply {
                viewBinding = true
            }
        }

        dependencies {
            implementation(project(":common:base-feature"))
            implementation("androidx.core:core-ktx:1.10.1")
            implementation("androidx.appcompat:appcompat:1.6.1")
            implementation("com.google.android.material:material:1.9.0")
        }
    }
}