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

  printf("Escolha uma operacao aritmetica (ou digite 's' para finalizar): ");
  scanf("%c", &operator);

  while (operator != 's') {
    printf("\nInforme o primeiro numero: ");
    scanf("%d", &a);

    printf("\nInforme o segundo numero: ");
    scanf("%d", &b);

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

    printf("\nEscolha uma operacao aritmetica (ou digite 's' para finalizar): ");
    scanf("%c", &operator);
  }

  return 0;
}
