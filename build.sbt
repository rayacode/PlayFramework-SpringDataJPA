name := """PlayFramework-SpringDataJPA"""
organization := "com.rayacode.PlayFramework-SpringDataJPA"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.13"

libraryDependencies ++= Seq(
  guice,
  javaJpa,
    
  "org.springframework" % "spring-context" % "6.1.10",
  
  "javax.validation" % "validation-api" % "2.0.1.Final",
  "org.springframework.boot" % "spring-boot-starter-validation" % "3.3.1",
  "org.springframework.boot" % "spring-boot-starter-data-jpa" % "3.3.1",

  "org.mariadb.jdbc" % "mariadb-java-client" % "3.3.3",
  
  "org.hibernate.orm" % "hibernate-jcache" % "6.5.2.Final",
  "org.ehcache" % "ehcache" % "3.10.8" classifier "jakarta",
 
 
)
