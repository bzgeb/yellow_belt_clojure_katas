(ns clojure-katas.teaparty)

;; welcome should return the greeting with the proper title depending
;; on whether it is a man, woman, or knight
;; A woman is addressed as Ms.
;; A man is addressed as Mr.
;; A knight is addressed as Sir
;; The return string should be "Welcome (the title) (last name)

(defn welcome [last-name is-woman? is-sir?]
  (let [f (fn [title] (str "Welcome " title))]
    (str (cond is-sir?   (f "Sir ")
               is-woman? (f "Ms. ")
               true      (f "Mr. ")) last-name)))
