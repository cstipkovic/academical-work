#include <stdio.h>

int arrayLength(int *arr) {
  return ((int) (sizeof(arr) / sizeof(arr[0])));
}

void printArray(int *arr) {
  for (size_t j = 0; j < 6; j++) {
    printf("%d, ", arr[j]);
  }
  puts("");
}

int main() {
  int A[] = {5, 2, 4, 6, 1, 3};

  for (int j = 1; j < 6; j++) {
    printArray(A);

    int key = A[j];
    int i = j - 1;

    printf("j: %d, A[j]: %d, key: %d, i: %d\n", j, A[j], key, i);

    while (i > 0 && A[i] > key) {
      printf("j: %d, A[j]: %d, A[i]: %d, key: %d, i: %d\n", j, A[j], A[i], key, i);
      A[i + 1] = A[i];
      i = i - 1;
      printf("j: %d, A[j]: %d, A[i]: %d, key: %d, i: %d\n", j, A[j], A[i], key, i);
    }

    printf("j: %d, A[j]: %d, key: %d, i: %d\n", j, A[j], key, i);
    A[i + 1] = key;
    printf("j: %d, A[j]: %d, key: %d, i: %d\n", j, A[j], key, i);

    printArray(A);
  }

  return 0;
}
