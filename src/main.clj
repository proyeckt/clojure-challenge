;Problem 1
(ns main
      (:require [clojure.data.json :as json]))

(defn run
      [opts]
      (println "Start")

      (defn filter_items
            [in]
            (->>
                  (map (map (fn [tax] (if (= "iva" (get tax :tax/category) ) (println "Iva") (println "No Iva"))) :taxable/taxes) :items in)))

      (println "Getting Invoice")
      (def invoice (clojure.edn/read-string (slurp "D:\\ClojureChallenge\\files\\invoice.edn")))
      (println "Invoice loaded succesfully")
      (println invoice)
      (filter_items invoice))