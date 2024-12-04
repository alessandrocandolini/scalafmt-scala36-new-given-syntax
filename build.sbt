lazy val root = (project in file("."))
  .settings(
    scalaVersion := "3.6.2-RC3",
    scalafmtOnCompile := false,
    scalacOptions ++= Seq(
      "-deprecation",
      "-unchecked",
      "-feature",
      "-encoding",
      "utf8",
      "-source:future"
    )
  )
