#include <stdio.h>
int main() {
    float n1, n2, n3, me;

    printf("Informe as notas nesse formato '2.3, 3.4, 9.3': ");
    scanf("%f, %f, %f", &n1, &n2, &n3);

    printf("%f, %f, %f", n1, n2, n3);

    return 0;
}