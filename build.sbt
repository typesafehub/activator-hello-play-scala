name := "hello-play-scala"
version := "1.0-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.5.0", 
  "org.webjars" % "bootstrap" % "2.3.1"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)

fork in run := true