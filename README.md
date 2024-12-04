# Scala 3.6 new given syntax and scalafmt

A minimal working example to experiment with scalafmt support for the new given syntax in the upcoming Scala 3.6 release.
* https://github.com/scala/scala3/blob/main/docs/_docs/reference/contextual/more-givens.md
* https://docs3.scala-lang.org/sips/sips/typeclasses-syntax.html

This project compiles, see 
```
sbt compile
```
but running 
```
sbt scalafmt
```
leads to  
```bash
[info] scalafmt: Formatting 1 Scala sources (scalafmt-scala36-new-given-syntax)...
[error] org.scalafmt.sbt.ScalafmtSbtReporter$ScalafmtSbtError: scalafmt: scalafmt-scala36-new-given-syntax/src/main/scala/com/xyz/Main.scala:6: error: [dialect scala3] `identifier` expected but `indent` found
[error] given Show[Boolean]:
[error]                     ^ [scalafmt-scala36-new-given-syntax/src/main/scala/com/xyz/Main.scala]
[error] (Compile / scalafmt) org.scalafmt.sbt.ScalafmtSbtReporter$ScalafmtSbtError: scalafmt: scalafmt-scala36-new-given-syntax/src/main/scala/com/xyz/Main.scala:6: error: [dialect scala3] `identifier` expected but `indent` found
[error] given Show[Boolean]:
[error]                     ^ [scalafmt-scala36-new-given-syntax/src/main/scala/com/xyz/Main.scala]
```

Code of the test [here](src/main/scala/com/xyz/Main.scala)

## Configuration
* Scala 3.6.2-RC3
* sbt 1.10.6
* sbt-scalafmt 2.5.2
* scalafmt 3.8.4-RC3



