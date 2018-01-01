aluno(paulo).
aluno(joao).
aluno(lucas).
estuda(joao).
estuda(lucas).
aprovado(X) :- 
    aluno(X), 
    estuda(X).
