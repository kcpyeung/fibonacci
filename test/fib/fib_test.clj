(ns fib.fib-test
    (:require [clojure.test :refer :all]
              [fib.fib :refer :all]))

(deftest fibonacci
  (testing "2"
           (is (= 2 (fib 2))))

  (testing "10"
           (is (= 89 (fib 10)))))
