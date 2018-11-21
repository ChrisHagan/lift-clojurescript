# lift-clojurescript - ClojureScript to JavaScript compiler for Scala lift

## About

This plugin is initially based on [play-clojurescript](https://bitbucket.org/jmhofer/play-clojurescript). 


This plugin deviates by not requiring the Play chain and compiling main/cljs to JavaScript files.

## Installation

Add the plugin and the repository to your application's `project/plugins.sbt`:

    addSbtPlugin("io.github.ChrisHagan" % "lift-clojurescript" % "0.0.1")

This adds the ClojureScript asset compiler to your project. `*.cljs` files beneath `main/cljs` 
will then be automatically compiled to `*.js` and `*.min.js` files.

## Use clojurescript libraries

Add clojars dependencies to plugins.sbt:

    resolvers += "clojars" at "http://clojars.org/repo/"

    resolvers += "clojure-releases" at "http://build.clojure.org/releases"

    libraryDependencies ++= Seq(
      "prismatic" % "schema" % "0.1.3"
    )


## License

[Eclipse Public License - v1.0](http://www.eclipse.org/org/documents/epl-v10.html)
