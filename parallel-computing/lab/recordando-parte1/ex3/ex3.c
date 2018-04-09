#include <stdio.h>

int main()
{
    int b, i, j, n;

    scanf("Informe qual o numero (inteiro) maximo da base da piramide: %d", &n);

    b = (n - 1) / 2;

    for (i = 0; i <= b; i++)
    {
        for (j = i + 1; j <= n - i; j++)
        {
            printf(" %d", j);
        }
        printf("\n ");
    }

    return 0;
}
