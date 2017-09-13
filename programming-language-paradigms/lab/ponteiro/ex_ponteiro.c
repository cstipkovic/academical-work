#include <stdio.h>

int main() {
	int x, y, z;
	int *px, *py, *pz;
	
	x = 10;
	y = 5;
	z = 0;
	
	px = &x;
	py = &y;
	pz = &z;
	
	puts("\n");
	puts("\nAntes das alteracoes.");
	printf("\nO valor de x e: %d", x);
	printf("\nO valor de y e: %d", y);
	printf("\nO valor de z e: %d", z);
	
	printf("\nO valor de px e: %p", px);
	printf("\nO valor de py e: %p", py);
	printf("\nO valor de pz e: %p\n", pz);
	
	
	printf("\nO end x e: %p", &x);
	printf("\nO end y e: %p", &y);
	printf("\nO end z e: %p", &z);
	
	printf("\nO end &px e: %p", &px);
	printf("\nO end &py e: %p", &py);
	printf("\nO end &pz e: %p\n", &pz);
	
	// Alteracoes
	*px = z + 3;
	*py = x + y;	
	
	puts("\n");
	puts("\nDepois das alteracoes.");
	printf("\nO valor de x e: %d", x);
	printf("\nO valor de y e: %d", y);
	printf("\nO valor de z e: %d", z);
	
	printf("\nO valor de px e: %p", px);
	printf("\nO valor de py e: %p", py);
	printf("\nO valor de pz e: %p\n", pz);
	
	
	printf("\nO end x e: %p", &x);
	printf("\nO end y e: %p", &y);
	printf("\nO end z e: %p", &z);
	
	printf("\nO end &px e: %p", &px);
	printf("\nO end &py e: %p", &py);
	printf("\nO end &pz e: %p\n", &pz);
			
	return 0;
}
