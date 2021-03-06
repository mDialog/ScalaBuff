mainClass in Runtime := Some("net.sandrogrzicic.scalabuff.compiler.ScalaBuff")

// scalaVersion := "2.10.1"

// bundle plugin
bundleSettings := com.mdialog.bundle.BundleSettings(
  runInForeground = true,
  startupScriptTemplate = Some("scalabuff-compiler/scripts/scalabuff-compiler"),
  generateInitScript = false
)

// sbt-buildinfo
buildInfoSettings

sourceGenerators in Compile <+= buildInfo

buildInfoKeys := Seq[BuildInfoKey](
  name,
  version,
  scalaVersion,
  sbtVersion,
  "buildTime" -> new java.util.Date().toString
)
