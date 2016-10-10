# Paradigma Imperativo/Estruturado (cont.)

## Variáveis

### Escopo

  - faixa de sentenças nas quais a variável é visível. Uma variável é visível em uma sentença se ela pode ser referenciada nessa sentença.
  - <strong>Escopo estático</strong> busca local e se não encontrar é feita uma busca no ancestral.
  - ex: (Ada)
  ```
  procedure Big is
    x:integer,
    procedure Sub1 is
      x:integer,
      begin ... end,
      // x é local
    procedure Sub2 is
      begin ... x ... end,
      // x é Big
    begin

    end
  ```

### Escopo em blocos

  - ex: em algumas linguagens temp só vale para este bloco, em outras ling, temp vale para todo o escopo a partir desse bloco.
  ```
  if (list[i] < list[j]) {
    int temp;
    temp = list[i];
  }
  ```

  - ex: algumas ling. não permitem esse tipo de declaração, outras ling. fazem o incremento no count local.
  ```
  void sub() {
    int count;

    while() {
      int count;
      count++;
    }
  }
  ```

  - ex: escopo de count é a partir do for até final do fun, em outras ling. count só vale para dentro do for.
  ```
  void fun() {
    for (int count = 0; count < 10; count ++) {

    }
  }
  ```

### Escopo dinâmico
  - É baseada na seguência de chamadas de subprogramas e não em seu relacionamento espacial (escopo só pode ser determinado em tempo de execucão)

  - ex:
    Big -> Sub1 -> Sub2
    Big -> Sub2
  ```
    procedure Big
  ```
### Escopo Global

## subprogramas
   - Uma sub rotina é um escopo[1] nomeado[2] parametrizado[3]

   [1] contêm declarações de variáveis locais e instruções
   [2] pode ser referenciado
   [3] argumentos podem ser passados para escopo

   - tem um único ponto de entrada
   - a unidade de programa chamadora é suspensa durante a execução do subprograma chamado
   - o controle sempre volta para o chamador quando a execução do subprograma termina
   - retorna valor função 
