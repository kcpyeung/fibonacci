(ns fib.fib)

(defn fib [n]
  (loop [prev   0
         next   1
         result 1
         i      1]
    (cond
     (= 0 n)   0
     :else     (if (= i n)
                 result
                 (recur next (+ prev next) (+ prev next) (inc i))))))

(defn fib-seq [n]
  (loop [result [0]
         i      0]
    (if (= i n)
      result
      (recur (conj result (fib (inc i))) (inc i)))))
