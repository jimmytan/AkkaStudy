name := "AkkaStudy"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= {
  val akkaVersion = "2.4.17"
  Seq(
    "com.typesafe.akka" %% "akka-actor"      % akkaVersion,
    "com.typesafe.akka" %% "akka-http-core" % "10.0.4",
    "com.typesafe.akka" %% "akka-http" % "10.0.4",
    "com.typesafe.akka" %% "akka-http-spray-json" % "10.0.4",
    "com.typesafe.akka" %% "akka-slf4j"      % akkaVersion,
    "ch.qos.logback"    %  "logback-classic" % "1.1.7",
    "com.typesafe.akka" %% "akka-testkit"    % akkaVersion   % "test",
    "org.scalatest"     %% "scalatest"       % "3.0.1"       % "test"
  )
}