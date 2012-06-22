(ns clojure-katas.teleprompter
  (:use [clojure.string :only (replace)]))

;; Given an input text string and a list of slang words and their
;; translations
;; return the cleansed input string of the slang words

(def dict {"derp" "dumb" "herp" "dance" "fap" "jazz"})
(def input "Hello herp derp fap jump and stuff")

(defn translate [input-string dictionary]
  (loop [s input-string d dictionary]
    (if-not (empty? d)
      (let [k (key (first d)) v (val (first d))]
        (recur (clojure.string/replace s (re-pattern k) v) (rest d)))
      s)))
