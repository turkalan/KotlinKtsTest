import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidUiLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            applyPlugins()
        }
    }
    private fun Project.applyPlugins() {
        pluginManager.apply {
            apply("baseUiBuild")
            apply("com.turkalan.build.config.plugin")
        }
    }
}