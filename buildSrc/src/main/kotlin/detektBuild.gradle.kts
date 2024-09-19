import gradle.kotlin.dsl.accessors._caaef686956ef05d8c7d73205bf1c4b7.detektPlugins
import io.gitlab.arturbosch.detekt.Detekt
import org.gradle.accessors.dm.LibrariesForLibs

plugins {
    id("io.gitlab.arturbosch.detekt")
}

private val libs = the<LibrariesForLibs>()

tasks.withType<Detekt> {
    config.setFrom("${rootProject.projectDir}/config/detekt.yml")
    outputs.upToDateWhen { false }
    autoCorrect = true
    parallel = true
    buildUponDefaultConfig = true
    allRules = true
    include("**/*.kt", "**/*.kts")
    exclude("**/resources/**", "**/build/**")
}

dependencies {
    detektPlugins(libs.detekt.ruleset.formatting)
}