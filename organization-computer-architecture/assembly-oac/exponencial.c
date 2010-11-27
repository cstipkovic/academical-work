#include <stdio.h>

extern int exponencial(int, int);

int main(void) {
	int x, y;
	printf("\nDigite a base e o expoente: ");
	scanf("%d%d", &x, &y);
	printf("\n%d^%d = %d", x, y, exponencial(x, y));
	return 0;
}
