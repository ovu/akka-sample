name := "HelloWorld"

version := "0.1"

scalaVersion := "2.12.7"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= {
  // Dependencies
  val akkaVersion = "2.4.20"

  Seq(
    "com.typesafe.akka"            %% "akka-actor"                  % akkaVersion
  )
}
