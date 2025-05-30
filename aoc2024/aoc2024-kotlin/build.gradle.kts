plugins {
    alias(aoc2024Libs.plugins.kotlin.jvm)
}

dependencies {
    api(project(":aoc-utils"))

    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation(aoc2024Libs.kotlinx.coroutines)

    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    testImplementation(aoc2024Libs.kotlinx.coroutines.test)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.named<Jar>("jar") {
    manifest {
        attributes["Implementation-Title"] = project.name
        attributes["Implementation-Version"] = project.version
    }
}
