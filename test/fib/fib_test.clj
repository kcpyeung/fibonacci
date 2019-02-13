(ns fib.fib-test
    (:require [clojure.test :refer :all]
              [fib.fib :refer :all]))

(deftest fibonacci
  (testing "0"
           (is (= 0 (fib 0))))

  (testing "1"
           (is (= 1 (fib 1))))

  (testing "2"
           (is (= 1 (fib 2))))

  (testing "3"
           (is (= 2 (fib 3))))

  (testing "4"
           (is (= 3 (fib 4))))

  (testing "10"
           (is (= 55 (fib 10)))))

(deftest fibonacci-in-a-sequence
  (testing "2"
           (is (= '(0 1 1) (fib-seq 2))))

  (testing "10"
           (is (= '(0 1 1 2 3 5 8 13 21 34 55) (fib-seq 10)))))
