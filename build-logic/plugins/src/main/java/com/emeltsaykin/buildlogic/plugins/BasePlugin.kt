package com.emeltsaykin.buildlogic.plugins

import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.get

fun Project.android(action: BaseExtension.() -> Unit) = (extensions["android"] as BaseExtension).run(action)

abstract class BasePlugin : Plugin<Project> {

    protected fun DependencyHandler.annotationProcessor(depName: String) {
        add("annotationProcessor", depName)
    }

    private fun DependencyHandler.kapt(dependencyNotation: Any) {
        add("kapt", dependencyNotation)
    }

    private fun DependencyHandler.api(dependencyNotation: Any) {
        add("api", dependencyNotation)
    }

    protected fun DependencyHandler.implementation(dependencyNotation: Any) {
        add("implementation", dependencyNotation)
    }

    protected fun DependencyHandler.testImplementation(dependencyNotation: Any) {
        add("testImplementation", dependencyNotation)
    }

    protected fun DependencyHandler.androidTestImplementation(dependencyNotation: Any) {
        add("androidTestImplementation", dependencyNotation)
    }
}