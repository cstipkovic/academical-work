% Modelando sua familia (Tarefa)
pai(ze, joao).
pai(ze, joaquim).
pai(manoel, ze).
pai(manoel, sebastiao).
pai(sebastiao, eurico).

% Irmao
irmao(I1, I2) :-
  pai(P, I1),
  pai(P, I2),
  I1\=I2.

% Avo
avo(A, N) :-
  pai(A, F),
  pai(F, N).

% Tio
tio(T, S) :-
  irmao(T, MP),
  pai(MP, S).

% Primo
primo(P1, P2) :-
  irmao(T, MP),
  pai(T, P1),
  pai(MP, P2).
