import sbt._
import Keys._

object MyBuild extends Build{
    lazy val root = Project(
        "IP4S",
        file("."),
        settings = Seq(
            version := "1.0.0",
            scalaVersion := "2.12.0",
            libraryDependencies ++= Seq(
                "org.scalatest" %% "scalatest" % "3.0.1" % "test",
                "junit" % "junit" % "4.11" % "test"
            )
        )
    )
}
