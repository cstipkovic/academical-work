# Aula 01 - Sugestão de Exercício: Classe Conta Corrente

## Descrição do Exercicio
Desenvolva a classe ContaCorrente, que representa uma conta corrente bancária. A classe deve conter informações sobre o correntista (pode ser uma classe à parte) e o saldo (nunca negativo). Além disso, deve permitir ações de depósito, saque e verificação de saldo.

Desenvolva também uma função main para instanciar um objeto da classe ContaCorrente e testar as funcionalidades implementadas.

Utilize a classe ContaCorrente  para desenvolver a classe Banco.

A classe Banco deverá armazenar um conjunto de objetos ContaCorrente, e permitir que se acesse os métodos de qualquer uma das contas. Este conjunto deve ser implementado como um vetor de ponteiros para ContaCorrente (i.e. ContaCorrente **contas). Abaixo estão suas operações:

Criar conta
    - Atualizar conta (mudar o cadastro do correntista)
    - Sacar
    - Depositar
    - Consultar saldo
    - Apagar conta
    - Outras operações e atributos são encorajados!

Desenvolva também um construtor, que inicializa o vetor de ContaCorrente com NULLs e os demais atributos do objeto Banco; e um destrutor, que remove todos os objetos ContaCorrente ainda presentes no objeto.

Crie uma função main para instanciar um objeto da classe Banco e testar suas funcionalidades.

Em um cenário fictício, suponha que o BACEN definiu um limite máximo para o valor guardado em uma conta-corrente. Este valor pode variar ao longo do tempo, mas será sempre o mesmo para todas as contas correntes de todos os bancos.
Adapte a sua classe Banco / ContaCorrente para que ela implemente esta nova resolução (dica: crie um atributo static).
Inclua o qualificador const em todos os casos em que ele possa ser aplicado.

## Testando
    - Basta rodar um makefile
    - Executar o arquivo main
