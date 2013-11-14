resolvers += "Era7 maven releases"  at "http://releases.era7.com.s3.amazonaws.com"

resolvers += "Era7 maven snapshots"  at "http://snapshots.era7.com.s3.amazonaws.com"

addSbtPlugin("ohnosequences" % "nice-sbt-settings" % "0.3.0-SNAPSHOT")

// libraryDependencies += "ohnosequences" %% "literator" % "0.3.0-SNAPSHOT"

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.2.5")

addSbtPlugin("net.databinder" % "conscript-plugin" % "0.3.5")
