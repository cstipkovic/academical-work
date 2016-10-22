% Potencia
potencia(_, 0, 1) :- !.
potencia(B, E, R) :-
  E1 is E - 1,
  potencia(B, E1, R1),
  R is B * R1.
