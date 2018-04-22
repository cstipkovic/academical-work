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

    int *a = (int *) malloc(N * sizeof (int));

    for (i = 0; i < N; i++)
    {
        a[i] = i;
    }

    for (i = 0; i < N; ++i)
    {
        if (a[i] == element)
        {
            printf("Elemento '%d' encontrado na posicao: [%d]\n", element, i);
        }
    }

    return 0;
}
