import Dependencies._

ThisBuild / scalaVersion     := "$scalaVersion$"
ThisBuild / version          := "$version$"

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    libraryDependencies += scalaTest % Test
  )