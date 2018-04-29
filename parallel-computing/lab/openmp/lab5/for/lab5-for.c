#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <omp.h>

int main(int argc, char *argv[])
{
  size_t i;
  size_t sum = 0;

  double base = 2.0f;
  double expo = 2.0f;
  double vectorSize = pow(base, expo);

  // set number of threads
  int const nThread = atoi(argv[1]);

  // Vector
  size_t *vector = (size_t *) malloc(vectorSize * sizeof(size_t));
  size_t *vectorAux = (size_t *) malloc(nThread * sizeof(size_t));

  // Fill Vector
  for (i = 0; i < vectorSize; i++)
  {
    vector[i] = 1;
  }

  // Fill Aux Vector
  for (i = 0; i < nThread; i++)
  {
    vectorAux[i] = 0;
  }

  double vectorSizePerThread = vectorSize / nThread;
  printf("%.2lf\n", vectorSizePerThread);

  #pragma omp parallel num_threads(nThread)
  {
    size_t threadNumber = omp_get_thread_num();
    size_t loopStart = omp_get_thread_num() * vectorSizePerThread;

    if (nThread == 1) // One Thread
    {
      for (i = 0; i < vectorSize; i++)
      {
        sum += vector[i];
      }
    }
    else if (nThread % 2) // Odd number of Threads
    {

    }
    else // Even number of Threads
    {
      #pragma omp parallel for
      for (i = loopStart; i < (loopStart + (size_t) vectorSizePerThread); i++)
      {
        vectorAux[threadNumber] += vector[i];
      }
    }
  }

  for (i = 0; i < nThread; i++)
  {
    sum += vectorAux[i];
  }

  printf("\nCom %d threads, sum = %zu\n", nThread, sum);

  return 0;
}
