(ns fib.using-iterate)

;(defn fib [n]
;  (loop [prev   (bigint 0)
;         next   (bigint 1)
;         result (bigint 1)
;         i      1]
;    (cond
;     (= 0 n)   0
;     :else     (if (= i n)
;                 result
;                 (recur next (+ prev next) (+ prev next) (inc i))))))

(defn fib-iterate [n]
  (let [f (fn [[curr next]] [next (+ curr next)])
        x [(bigint 0) (bigint 1)]]
    (->> (take (inc n) (iterate f x))
         (map first))))
