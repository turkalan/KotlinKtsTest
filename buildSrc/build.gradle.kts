plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    maven(url = "https://jitpack.io")
    gradlePluginPortal()
}

gradlePlugin {
    plugins {
        register("buildVariantsPlugin") {
            id = "com.turkalan.build.variants.plugin"
            implementationClass = "BuildVariantsConventionPlugin"
        }
        register("androidLibrary") {
            id = "com.turkalan.android.library.plugin"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidUiLibrary") {
            id = "com.turkalan.android.ui.library.plugin"
            implementationClass = "AndroidUiLibraryConventionPlugin"
        }
    }
}

dependencies {
    implementation(files((libs as Any).javaClass.superclass.protectionDomain.codeSource.location))
    implementation(libs.android.gradle.plugin)
    implementation(libs.kotlin.gradle.plugin)
    implementation(libs.compose.compiler.plugin)
    implementation(libs.google.services)
    implementation(libs.detekt.gradle.plugin)
}