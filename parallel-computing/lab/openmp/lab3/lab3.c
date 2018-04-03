#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>
#include <omp.h>

int main() 
{
    int i;
    double base = 2;
    int exp = 16;

    int N = pow(base, exp);
    int element = 777;
    int sizeBlock = N / omp_get_max_threads();
    int a[N]; // TODO: fazer o vetor com malloc

    srand(time(0));
    for (int i = 0; i < N; i++)
        a[i] = rand() % (N + 1 - 0) + 0;

    #pragma omp parallel
    {
        int t = omp_get_thread_num() * sizeBlock;
        for (i = t; i <= (t + sizeBlock); i++) {
            if (a[i] == element) {
                printf("Elemento '%d' encontrado na posicao: [%d]\n", element, i);
            }   
        }
    }

    return 0;
}