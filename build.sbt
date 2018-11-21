organization := "io.github.ChrisHagan"

name := "lift-clojurescript"

version := "0.0.1"

sbtPlugin := true

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases"

libraryDependencies ++= Seq(
  "args4j" % "args4j" % "2.0.25",
  "com.google.protobuf" % "protobuf-java" % "2.5.0",
  "org.clojure" % "clojure" % "1.6.0",
  "org.clojure" % "clojurescript" % "0.0-2342"
)

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>https://github.com/ChrisHagan/lift-clojurescript</url>
  <licenses>
    <license>
      <name>Eclipse Public License - v1.0</name>
      <url>http://www.eclipse.org/org/documents/epl-v10.html</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:ChrisHagan/lift-clojurescript.git</url>
    <connection>scm:git:git@github.com:ChrisHagan/lift-clojurescript.git</connection>
  </scm>
  <developers>
  <developer>
  <id>ChrisHagan</id>
  <name>Chris Hagan</id>
  </developer>
    <developer>
      <id>petro-rudenko</id>
      <name>Peter Rudenko</name>
      <url>https://twitter.com/peter_rud</url>
    </developer>
  </developers>)
