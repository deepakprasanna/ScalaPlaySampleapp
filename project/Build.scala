import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "registration"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "com.mongodb.casbah" %% "casbah" % "2.1.5-1",
      "com.novus" %% "salat-core" % "0.0.8-SNAPSHOT",
      "com.github.twitter" %  "bootstrap"  % "2.0.2" 
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
      resolvers ++= Seq(
          "repo.novus snaps" at "http://repo.novus.com/snapshots/",
          "webjars"          at "http://webjars.github.com/m2" )

    )

}
