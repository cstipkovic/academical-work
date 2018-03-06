#include <stdio.h>

int main() {
    int a[9];
    int i;

    for (i = 0; i < 9; i++)
    {
        a[i] = i + 1;
    }

    for (i = 0; i < 9; i++)
    {
        printf("%d", a[i]);
    }

    printf("\n");

    return 0;
}