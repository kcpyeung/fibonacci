(ns fib.using-iterate-test
    (:require [clojure.test :refer :all]
              [fib.using-iterate :refer :all]))

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
           (is (= 55 (fib 10))))

  (testing "500"
           (is
             (= 139423224561697880139724382870407283950070256587697307264108962948325571622863290691557658876222521294125
                (fib 500)))))

(deftest fibonacci-in-a-sequence
  (testing "2"
           (is (= '(0 1 1) (fib-iterate 2))))

  (testing "10"
           (is (= '(0 1 1 2 3 5 8 13 21 34 55) (fib-iterate 10))))

  (testing "500"
           (is
            (some
              #{139423224561697880139724382870407283950070256587697307264108962948325571622863290691557658876222521294125}
              (fib-iterate 500)))))
