ring-vertx-example
==================

The example of ring-vertx.
For the simplistic, this example use compojure as router.

## How to run it with vertx

1. add lang supporting to langs.properties with
`clojure=io.vertx~lang-clojure~1.0.0-SNAPSHOT:io.vertx.lang.clojure.ClojureVerticleFactory`
`.clj=clojure`

2. clone this project

3. `cd ring-vertx-example` and `vertx runmod me.streamis~vertx-ring~0.0.1`

4. open new tab in brower and input `http://localhost:8081`
