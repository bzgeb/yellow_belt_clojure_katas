(ns clojure-katas.reverseword)

;; Reverse a given input word

(defn reverse-word [word]
  (apply str (reverse word)))
