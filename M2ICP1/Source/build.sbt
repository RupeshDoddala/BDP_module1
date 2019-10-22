name := "ICP1"

version := "0.1"

scalaVersion := "2.13.1"



libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.3.0",
  "org.apache.spark" %% "spark-sql" % "2.3.0",
  "org.apache.spark" % "spark-parent" % "1.4.1",
  "org.apache.spark" % "spark-mllib-local" % "2.4.0"
)