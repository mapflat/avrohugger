import sbtavrohugger.AvrohuggerSettings.avroScalaCustomTypes

sbtavrohugger.SbtAvrohugger.specificAvroSettings

(avroScalaCustomTypes in avroConfig) := Map("array" -> classOf[Array[_]])

organization := "com.julianpeeters"

name := "datatype-specific-array-serializaton-tests"

version := "0.4-SNAPSHOT"

// 2.10 because scalavro is used for a single test, and it's stalled at 2.10
scalaVersion := "2.10.6"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Ywarn-value-discard")

libraryDependencies += "org.apache.avro" % "avro" % "1.7.7"

libraryDependencies += "org.apache.avro" % "avro-ipc" % "1.7.7"

libraryDependencies += "com.gensler" %% "scalavro" % "0.6.2"

libraryDependencies += "org.specs2" %% "specs2" % "2.4" % "test"