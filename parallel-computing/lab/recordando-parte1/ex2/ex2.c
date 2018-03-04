#include <stdio.h>

int main() {
    float n1, n2, n3, me, ma;

    printf("Informe 'n1, n2, n3, me': ");
    scanf("%f, %f, %f, %f", &n1, &n2, &n3, &me);

    ma = (n1 + (n2 * 2) + (n3 * 3) + me) / 7;
        
    if (ma >= 9.0)
    {
        printf("Conteito A para media %.2f\n", ma);
    } else if (ma >= 7.5)
    {
        printf("Conceito B para media %.2f\n", ma);
    } else if (ma >= 6.0)
    {
        printf("Conceito C para media %.2f\n", ma);
    } else if (ma >= 4.0)
    {
        printf("Conceito D para media %.2f\n", ma);
    } else
    {
        printf("Conceito E para media %.2f\n", ma);
    }

    return 0;
}