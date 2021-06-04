name := "$name;format="lower,hyphen"$"
organization := "$base_package$"

scalaVersion := "3.0.0"
scalacOptions := Settings.compilerOptions

libraryDependencies ++= Libs.libraryDependencies
testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")