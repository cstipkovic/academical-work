// Atividade #1 - Linguagem C - Calculadora - PLP
// Nome: Ricardo Arthur, 31676987 - 05N11
// Nome: Clauber Pereira Stipkovic Halic, 31243045 - 05N12

#include <stdio.h>

int sum(int a, int b) {
  return (a + b);
}

int subtracao(int a, int b) {
  return (a - b);
}

int divide(int a, int b) {
  return (a / b);
}

int multiplicacao(int a, int b) {
  return (a * b);
}

int main() {
  char operator;
  int a, b;

  do {
    printf("\nInforme '0s0' para sair ou a expressao (ex: 1+1): ");
    scanf("%d%c%d", &a, &operator, &b);

    switch (operator) {
      case '+':
        printf("Resultado da soma: %d\n", sum(a, b));
        break;

      case '-':
        printf("Resultado da subtracao: %d\n", subtracao(a, b));
        break;

      case '/':
        if (b == 0) {
          printf("Divisao por 0 nao permitida.\n");
        } else {
          printf("Resultado da divisao: %d\n", divide(a, b));
        }
        break;

      case '*':
        printf("Resultado da multiplicacao: %d\n", multiplicacao(a, b));
        break;
    }
  } while(operator != 's');

  return 0;
}
