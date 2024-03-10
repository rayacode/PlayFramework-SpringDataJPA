name := """PlayFramework-SpringDataJPA"""
organization := "com.rayacode.PlayFramework-SpringDataJPA"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.13"

libraryDependencies ++= Seq(
  guice,
  javaJpa,
  "org.springframework.boot" % "spring-boot-starter-validation" % "3.2.3",
  "org.springframework" % "spring-context" % "6.1.4",
  "javax.validation" % "validation-api" % "2.0.1.Final",
  "jakarta.annotation" % "jakarta.annotation-api" % "2.1.1",
  "jakarta.activation" % "jakarta.activation-api" % "2.1.2",
  "jakarta.xml.bind" % "jakarta.xml.bind-api" % "4.0.1",
  "org.jboss.logging" % "jboss-logging" % "3.5.3.Final",
  "jakarta.validation" % "jakarta.validation-api" % "3.0.2",
  "net.bytebuddy" % "byte-buddy" % "1.14.11",
  "org.springframework.data" % "spring-data-jpa" % "3.2.3",
  "org.hibernate.orm" % "hibernate-core" % "6.4.4.Final",
  "org.hibernate.validator" % "hibernate-validator" % "8.0.1.Final",
  "org.hibernate.common" % "hibernate-commons-annotations" % "6.0.6.Final",
  "org.mariadb.jdbc" % "mariadb-java-client" % "3.3.3"
)
