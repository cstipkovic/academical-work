% Fatorial
fatorial(0,1) :- !. % predicado 'cut' - faz parar a recursao quando nao existe mais necessidade de execusão
fatorial(N, F) :-
  M is N - 1,
  fatorial(M, Z),
  F is Z * N.
