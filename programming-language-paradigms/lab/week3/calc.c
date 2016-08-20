#include <stdio.h>

int calc(int a, int b, char operator) {
  switch (operator) {
    case "+":
      printf("mais\n");
      break;
  }
}

int main(int argc, char const *argv[]) {
  char operator;

  scanf("%s\n", &operator);
  return 0;
}
