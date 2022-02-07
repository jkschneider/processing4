plugins {
  `java`
  `maven-publish`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.jogamp.jogl:jogl-all-main:2.3.2")
  implementation("org.jogamp.gluegen:gluegen-rt-main:2.3.2")
}

sourceSets {
  main {
      java {
          setSrcDirs(listOf("src"))
      }
  }
}

publishing {
  publications {
      create<MavenPublication>("maven") {
          groupId = "com.jkschneider"
          artifactId = "processing4"
          version = "4.0-b5"

          from(components["java"])
      }
  }
}