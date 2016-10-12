# Paradigma Lógico

* paradigma declarativo
  - lógico
  - funcional


* baseado na expressão de programas em forma de lógica simbólica e usa um processo de inferência lógica para produzir resultados
  - ex:
    - Zé carioca é um papagaio
    - Todo papagaio é uma ave
    - Logo, Zé carioca é uma ave


* programas lógicos são declarativa em vez de procedurais
  - apenas as especificações dos resultados desejados são expressas, em vez de os procedimentos detalhados para produzi-los


* linguagem Prolog
  - do francês Programmation em Logique


* Cálculo de predicados
  - proposição
    - sentenças lógicas que pode ser "v" ou "f"
    - consiste em objetos e relacionamentos de objetos
    - __objetos__: são representados por termos simples, constantes ou variáveis
    - __variáveis__: simbolo capaz de representar objetos diferentes em momentos diferentes (variáveis mais próximas da matemática do que as variáveis em lings. imperativas)
    - proposições mais simples
    - consistem em termos compostos por:
      - __functor__ + (lista ordenada de parâmetros)
      - ex:
        ```
        FUNCTOR(param)
          man(jake)
          man(fred)
          like(bob, fish)
          man, jake, fred, like, bob, fish // São constantes
        ```
    - proposição composta
      - 2 ou mais proposições atômicas conectadas por conectores lógicos ou operadores - (V ^ = -> <->)
    - variáveis podem aparecer em proposições mas apenas quando introduzidas por simbolos especiais chamados de quantificadores universais (), paratodox (), existencial (), existe um valor de x tal que P é v.
      - ex:
        ```
        Vx(woman(x)¬human(x))
        ```
    - forma clausal
      - quantificadores existenciais não são necessários e os universais são implícitas
      - nenhum operador além da conjunção e disjunção são necessários
      - disjunção do lado esquerdo
      - conjunção do lado direito
        ```
        (conseguinte) B1VB2VB3VBn C A1^A2^A3^An (antecedente)
        ```
        - ex:
          ```
          likes(bolo, dourado) C likes(bolo, fish) ^ fish(dourado)
          ```

* Semântica declarativa
  - O simplificado de uma preposição em uma LP lógica pode ser consisamente determinada a partir da própria sentença (semântica mais simples)
  - em uma LP imperativa, a semântica de uma simples sentença de atribuição requer o exame de declarações locais e conhecimento das regras de escopo. A ação resultante da sentença depende de seu de tempo de execução


* processo de inferência
  - processo de encontrar uma cadeia de regras de inferência e/ou fatos na base de conhecimento que conecte o objetivo a um ou mais fatos nesta base.
  ```
  father(paul).
  man(x):-father(x).
  ?-mon(paul).
  yes
  ```
  - resolução ascendente
    - começar com os fatos e regras da base de conhecimento e tentar encontrar uma sequência de casamentos que levam ao objetivo.
    - abordagem indicada quando o número de possíveis respostas corretas é grande
  - resolução descendente
    - começar com o objetivo e tentar encontrar uma sequência de proposições que casem com o objetivo
    - funciona melhor quando existe um conjunto pequeno de respostas candidatas


* busca da solução
  - profundidade (depth first): encontra uma sequência completa de proposições para o 1 subobjetivo antes de trabalhar com os outros
  - largura (breath first): funciona em todoso os subobjetivo em paralelo


* backtracking
  - rastreamento para atrás
  - refaz a unificação mais recente seguindo outra possibilidade, tentando encontrar outros valores que tornem o predicado verdadeiro.
  - é forçado quando usa ";"


## Prolog
* listas
  - estruturas suportadas nativamente
  - sequências de qualquer número de elementos.
  - homogêneas ou heterogêneas
  - ex:
    - [a, b, c, d] [1, 2, 3, a, 4]
    - lista vazia [ ]
    - notação especial [H|T]
      - ?-[7, 8, 9] = [H|T].
      - ?-[7] = [A|B].
      - ?-[ ] = [x|y].
  - fatos
    ```
    idades([andre, 25], [jose, 30]).
    ?-idades([_, I1], [_, I2]).
    ```
    obs.: _ é variável não nomeada
  - regras
    ```
    primeira([P|_], P).
    ?-primeira([1, 2, 3], P).
    ```

    ```
    ultimo([U], U).
    ultimo([_|T], U) :- ultimo(T, U).
    ?-ultimo([7, 8, 9], U).
    ```
