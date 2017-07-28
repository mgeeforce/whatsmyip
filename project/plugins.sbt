resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += "Temp Typesafe repository" at "https://dl.bintray.com/sbt/sbt-plugin-releases/"

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-play-ebean" % "4.0.0-RC1")
addSbtPlugin("com.typesafe.sbt" % "sbt-play-enhancer" % "1.2.1")


addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.1.0")

addSbtPlugin("com.heroku" % "sbt-heroku" % "1.0.1")
