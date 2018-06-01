import sbtcrossproject.CrossPlugin.autoImport.{crossProject, CrossType}
// crossScalaVersions in ThisBuild := Seq("2.11.8", "2.12.0")
// crossScalaVersions in ThisBuild := Seq("2.12.6")
// scalaVersion in ThisBuild := crossScalaVersions.value.head
scalaVersion in ThisBuild := "2.12.6"

lazy val `scala-unboxed-option` = crossProject(
  JSPlatform,
  JVMPlatform).
  withoutSuffixFor(JVMPlatform).
  crossType(CrossType.Pure).
  in(file(".")).
  settings(
    name := "scala-unboxed-option",
    version := "0.1-SNAPSHOT",
    organization := "be.doeraene",
    scalacOptions ++= Seq(
      "-deprecation",
      "-feature",
      "-Xfatal-warnings",
      "-encoding", "utf8"
    ),

    libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.5" % "test",
    scalacOptions in Test -= "-Xfatal-warnings"
  )

lazy val `scala-unboxed-optionJVM` = `scala-unboxed-option`.jvm
lazy val `scala-unboxed-optionJS` = `scala-unboxed-option`.js

// Avoid errors from default project.
libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.5" % "test",

// name := "scala-unboxed-option"
// version := "0.1-SNAPSHOT"
// organization := "be.doeraene"
// scalacOptions ++= Seq(
//   "-deprecation",
//   "-feature",
//   "-Xfatal-warnings",
//   "-encoding", "utf8"
// )

// libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.5" % "test"
// scalacOptions in Test -= "-Xfatal-warnings"
