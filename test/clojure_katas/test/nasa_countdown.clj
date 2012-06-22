(ns clojure-katas.test.nasa-countdown
  (:use [clojure-katas.nasa-countdown] :reload)
  (:use [clojure.test])
  (:use [midje.sweet]))


(deftest countdown-test
  (fact (countdown 5) => '(5 4 3 2 1 0))
  (fact (countdown 0) => '(0)))



