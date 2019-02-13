(ns fib.fib-test
    (:require [clojure.test :refer :all]
              [fib.fib :refer :all]))

(deftest fibonacci
  (testing "2"
           (is (= 2 (fib 2))))

  (testing "10"
           (is (= 89 (fib 10)))))

(deftest fibonacci-in-a-sequence
  (testing "2"
           (is (= '(1 2) (fib-seq 2))))

  (testing "10"
           (is (= '(1 2 3 5 8 13 21 34 55 89) (fib-seq 10)))))
