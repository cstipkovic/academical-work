; (a) - retorna 14
(print (+ (- 5 1) (+ 3 7)))

; (b) - returna a lista (1 5)
(print (list 1 (+ 2 3)))

; (c)
(if (listp 1)
  (print ((+ 1 2) (+ 3 4)))
)

; (d) - (NIL 3)
(list (and (listp 3) t) (+ 1 2))
