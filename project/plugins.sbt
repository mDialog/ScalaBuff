resolvers ++= Seq(
  "mDialog Snapshots" at "http://artifactory.mdialog.com/artifactory/snapshots",
  "mDialog Releases" at "http://artifactory.mdialog.com/artifactory/releases"
)

credentials += Credentials(Path.userHome / ".mdialog.credentials")

addSbtPlugin("com.mdialog" % "sbt-bundle-plugin" % "3.6.0-SNAPSHOT")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.2.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-osgi" % "0.5.0")