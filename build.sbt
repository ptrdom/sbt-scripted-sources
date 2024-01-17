ThisBuild / scalaVersion := "2.12.18"

lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    name := "scripted-sbt-sources",
    scriptedLaunchOpts ++= Seq(
      "-Dplugin.version=" + version.value
    ),
    scriptedBufferLog := false
  )
