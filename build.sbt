name := """whatsmyip"""
organization := "io.adeptus"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  guice,
  jdbc,
  ehcache,
  ws,
  "org.postgresql" % "postgresql" % "9.4.1212",
  "org.assertj" % "assertj-core" % "3.6.2" % Test,
  "org.awaitility" % "awaitility" % "2.0.0" % Test,
  "com.typesafe.play" %% "play-json" % "2.6.0-RC1"
  //"com.typesafe.play" %% "play-ahc-ws-standalone" % "1.0.0-RC2"
)
  
// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))
  