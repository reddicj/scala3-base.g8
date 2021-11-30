name := "$name;format="lower,hyphen"$"
organization := "$base_package$"

scalaVersion := "3.1.0"
scalacOptions := Settings.compilerOptions
semanticdbEnabled := true
semanticdbVersion := scalafixSemanticdb.revision
ThisBuild / scalafixDependencies += "com.github.liancheng" %% "organize-imports" % "0.5.0"
ThisBuild / scalafixScalaBinaryVersion := "3.0"

libraryDependencies ++= Libs.libraryDependencies
testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")