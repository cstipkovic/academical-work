cos(X, R) :-
  cosaux(X, R, 50).

cosaux(X, R, P) :-
  potencia(X, P, Pot),
  fatorial(P, Fat),
  Div is Pot/Fat, Novpar is P - 2,
  cosaux(X, R1, Novpar),
  R is 1 -.
