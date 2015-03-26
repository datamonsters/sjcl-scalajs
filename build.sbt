lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "ScalaJS SJCL" 

normalizedName := "sjcl"

version := "1.0.2"

scalaVersion := "2.11.6"

organization := "edu.stanford.crypto"

jsDependencies += ProvidedJS / "sjcl.js"

publishTo := {
  isSnapshot.value match {
    case true =>
      Some("iDecide 3rd party Snapshots" at "https://nexus.flexis.ru/content/repositories/snapshots")
    case false =>
      Some("iDecide 3rd party Releases" at "https://nexus.flexis.ru/content/repositories/thirdparty")
  }
}
