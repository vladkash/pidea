plugins {
    id("java")
    id("org.jetbrains.intellij") version "1.4.0"
    id("org.jetbrains.grammarkit") version "2021.2.2"
}

group = "ru.itmo"
version = "1.0-SNAPSHOT"

idea.module.generatedSourceDirs.plusAssign(file("main/gen"))
sourceSets["main"].java.srcDirs("src/main/gen")
sourceSets["main"].java.srcDirs("src/main/test")


repositories {
    mavenCentral()
}

// Configure Gradle IntelliJ Plugin - read more: https://github.com/JetBrains/gradle-intellij-plugin
intellij {
    version.set("2021.2")
    type.set("IC") // Target IDE Platform

    plugins.set(listOf("com.intellij.java"))

}

tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "11"
        targetCompatibility = "11"
    }

    patchPluginXml {
        sinceBuild.set("212")
        untilBuild.set("222.*")
    }

    signPlugin {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
        privateKey.set(System.getenv("PRIVATE_KEY"))
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }

    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }
}
