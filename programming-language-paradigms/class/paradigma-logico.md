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
