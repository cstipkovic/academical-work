#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <omp.h>

int main(int argc, char *argv[])
{
  size_t i;
  size_t sum = 0;

  double base = 2.0f;
  double expo = 25.0f;
  double vectorSize = pow(base, expo);

  // set number of threads
  int const nThread = atof(argv[1]);

  // Vectors
  size_t *vector = (size_t *) malloc(vectorSize * sizeof(size_t));

  // Fill Vector
  for (i = 0; i < vectorSize; i++)
  {
    vector[i] = 1;
  }

  // Sum Vector
  for (i = 0; i < vectorSize; i++)
  {
    sum += vector[i];
  }

  printf("\nCom %d thread (Serial), sum = %zu\n", nThread, sum);

  return 0;
}
