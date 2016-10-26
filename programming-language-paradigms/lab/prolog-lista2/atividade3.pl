% 3. Contar o número de vezes que um certo elemento aparece em uma dada lista.
count([], _, 0).
count([H|T], H, X) :-
  count(T, H, C),
  X is C + 1.
count([H|T], N, X) :-
  count(T, N, X),
  H\=N.
