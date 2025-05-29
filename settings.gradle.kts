plugins {
    id("com.gradle.develocity") version("4.0.2")
}

rootProject.name = "advent-of-code-2024"

include("aoc2024")
include("aoc2024:aoc2024-kotlin")

include("utils")
include("utils:utils-java")
include("utils:utils-kotlin")
