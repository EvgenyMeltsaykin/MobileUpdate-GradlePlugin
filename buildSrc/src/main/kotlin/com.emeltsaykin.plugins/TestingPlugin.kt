package com.emeltsaykin.plugins

import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class TestingPlugin : BasePlugin() {
    override fun apply(target: Project) = target.applyAndroid()

    private fun Project.applyAndroid() {
        dependencies {
            testImplementation("junit:junit:4.13.2")
            androidTestImplementation("androidx.test.ext:junit:1.1.5")
            androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
        }
    }
}