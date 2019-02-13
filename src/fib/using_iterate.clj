(ns fib.using-iterate)

(defn fib-iterate [n]
  (let [f (fn [[curr next]] [next (+ curr next)])
        x [(bigint 0) (bigint 1)]]
    (->> (take (inc n) (iterate f x))
         (map first))))

(defn fib [n]
  (-> (fib-iterate n)
      (nth n)))
