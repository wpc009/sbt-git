sbtPlugin := true

name := "sbt-git"
organization := "com.typesafe.sbt"


enablePlugins(GitVersioning)
git.baseVersion := "0.8-MAXTROPY"


libraryDependencies += "org.eclipse.jgit" % "org.eclipse.jgit.pgm" % "3.7.0.201502260915-r"

publishMavenStyle := false


scriptedSettings
scriptedLaunchOpts += s"-Dproject.version=${version.value}"
