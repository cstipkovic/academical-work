(defun apaga(l x)
	(print "a")
	(if (= (car l) x) 
		(apaga (cdr l) x)
		(print "b")
	)
)

(apaga (list 3 2 3) 3)	
