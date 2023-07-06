package com.emeltsaykin.buildlogic.plugins

import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

@Suppress("UnstableApiUsage")
class FeatureComposePlugin : BasePlugin() {
    override fun apply(target: Project) = target.applyAndroid()

    private fun Project.applyAndroid() {
        pluginManager.apply {
            apply("com.android.library")
            apply("org.jetbrains.kotlin.android")
            apply("convention.common")
        }

        android {
            buildFeatures.apply {
                compose = true
            }

            composeOptions {
                kotlinCompilerExtensionVersion = getVersion(getVersionCatalog(), DependenciesHelper.Versions.composeCompiler)
            }
        }

        dependencies {
            implementation(project(":common:base-feature"))
            implementation(getVersionCatalog(), DependenciesHelper.Libs.compose)
        }
    }
}