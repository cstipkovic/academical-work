#include <stdio.h>
#include <string.h>

int main() {
    char nomes[1][2];
    int i, j;

    nomes[0][0] = 'f';
    nomes[0][1] = 'e';

    for (i = 0; i < 1; i++)
    {
        for (j = 0; j < 2; i++)
        {
            printf("%c", nomes[i][j]);
        }   
    }

    return 0;
}