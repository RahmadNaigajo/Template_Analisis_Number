plugins {
    kotlin("jvm") version "1.9.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.kotlin.link")
//    maven("https://repo.maven.apache.org/maven2")
    maven("https://repo1.maven.org/maven2/org")
}

dependencies {
    implementation("joda-time:joda-time:2.12.7")
    implementation("space.kscience:plotlykt-core-jvm:0.5.3")
    implementation("space.kscience:plotlykt-server:0.5.3")
    implementation("space.kscience:plotlykt-geo:0.5.3")
    implementation("space.kscience:plotlykt-geo-jvm:0.5.3")
    implementation("space.kscience:plotlykt-jupyter:0.5.3")
    implementation("space.kscience:plotlykt-script:0.5.3")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("io.deephaven:SuanShu:0.1.0")
    implementation(kotlin("script-runtime"))
//    implementation("org.jetbrains.kotlinx:dataframe:0.10.1")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)

//    jvmToolchain(11)

}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.freeCompilerArgs = kotlinOptions.freeCompilerArgs +"-Xopt-in=kotlin.RequiresOptIn"
}

//val copyPlotlyResources by tasks.creating(Copy::class){
//    dependsOn(":plotlykt-core:jvmProcessResources")
//    mustRunAfter(":plotlykt-core:jvmTestProcessResources")
//    from(project(":plotlykt-core").layout.buildDirectory.file("processedResources/jvm"))
//    into(layout.buildDirectory.file("resources"))
//}
//
//tasks.getByName("classes").dependsOn(copyPlotlyResources)