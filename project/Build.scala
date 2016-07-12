import sbt.Keys._
import sbt._

/**
  * @author <a href="mailto:hyysguyang@gmail.com">Young Gu</a>
  * @author <a href="mailto:Young.Gu@lifcosys.com">Young Gu</a>
  */
object ProjectBuild extends Build {

  import BuildSettings._
  import Dependencies._

  lazy val project = Project("lifecosys-suit", file("."))
    .settings(projectBuildSettings: _*)
    .settings(libraryDependencies ++=
      compile(
        javaslang, commonsIo, jodd,slf4j
      ) ++
        test(junitInterface)
    )


}
