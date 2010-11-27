#include <stdio.h>

int bissexto(int);

int main(void) {
	int ano;
	printf("\nDigite um ano para verificacao: ");
	scanf("%d", &ano);
	if (bissexto(ano) == 1) printf("\nAno %d bissexto", ano);
	else printf("\nAno %d nao bissexto", ano);
	return 0;
}
