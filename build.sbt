lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "ScalaJS SJCL" 

normalizedName := "sjcl"

version := "0.1.0"

scalaVersion := "2.11.5"

organization := "ru.idecide"

jsDependencies += ProvidedJS / "sjcl.js"
