plugins {
    java
    id("org.spongepowered.gradle.vanilla") version "0.2"
}

group = "com.expansemc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.spongepowered.org/repository/maven-public/")
}

minecraft {
    version("1.16.5")

    runs {
        server()
        client()
    }

    accessWideners("src/main/resources/starlight.accesswidener")
}

dependencies {
    compileOnly("org.spongepowered:spongeapi:8.0.0-SNAPSHOT")
    compileOnly("org.spongepowered:mixin:0.8.3-SNAPSHOT")
}

tasks {
    jar {
        manifest {
            attributes(
                "Access-Widener" to "starlight.accesswidener",
                "Mixin-Configs" to "starlight.mixins.json"
            )
        }
    }
}