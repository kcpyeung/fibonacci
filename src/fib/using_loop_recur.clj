(ns fib.using-loop-recur)

(defn fib [n]
  (loop [prev   (bigint 0)
         next   (bigint 1)
         result (bigint 1)
         i      1]
    (cond
     (= 0 n)   0
     :else     (if (= i n)
                 result
                 (recur next (+ prev next) (+ prev next) (inc i))))))

(defn fib-seq [n]
  (loop [result [(bigint 0)]
         i      0]
    (if (= i n)
      result
      (recur (conj result (fib (inc i))) (inc i)))))
