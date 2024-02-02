plugins {
    id("java")
}

group = "com.shipmonk.hiring.mikesjan"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:${project.properties["lombokVersion"]}")
    annotationProcessor("org.projectlombok:lombok:${project.properties["lombokVersion"]}")

    testImplementation(platform("org.junit:junit-bom:${project.properties["junitVersion"]}"))
    testImplementation(platform("org.assertj:assertj-bom:${project.properties["assertjVersion"]}"))
    testImplementation(platform("org.mockito:mockito-bom:${project.properties["mockitoVersion"]}"))

    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core")
    testImplementation("org.mockito:mockito-core")
    testImplementation("org.mockito:mockito-junit-jupiter")

    testCompileOnly("org.projectlombok:lombok:${project.properties["lombokVersion"]}")
    testAnnotationProcessor("org.projectlombok:lombok:${project.properties["lombokVersion"]}")
}

tasks.test {
    useJUnitPlatform()
}