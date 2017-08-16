// Linguagem C - Calculadora - PLP
// Nome: Clauber Stipkovic, 31243045 - 05N

#include <stdio.h>

float sum(float a, float b) {
  return (a + b);
}

float subtraction(float a, float b) {
  return (a - b);
}

float division(float a, float b) {
  return (a / b);
}

float multiplication(float a, float b) {
  return (a * b);
}

int main() {
  char operator;
  float a, b;

  do {
    printf("\nInforme '0s0' para sair ou a expressao (ex: 1+1): ");
    scanf("%f%c%f", &a, &operator, &b);

    switch (operator) {
      case '+':
        printf("Resultado da soma: %.2f\n", sum(a, b));
        break;

      case '-':
        printf("Resultado da subtracao: %.2f\n", subtraction(a, b));
        break;

      case '/':
        if (b == 0) {
          printf("Divisao por 0 nao permitida.\n");
        } else {
          printf("Resultado da divisao: %.2f\n", division(a, b));
        }
        break;

      case '*':
        printf("Resultado da multiplicacao: %.2f\n", multiplication(a, b));
        break;
    }
  } while(operator != 's');

  return 0;
}
