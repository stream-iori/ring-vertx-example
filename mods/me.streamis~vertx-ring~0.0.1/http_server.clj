(ns example.http-server
  (:use compojure.core)
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [vertx.http :as http]
            [vertx.repl :as repl]
            [ring.adapter.vertx :as ring-vertx]))

(def repl-server-id (atom nil))

(defroutes app
  (GET "/" [] "<h1>Hello World</h1>")
  (GET "/rest" {params :params} (str "Hello " params))
  (route/not-found "<h1>Page not found</h1>")
  )

(defn start-http-server []
  (ring-vertx/run-vertx-web (http/server) (handler/site #'app) "localhost" 8081))

(defn stop-repl-server [] (repl/stop @repl-server-id))

;;you could use repl or starting server directly.
;;(reset! repl-server-id (repl/start))
(start-http-server)


