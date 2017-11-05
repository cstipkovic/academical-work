% 2. Encontrar o k-ésimo elemento de uma lista.
kth([Head|Tail], 0, X) :- !.
kth([Head|_], 1, Head).

kth([_|Tail], Position, X) :-
  Ni is Position - 1,
  kth(Tail, Ni, X).
