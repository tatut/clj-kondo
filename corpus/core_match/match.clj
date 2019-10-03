(ns core-match.match
  (:require [clojure.core.match :as m]))


(let [v [1 2 3]]
  (m/match v
           [a _ _] (println "first number is " a)
           :else (println "got something other than vector of three")))
