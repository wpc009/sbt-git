import com.typesafe.sbt.SbtGit.GitKeys
import com.typesafe.sbt.git.DefaultReadableGit

sbtPlugin := true

name := "sbt-git"
organization := "com.typesafe.sbt"


enablePlugins(GitVersioning)
git.baseVersion := "0.8-MAXTROPY"


libraryDependencies += "org.eclipse.jgit" % "org.eclipse.jgit.pgm" % "3.7.0.201502260915-r"

publishMavenStyle := true


GitKeys.gitReader in ThisBuild <<= baseDirectory(base => new DefaultReadableGit(base))

scriptedSettings
scriptedLaunchOpts += s"-Dproject.version=${version.value}"
