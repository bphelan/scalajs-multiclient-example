name := "slinky-multi-client-example"

organization := "com.example"

scalaVersion := "2.12.4"

scalacOptions ++= Seq("-feature", "-deprecation")

lazy val common: Project = project

lazy val webClient: Project = project.in(file("web-client")).dependsOn(common)

lazy val mobileClient: Project = project.in(file("mobile-client")).dependsOn(common)

lazy val desktopClient: Project = project.in(file("desktop-client")).dependsOn(common)
