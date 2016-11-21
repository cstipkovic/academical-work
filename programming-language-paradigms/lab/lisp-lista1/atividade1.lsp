; (a) - retorna 14.
(print (+ (- 5 1) (+ 3 7)))

; (b) - returna a lista (1 5).
(print (list 1 (+ 2 3)))

; (c) - se o objeto verificado com o listp for uma lista retorna T,
;       mas no caso da comparação abaixo, ele retorna NIL, e não imprimi nada.
(if (listp 1)
  (print ((+ 1 2) (+ 3 4)))
)

; (d) - (NIL 3) - verifica se 3 é uma lista, se for retorn T, se não retorn 3,
;       e depois retorna NIL (por 3 não ser uma lista e o elemento 3.
(list (and (listp 3) t) (+ 1 2))

; (2)
(cons 'a (cons 'b (cons 'c nil)))
(cons 'a '(b c))
(cons 'a (cons 'b '(c)))

; (3)
; (quartoElemento (list 1 2 3 4 5))
(defun quartoElemento(x)
  (car (cdr (cdr (cdr x))))
)

; (4)
(defun retornaMaior(a b)
  (if (> a b)
    a b
  )
)

; (5)
; (a)

; (b)

; (6)
(defun elementoLista (x)
  (if (null x)
    NIL
    (if (listp (car x))
      t
      (elementoLista (cdr x))
    )
  )
)
