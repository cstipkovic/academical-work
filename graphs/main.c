#include <stdio.h>
#include <stdlib.h>
#include <memory.h>

#define NONE  -1
#define BRANCO 0
#define CINZA  1
#define PRETO  2

typedef struct aresta {
	int nome;
	struct aresta *prox;
} Aresta;

typedef struct vertice {
	int nome;
	Aresta *prim;
} Vertice;

void imprimeGrafo(Vertice G[], int ordem);
void criaGrafo(Vertice **G, int ordem);
int acrescentaAresta(Vertice G[], int ordem, int v1, int v2);
int calculaTamanho(Vertice G[], int ordem);
int isConexo(Vertice G[], int ordem);
void isArvore(Vertice G[], int ordem);

void criaGrafo(Vertice **G, int ordem) {
	int i;

	*G = (Vertice*) malloc(sizeof(Vertice)*ordem);

	for (i = 0; i < ordem; i++) {
		(*G)[i].nome = i;
		(*G)[i].prim = NULL;
	}
}

int acrescentaAresta(Vertice G[], int ordem, int v1, int v2) {
	if (v1 < 0 || v1 >= ordem) {
		return 0;
	}

	if (v2 < 0 || v2 >= ordem) {
		return 0;
	}

	Aresta *A1 = (Aresta *) malloc(sizeof(Aresta));
	A1->nome = v2;
	A1->prox = G[v1].prim;
	G[v1].prim = A1;

	Aresta *A2 = (Aresta *) malloc(sizeof(Aresta));
	A2->nome = v1;
	A2->prox = G[v2].prim;
	G[v2].prim = A2;

	return 1;
}

int calculaTamanho(Vertice G[], int ordem) {
	int i;
	int totalArestas = 0;

	for (i = 0; i < ordem; i++) {
		int j;
		Aresta *aux= G[i].prim;
		for (j = 0; aux != NULL; aux = aux->prox, j++);
		totalArestas += j;
	}

	return ((totalArestas / 2) + ordem);
}

void imprimeGrafo(Vertice G[], int ordem) {
	int i;

	printf("\nOrdem:   %d",ordem);
	printf("\nTamanho: %d", calculaTamanho(G, ordem));
	printf("\nLista de Adjacencia:\n");

	for (i = 0; i < ordem; i++) {
		printf("\n    V%d: ", i);
		Aresta *aux = G[i].prim;
		for( ; aux != NULL; aux = aux->prox) {
			printf("%3d", aux->nome);
		}
	}
	printf("\n\n");
}

int isConexo(Vertice G[], int ordem) {
	int i;

	for (i = 0; i < ordem; i++) {
		Aresta *aux = G[i].prim;
		if (aux == NULL) {
			return 0;
		}
	}

	return 1;
}

void isArvore(Vertice G[], int ordem) {
	if (isConexo(G, ordem)) {
		if ((calculaTamanho(G, ordem) - ordem) == (ordem - 1)) {
			printf("Grafo é uma arvore!\n");
		} else {
			printf("Esse Grafo nao e uma arvore!\n");
		}
	} else {
		printf("Esse Grafo nao e uma arvore!\n");
	}
}

int main(int argc, char *argv[]) {
	Vertice *G;
	int ordemG = 10;

	criaGrafo(&G, ordemG);

	/* Grafo arvore teste */
	/*acrescentaAresta(G, ordemG, 0, 1);*/
	/*acrescentaAresta(G, ordemG, 1, 2);*/
	/*acrescentaAresta(G, ordemG, 2, 3);*/
	/*acrescentaAresta(G, ordemG, 3, 4);*/
	/*acrescentaAresta(G, ordemG, 4, 5);*/
	/*acrescentaAresta(G, ordemG, 5, 6);*/
	/*acrescentaAresta(G, ordemG, 6, 7);*/
	/*acrescentaAresta(G, ordemG, 7, 8);*/
	/*acrescentaAresta(G, ordemG, 8, 9);*/

	acrescentaAresta(G, ordemG, 3, 4);
	acrescentaAresta(G, ordemG, 4, 2);
	acrescentaAresta(G, ordemG, 5, 4);
	acrescentaAresta(G, ordemG, 2, 3);
	acrescentaAresta(G, ordemG, 3, 7);

	imprimeGrafo(G, ordemG);
	isArvore(G, ordemG);
	system("PAUSE");

	return 0;
}

