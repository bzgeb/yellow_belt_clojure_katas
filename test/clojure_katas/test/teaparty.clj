(ns clojure-katas.test.teaparty
  (:use [clojure-katas.teaparty] :reload)
  (:use [clojure.test])
  (:use [midje.sweet]))


(deftest tea-party-test
  (fact (welcome "Austen" true false) => "Welcome Ms. Austen")
  (fact (welcome "Orwell" false false) => "Welcome Mr. Orwell")
  (fact (welcome "Newton" false true) => "Welcome Sir Newton"))

