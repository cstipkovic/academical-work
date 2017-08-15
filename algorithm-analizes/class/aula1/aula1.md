# Análise de Algoritmos - Aula 1 (Diagnostica 16/02)

## Exercicio
- Escrever uma função para somar os elementos de um vetor de n inteiros e calcule a complexidade de tempo dela.

``` C
int somaVet(int v[], int n) {
	int total = 0;
	int i = 0;
	
	while (i < n) {
		total += v[i];
		i++;
	}

	return total;
}
```

 * Tempo total 
	= 1.C1 + 1.C2 + (n + 1).C3 + n.C4 + n.C5 + 1.C6
	= (C3 + C4 + C5).n + (C1 + C2 + C3 + C6)
	= a.n + b

## Exercicio
- Escrever uma função para buscar um elemento em um vetor e calcule sua complexidade.

``` C
int buscaVet(int v[], int n, int elem) {
	int i = 0;

	while (i < n) {
		if (v[i] == elem) {
			return i;
		}
		i++;
	}

	return -1;
}
```

* Tempo total (melhor caso - elemento na primeira posição) - Omega(1)
	= 1.c1 + 1.c2 + 1.c3 + c4
	= a, onde 'a' é uma constante

* Tempo Total (pior caso - elemento não esta no vetor) - O(1)
	= 1.c1 + (n + 1).c2 + n.c3 + n.c5 + 1.c6
	= (c2 + c3 + c5).n + (c1 + c2 + c6)
	= a.n + b, onde 'a' e 'b' são constantes

* Teta não esta definida (entre menor e maior tempo)
