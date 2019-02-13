(ns fib.fib)

(defn fib [n]
  (loop [prev   0
         next   1
         result 0
         i      0]
    (if (= i n)
      result
      (recur next (+ prev next) (+ prev next) (inc i)))))
