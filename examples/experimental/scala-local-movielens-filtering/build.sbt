
import AssemblyKeys._

assemblySettings

name := "scala-local-movielens-filtering"

organization := "myorg"

version := "0.0.1-SNAPSHOT"

libraryDependencies ++= Seq(
  "io.prediction"    %% "core"          % "0.9.1" % "provided",
  "io.prediction"    %% "engines"       % "0.9.1" % "provided",
  "org.apache.spark" %% "spark-core"    % "1.2.0" % "provided")
