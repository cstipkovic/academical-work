#include <stdio.h>

#define TAMANHO 10

extern int busca(int *, int, int);

int main() {
	int vetor[TAMANHO], valor, i, pos;

	printf("\nDigite o vetor de 10 posicoes de inteiros:\n");
	for (i=0; i<TAMANHO; ++i) {
		scanf("%d", &vetor[i]);
	}
	
	printf("\nDigite o valor a ser buscado: ");
	scanf("%d", &valor);

	pos = busca(vetor, valor, TAMANHO);
	if (pos != -1) {
		printf("\nValor %d encontrado na posicao %d.\n", valor, pos);
	} else {
		printf("\nValor %d nao encontrado.\n", valor);
	}

	return 0;
}
