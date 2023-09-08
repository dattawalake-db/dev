ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.18"

lazy val root = (project in file("."))
  .settings(
    name := "Scala-Sbt-DAB"
  )


lazy val Versions = new {

  val spark = "3.2.0"

}

libraryDependencies += "org.apache.spark" %% "spark-core" % Versions.spark
libraryDependencies += "org.apache.spark" %% "spark-sql" % Versions.spark



