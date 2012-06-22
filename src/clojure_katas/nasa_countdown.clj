(ns clojure-katas.nasa-countdown)

;; Countdown should return a list counting down from the start all the
;; way to zero

(defn countdown [start]
  (reverse (range 0 (inc start))))
