package com.emeltsaykin.buildlogic.plugins

const val LibNameDirectory = "libs"

data class LibraryDependence(val name: String)
data class VersionDependence(val name: String)

object DependenciesHelper {

    object Versions {
        val composeCompiler = VersionDependence("composeCompiler")
    }

    object Libs {
        val compose = LibraryDependence("compose")
    }
}