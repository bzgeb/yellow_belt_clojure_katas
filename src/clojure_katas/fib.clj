(ns clojure-katas.fib)

;; Calculate the fibonacci sequence
;; f(0) = 0, f(1) = 1
;; f(n) = f(n-1) + f(n-2)

(defn fib-seq
  ([] (concat [0 1] (fib-seq 0 1)))
  ([a b] (lazy-seq (cons (+ a b) (fib-seq b (+ a b))))))

(defn fib[n]
  (last (take (inc n) (fib-seq))))

