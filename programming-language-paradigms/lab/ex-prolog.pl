% Natalia Alves Cabrera - 31210856
% Clauber Pereira Stipkovic Halic - 31243045
% Allan Gustavo Fernandes - 31568211

% 1. Encontrar o último elemento de uma lista.
last([List], List).
last([_|Tail], Element) :-
  last(Tail, Element).

% 2. Encontrar o k-ésimo elemento de uma lista.
kth([Head|Tail], 0, X) :- !.
kth([Head|_], 1, Head).

kth([_|Tail], Position, X) :-
  Next is Position - 1,
  kth(Tail, Next, X).

% 3. Contar o número de vezes que um certo elemento aparece em uma dada lista.
count([], _, 0).
count([Head|Tail], Head, X) :-
  count(Tail, Head, Count),
  X is Count + 1.
count([Head|Tail], Element, X) :-
  count(Tail, Element, X),
  Head\=Element.

% 4. Remover de um lista todas as ocorrências de um dado valor.
remove_value([], _, 0) :- !.
remove_value([Head|Tail], Head, Tail).
remove_value([Head|Tail], Element, [Head|Tail1]) :-
  remove_value(Tail, X, Tail1).

% 5.	Remover o k-ésimo elemento de uma lista.
insereElementInicio([H|L],H, L):- !.

remove_kth([_|Tail], Tail, 0):- !.
remove_kth([Head|Tail], R, I):-
  X is I - 1,
  remove_kth(Tail, Y, X),
  insereElementInicio(R, H, Y).
