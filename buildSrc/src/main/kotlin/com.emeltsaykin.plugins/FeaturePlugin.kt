package com.emeltsaykin.plugins

import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

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
        }
    }
}