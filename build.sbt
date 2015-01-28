lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "ScalaJS SJCL" 

normalizedName := "sjcl"

version := "1.0.1"

scalaVersion := "2.11.5"

organization := "edu.stanford.crypto"

jsDependencies += ProvidedJS / "sjcl.js"

credentials += {
  val ivyHome = sys.props.get("sbt.ivy.home") match {
    case Some(path) ⇒ file(path)
    case None ⇒ Path.userHome / ".ivy2"
  }
  Credentials(ivyHome / ".credentials")
}

publishTo := {
  isSnapshot.value match {
    case true =>
      Some("iDecide 3rd party Snapshots" at "https://nexus.flexis.ru/content/repositories/snapshots")
    case false =>
      Some("iDecide 3rd party Releases" at "https://nexus.flexis.ru/content/repositories/thirdparty")
  }
}
