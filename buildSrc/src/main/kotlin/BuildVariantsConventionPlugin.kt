import com.android.build.gradle.AppExtension
import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.TestedExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class BuildVariantsConventionPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.plugins.withId("com.android.application") {
            // If it's an Android app, apply app-specific configuration
            val androidApp = project.extensions.getByType(AppExtension::class.java)
            configureBuildVariants(androidApp)
        }

        project.plugins.withId("com.android.library") {
            // If it's an Android library, apply library-specific configuration
            val androidLib = project.extensions.getByType(LibraryExtension::class.java)
            configureBuildVariants(androidLib)
        }
    }

    private fun configureBuildVariants(extension: TestedExtension) {
        if (extension is AppExtension || extension is LibraryExtension) {
            extension.apply {
                buildTypes {
                    getByName(RELEASE) {
                        isMinifyEnabled = true
                        isDebuggable = false
                        if (extension is AppExtension) isShrinkResources = true
                        proguardFiles(
                            getDefaultProguardFile("proguard-android-optimize.txt"),
                            "proguard-rules.pro"
                        )
                    }
                    getByName(DEBUG) {
                        isMinifyEnabled = false
                        isDebuggable = true
                        if (extension is AppExtension) {
                            isShrinkResources = false
                            applicationIdSuffix = DEBUG_ID_SUFFIX
                        }
                    }
                }
            }
        }
    }
    companion object {
        const val RELEASE = "release"
        const val DEBUG = "debug"
        const val DEBUG_ID_SUFFIX = ".$DEBUG"
    }
}
