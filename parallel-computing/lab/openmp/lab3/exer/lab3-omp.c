#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <omp.h>

int main()
{
    int i;
    double base = 2.0f;
    double exp = 16.0f;

    double N = pow(base, exp);
    int element = 65535;
    int sizeBlock = N / omp_get_max_threads();

    int *a = (int *) malloc(N * sizeof (int));

    for (i = 0; i < N; i++)
    {
        a[i] = i;
    }

    #pragma omp parallel
    {
        int t = omp_get_thread_num() * sizeBlock;
        for (i = t; i < (t + sizeBlock); i++) {
            if (a[i] == element) {
                printf("Elemento '%d' encontrado na posicao: [%d]\n", element, i);
            }
        }
    }

    return 0;
}
