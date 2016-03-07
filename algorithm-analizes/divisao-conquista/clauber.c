#include <stdio.h>
#include <stdlib.h>

// QuickSort
void quicksort (int v[], int i, int f) {
  if (i < f) {
    int div;
    div = particao(v, i, f);
    quicksort(v, i, (div - 1));
    quicksort(v, (div + 1), f);
  }
}

// particao
int particao (int v[], int i, int f) {
  int pivo = v[f];
  int aux;
  int a=i-1;
  int b;

  for (b = i; b < f; b++) {
    if (v[b] <= pivo) {
      a++;
      aux = v[a];
      v[a] = v[b];
      v[b] = aux;
    }
  }

  aux = v[a + 1];
  v[a + 1] = v[f];
  v[f]= aux;

  return a + 1;
}

// Busca Binaria
int buscaBinaria (int v[], int k, int tam) {
  int esq = 0;
  int dir = tam-1;
  int meio;

  while (esq <= dir) {
    meio = (esq + dir) / 2;
    if (k == v[meio]) { return meio; }

    if (k < v[meio]) {
      dir = meio + 1;
    } else {
      esq = meio + 1;
    }
  }

  return -1;
}

// MergeSort
void mergeSort (int *vet, int inicio, int fim) {
  int i, j, k, meio, *vetTemp;

  if (inicio == fim) { return; }

  meio = (inicio + fim ) / 2;
  mergeSort(vet, inicio, meio);
  mergeSort(vet, (meio + 1), fim);

  i = inicio;
  j = meio + 1;
  k = 0;
  vetTemp = (int *) malloc(sizeof(int) * (fim - inicio + 1));

  while (i < meio + 1 || j  < fim + 1) {
    if (i == meio + 1 ) {
      vetTemp[k] = vet[j];
      j++;
      k++;
    } else {
      if (j == fim + 1) {
        vetTemp[k] = vet[i];
        i++;
        k++;
      } else {
        if (vet[i] < vet[j]) {
          vetTemp[k] = vet[i];
          i++;
          k++;
        } else {
          vetTemp[k] = vet[j];
          j++;
          k++;
        }
      }
    }
  }

  for (i = inicio; i < fim; i++) {
    vet[i] = vetTemp[i - inicio];
  }
}

// Imprime
void imprime (int v[], int tam) {
  int i;

  printf("Resultado Merge Sort\n[ ");

  for (i = 0; i < tam; i++) {
    printf("%d ", v[i]);
  }

  printf("]\n");
}

// Main
int main () {
  int i = 0;
  int vQuickSort[20] = {30, 21, 10, 44, 23, 14, 3, 1, 20, 55, 32, 13, 32, 99, 442, 33, 22, 76, 54, 32};
  int vBuscaBinaria[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
  int vMergeSort[11] = {1, 4, 3, 56, 74, 34, 23, 6, 7, 8, 9};

  quicksort(vQuickSort, 0, 20);
  printf("Busca binaria: \n");
  printf("%d", buscaBinaria(vBuscaBinaria, 80, 10));
  printf("\n");

  printf("Quick Sort: \n");
  for(i = 0; i < 20; i++){
    printf("%d ", vQuickSort[i]);
  }

  mergeSort(vMergeSort, 0, (sizeof(vMergeSort) / sizeof(int)));
  printf("\n");
  imprime(vMergeSort, 11);

  return 0;
}
