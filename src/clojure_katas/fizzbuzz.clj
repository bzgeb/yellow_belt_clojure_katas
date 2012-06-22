(ns clojure-katas.fizzbuzz)

;; answer should return "fizz" for n divisible by 3,
;; "buzz" for n divisible by 5
;; and "fizzbuzz" for n divisible by 5 and 3
;; otherwise just the number

(defn answer [n]
  (let [f #(if (zero? (mod n %)) %2)]
    (#(if-not (empty? %) % n) (str (f 3 "fizz") (f 5 "buzz")))))

