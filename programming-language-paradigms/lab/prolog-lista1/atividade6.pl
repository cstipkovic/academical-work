% Meu Cosseno
meucosseno(X, R) :-
  meucossenoaux(X, R, 50).

meucossenoaux(X, R, P) :-
  potencia(X, P, Pot),
  fatorial(P, Fat),
  Div is Pot/Fat, Novpar is P - 2,
  meucossenoaux(X, R1, Novpar),
  R is 1.
