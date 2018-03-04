#include <stdio.h>

int main() {
    int n = 0, m = 0;
    int i, j;
    int line, number;

    printf("Informe as linhas: ");
    scanf("%d", &n);

    printf("Informe as coluna: ");
    scanf("%d", &m);

    if (n != m) {
        printf("\nMatriz deve ser quadrada (n x m)... saindo!\n");

        return 0;
    }

    int matrix[n][m];

    for (i = 0; i < n; i++) 
    {
        for (j = 0; j < m; j++) 
        {
            scanf("%d", &matrix[i][j]);
        }
    }
    printf("\n");

    number = matrix[0][0];
    line = 0;
    for (i = 0; i < n; i++)
    {
        printf("\n");
        for (j = 0; j < m; j++)
        {
            if (matrix[i][j] < number)
            {
                line = j;
                number = matrix[i][j];
            }
            printf("%d\t", matrix[i][j]);
        }
    }

    printf("\nMenor numero esta na linha: %d\n", (line + 1));

    return 0;
}
