;Problem 2

(ns json
  (:require [clojure.data.json :as json]))

(defn valid
  [src]
  (def invoice (json/read-str (slurp src)))
  (println "MAP JSON")
  (println invoice)
  (if (= invoice nil) false true))

(defn run
  [opts]
  (println "Start")
  (def src "D:\\ClojureChallenge\\files\\invoice.json")
  (def val (valid src))
  (println val)
  )
