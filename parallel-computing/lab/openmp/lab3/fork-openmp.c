#include <omp.h>
#include <stdio.h>

int main() {
    int i = 10;

    fprintf(stdout, "MAX: %d\n", omp_get_max_threads());

    #pragma omp parallel
    {
        fprintf(stderr, "Eu: %d - i: %d\t", omp_get_thread_num(), i);
        i++;
    }
    printf("\n");

    fprintf(stdout, "i: %d\n", i);
    return 0;
}