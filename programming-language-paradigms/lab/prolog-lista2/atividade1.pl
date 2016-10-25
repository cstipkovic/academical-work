% 1. Encontrar o último elemento de uma lista.
last([L], L).
last([_ | RL], UE) :-
  last(RL, UE).
