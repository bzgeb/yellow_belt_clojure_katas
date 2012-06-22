(ns clojure-katas.test.reverseword
  (:use clojure-katas.reverseword :reload)
  (:use [clojure.test])
  (:use [midje.sweet]))


(deftest reverse-word-test
  (fact (reverse-word "looc") => "cool"))
