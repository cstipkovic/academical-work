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
  for (i = 0; i < vectorSize; i++) {
    vector[i] = 1;
  }

  // Control even / odd number of threads
  if (nThread == 1) // Just one thread
  {
    for (i = 0; i < vectorSize; i++)
    {
      sum += vector[i];
    }
  }
  else if ((nThread % 2) || ((nThread % 3) == 0 && nThread != 3)) //not multiples of 2, multiples of 3 and different of 3 threads
  {
    size_t *vectorAux = (size_t *) malloc(nThread * sizeof(size_t));

    // Fill Aux Vector
    for (i = 0; i < nThread; i++) {
      vectorAux[i] = 0;
    }

    size_t modDivision = ((int) vectorSize) % nThread;
    size_t vectorSizePerThread = (vectorSize - modDivision) / nThread;

    #pragma omp parallel num_threads(nThread)
    {
      size_t threadNumber = omp_get_thread_num();
      size_t loopStart = threadNumber * vectorSizePerThread;

      #pragma omp parallel for reduction (+:vectorAux[threadNumber])
      for (i = loopStart; i < (loopStart + vectorSizePerThread); i++) {
        vectorAux[threadNumber] += vector[i];
      }
    }

    for (i = 0; i < nThread; i++) {
      sum += vectorAux[i];
    }

    sum += modDivision;
  }
  else
  {
    size_t *vectorAux = (size_t *) malloc(nThread * sizeof(size_t));

    // Fill Aux Vector
    for (i = 0; i < nThread; i++) {
      vectorAux[i] = 0;
    }

    size_t vectorSizePerThread = vectorSize / nThread;

    #pragma omp parallel num_threads(nThread)
    {
      size_t threadNumber = omp_get_thread_num();
      size_t loopStart = threadNumber * vectorSizePerThread;

      #pragma omp parallel for reduction (+:vectorAux[threadNumber])
      for (i = loopStart; i < (loopStart + vectorSizePerThread); i++) {
        // printf("i: %zu, start: %zu, thread: %zu\n", i, loopStart, threadNumber);
        vectorAux[threadNumber] += vector[i];
        // printf("i: %zu, threadNumber: %zu, vectorAux: %zu\n", i, threadNumber, vectorAux[threadNumber]);
      }
    }

    for (i = 0; i < nThread; i++) {
      sum += vectorAux[i];
    }
  }

  printf("\nCom %d threads, sum = %zu\n", nThread, sum);

  return 0;
}
