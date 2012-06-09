(ns primes.core
  (:use clojure.test)
  )

(with-test
  (defn primes [numbers]
    (if (empty? numbers) []
    (cons (first numbers) 
          (primes (filter #(not= (rem % (first numbers)) 0) (rest numbers))))))
  (is (= (primes []) []))
  (is (= (primes [2 3]) [2 3]))
  (is (= (primes [2 3 4]) [2 3]))
  (is (= (primes (range 2 30)) [2 3 5 7 11 13 17 19 23 29]))
)