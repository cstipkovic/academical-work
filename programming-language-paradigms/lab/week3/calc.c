#include <stdio.h>

int main() {
  char operator;
  int a, b;

  printf("Escolha uma operacao aritmetica (ou digite 's' para finalizar): ");
  scanf("%c", &operator);

  while (operator != 's') {
    switch (operator) {
      case '+':
        printf("\nInforme o primeiro numero: ");
        scanf("%d", &a);

        printf("\nInforme o segundo numero: ");
        scanf("%d", &b);

        printf("Resultado da soma: %d\n", (a + b));
        break;

      case '-':
        printf("\nInforme o primeiro numero: ");
        scanf("%d", &a);

        printf("\nInforme o segundo numero: ");
        scanf("%d", &b);

        printf("Resultado da subtracao: %d\n", (a - b));
        break;

      case '/':
        printf("\nInforme o primeiro numero: ");
        scanf("%d", &a);

        printf("\nInforme o segundo numero: ");
        scanf("%d", &b);

        if (b == 0) {
          printf("Divisao por 0 nao permitida.\n");
        } else {
          printf("Resultado da divisao: %d\n", (a / b));
        }
        break;

      case '*':
        printf("\nInforme o primeiro numero: ");
        scanf("%d", &a);

        printf("\nInforme o segundo numero: ");
        scanf("%d", &b);

        printf("Resultado da multiplicacao: %d\n", (a * b));
        break;
    }

    printf("\nEscolha uma operacao aritmetica (ou digite 's' para finalizar): ");
    scanf("%c", &operator);
  }

  return 0;
}
