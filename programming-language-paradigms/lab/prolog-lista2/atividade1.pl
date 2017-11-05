% 1. Encontrar o último elemento de uma lista.
last([List], List).
last([_|Tail], Element) :-
  last(Tail, Element).
