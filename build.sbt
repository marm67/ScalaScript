/** Project */
name := "scalascript"

version := "1.0"

scalaVersion := "2.11.7"

// libraryDependencies ++= Seq(
// 	"org.specs2" %% "specs2-core" % "3.7.2" % "test"
// )

// scalacOptions in Test ++= Seq("-Yrangepos")

// scalacOptions in ThisBuild ++= Seq("-unchecked", "-deprecation")

// scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-language:implicitConversions")

libraryDependencies ++= Seq(
    "com.twitter" % "util-eval_2.11" % "6.33.0",
    "com.twitter" % "util-core_2.11" % "6.33.0"
)

resourceDirectory in Compile := baseDirectory.value / "resources"
