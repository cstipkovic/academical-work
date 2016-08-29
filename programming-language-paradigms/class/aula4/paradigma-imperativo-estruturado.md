# Paradigma Imperativo Estruturado

* linguagens imperativas/procedurais/baseadas em comandos/orientadas a atribuição
* fundamento: maquina de Turing -> modelo de Von Neumann
* Caracteristicas centrais
  - variáveis
    - modelagem as células de memória
    - descrição do estado de um programa
  - comandos de atribução
    - altera o valor das variáveis
    - são baseados nas operações de transferências de dados e instruções
      - ex: soma = soma + x
  - execução sequencial
    - significado de um programa depende da ordem na qual os comandos são escritos e executados
  - forma iterativa de repetição
    - iteração é mais rápida em computadores com arquitetura de Von Neumann porque as instruções são armazenadas em células adjacentes
    - iterações e mais eficiente que recursão
  - variáveis
    - abstração de uma célula de memória ou de uma coleção de células
    - necessidade de substituir endereços numéricos e absolutas de memória (maior legibilidade, facilidade de escrita e manutenção)
    - nome
      - letra(letra|digito|-)*
      - algumas linguagens substituem o sublinhado -> chamado de camelo
      - case sensitive (problema com legibilidade)
      - palavra char (palavra especial apenas em alguns contextos) X palavra especial X palavra reservada (palavra especial que não pode ser usada como nome)
    - tipo
      - determina a faixa de valores que ela pode armazenar (o conj. de operações definidas)
      - restringir o espaço a ser gasto
        - ex: C em máquina de 32 bits
          ```
          sizeof(char) = 1B
          sizeof(int) = 4B
          sizeof(char*) = ?? (4B)
          ```
        - fortemente tipada X fracamente tipada (maior confiabilidade)
    - endereço
      - endereço de memória de máquina ao qual ela esta associada
      - é possível ter multiplos nomes associados ao mesmo endereço (legibilidade)
        - ex: soma |____| total (qualquer alteração em total altera soma)
      - l(eft)-value - localização de memória (address)
      - r(ight)-value - valor armazenado na localização identificada por value
      - ex:
        ```
        x = x + 1
        ```
        pega-se o r-value de x, adiciona 1 e armazena o resultado no l-value
      - A = B -> destructive update
      - ponteiros
        - seus r-value são l-value de outras variáveis em C
          - &x - retorna l-value de x
          - \*p - retorno r-value de p (se p é um ponteiro, seu r-value é o l-value de outra variável)
          - ex:
            ```
            int x = 5;
            int *p = &x;
            *p = 2 * x;
            ```
