plugins {
    java
    id("org.spongepowered.gradle.vanilla") version "0.2"
}

group = "com.expansemc"
version = "0.2.0"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

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
                "MixinConfigs" to "starlight.mixins.json"
            )
        }
    }
}