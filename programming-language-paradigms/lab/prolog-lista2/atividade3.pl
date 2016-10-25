% 3. Contar o número de vezes que um certo elemento aparece em uma dada lista.
count([], _, 0).
count([H|T], H, X) :-
  count()
