name := "ScalaWorkshopRnDDay"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
   "org.scalactic" %% "scalactic" % "3.0.5",
   "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

val ReplSession = config("repl-session") extend Test

val root = project.in(file("."))
   .configs(ReplSession)

lazy val session = TaskKey[Unit]("session")
session <<= Seq(
   console in (root, ReplSession)
).dependOn

initialCommands in (Test, console) := """
                                        | import TranslationConversion._
                                        | """.stripMargin