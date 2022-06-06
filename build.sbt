ThisBuild / version := "0.1"

ThisBuild / scalaVersion := "2.13.8"


lazy val root = (project in file("."))
  .settings(
    name := "ODataUriParser",
    libraryDependencies ++= Seq(
      "org.scalatest" % "scalatest_2.13" % "3.2.12" % Test,
      "org.scala-lang.modules" % "scala-parser-combinators_2.13" % "2.1.1"
    )
  )
