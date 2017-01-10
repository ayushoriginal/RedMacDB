name := """AkkaDynoDB"""

version := "1.0.0"

sbtVersion := "0.13.8"

mainClass := Some("""database.Db""")

libraryDependencies ++= Seq("com.typesafe.slick" %% "slick" % "2.1.0",
							              "mysql" % "mysql-connector-java" % "5.1.34",
                            "com.typesafe.akka" %% "akka-actor" % "2.3.8",
							              "com.typesafe.akka" %% "akka-cluster" % "2.3.8",
							              "com.typesafe.akka" %% "akka-remote" % "2.3.8",
                            "com.typesafe.akka" %% "akka-contrib" % "2.3.8",
                            "com.typesafe.akka" %% "akka-testkit" % "2.3.8")