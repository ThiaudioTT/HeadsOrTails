
(defn flip-coin
  "Returns 0 or 1, randomly"
  []
  (rand-int 2))


(println "How many flips do you want?")
(def qtdFlips (Integer/parseInt (read-line)))

(println "You said " qtdFlips " flips")


(defn flip-till-x
  "Flips coins x times and return the total result of one of the faces"
  [x]
  (if (<= x 0)
    (flip-coin)
    (+ (flip-coin) (flip-till-x (dec x)))))

(defn percentageOfFlips
  "Return a formatted percentage of flips by head/tail"
  [nFaces timesFlipped]
  (format "%.2f%%" (* (/ nFaces (float timesFlipped)) 100)))


(println "Your result" (percentageOfFlips (flip-till-x qtdFlips) qtdFlips))