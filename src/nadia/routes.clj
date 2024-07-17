(ns nadia.routes
  (:require
   [org.httpkit.server :as server]))

3
"Nadia"
str
(str "Nadia" 5)
(str "Nadia er best")
(defn er-best [navn]
  (str navn " er best"))
(er-best "Teodor")

(def teodor-navn "Gimle")
"teodor-navnt"
teodor-navn

+
(* 1 2 3 4)

(defn del1 []
  (str "<h1 style=\"background-color:blue\">heiii!!!!!!!!!!!! </h1>"
       (+ 1 2)
       "<br>"
       "Nadia"))

(defn del2 []
  "hei")

(defn handler [req]
  {:headers {"Content-Type" "text/html"}
   :body (str (del1)
              "<br>"
              (del2))})

(defonce server (server/run-server #'handler {:port 1234}))

(comment
  (clojure.repl/doc server/run-server))
