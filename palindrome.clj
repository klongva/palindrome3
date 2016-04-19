;; Project 4 from the Project Euler project, compute the Largest palindrome product

(defn palindrome-string? [s]
  ;; takes a string, reverses it, and in sequence determines if the strings are equal.
  (= (seq s) (reverse s)))
  
(defn palindrome? [n]
  ;; pass the number to be tested to a string to palindrome-string to take advantage of the reverse function.
  (palindrome-string? (str n)))


(defn max-palindrome []
  ;; multiple a pair of numbers together over the range of three digit numbers, removing duplicates where the second number is
  ;; smaller than the first.  Sort the results in descending order.  Test for palindromes, stopping on the first found, since
  ;; it will be largest.
  (first (filter palindrome? 
           (sort > (for [x (range 100 999) y (range x 999)]
                     (* x y))))))
