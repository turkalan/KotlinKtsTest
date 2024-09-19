import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidUiLibraryConventionPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.run {
            applyPlugins()
        }
    }
    private fun Project.applyPlugins() {
        pluginManager.apply {
            apply("baseUiBuild")
            apply("com.turkalan.build.variants.plugin")
        }
    }
}