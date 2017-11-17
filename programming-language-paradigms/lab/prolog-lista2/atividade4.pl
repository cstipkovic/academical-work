% 4. Remover de um lista todas as ocorrências de um dado valor.
remove_value([], _, 0) :- !.
remove_value([H|T], H, T).
remove_value([H|T], E, [H|T1]) :-
  remove_value(T, X, T1).