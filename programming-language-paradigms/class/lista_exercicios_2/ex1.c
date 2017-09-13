#include <stdio.h>

void muda (char a, char b) {
  b = "B";
  a = b;
}

int main () {
  char x[] = "x", y[] = "y";
  muda (&x, &y);
  printf("x: %s, y: %s", x, y);

  return 0;
}
