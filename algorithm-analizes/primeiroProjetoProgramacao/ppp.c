/*
 * Nome: Clauber Pereira Stipkovic Halic - 3124304-5
 * */
#include <stdio.h>
#include <stdlib.h>

void insertionSort(int *A, int n) {
	for (int j = 1; j < n; j++) {
		int key = A[j];
		int i = j - 1;
		while (i >= 0 && A[i] > key) {
			A[i + 1] = A[i];
			i = i - 1;
			A[i + 1] = key;
		}
	}

	for(int i = 0; i < n; i++) {
		printf("%d ", A[i]);
	}
}


void merge(int *A, int p, int q, int r) {
	int n1 = q - p + 1;
	int n2 = r - q;
	int *L;
	int *R;
	int i = 0;
	int j = 0;
	int k = 0;

	L = (int *) calloc(n1 + 1, sizeof(int));
	R = (int *) calloc(n2 + 1, sizeof(int));

	for (i = 0; i < n1; i++) {
		*(L + i) = *(A + i + p);
	}

	for (j = 0; j < n2; j++) {
		*(R + j) = *(A + q + j + 1);
	}

	*(L + n1) = 9999;
	*(R + n2) = 9999;

	i = 0;
	j = 0;

	for (k = p; k <= r; k++) {
		if (*(L + i) <= *(R + j)) {
			*(A + k) = *(L + i);
			i++;
		} else {
			*(A + k) = *(R + j);
			j++;
		}
	}
}

void merge_sort(int *A, int p, int r) {
	if (p < r) {
		int q = (r + p) / 2;

		merge_sort(A, p, q);
		merge_sort(A, q + 1, r);
		merge(A, p, q, r);
	}
}

int main() {
	int A[] = {3, 4, 5, 2, 1};
	int n = 5;

	// Chamada do insertion sort
	insertionSort(A, n);
	printf("\n");

	// Chamada do merge sort
	merge_sort(A, 0, n - 1);
	printf("\n");

	return 0;
}
