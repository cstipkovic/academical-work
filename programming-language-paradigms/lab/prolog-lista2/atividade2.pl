% 2. Encontrar o k-ésimo elemento de uma lista.
kth([H|T], 0, X) :- !.
kth([H|_], 1, H).

kth([_|T], N, X) :-
  Ni is N - 1,
  kth(T, Ni, X).
