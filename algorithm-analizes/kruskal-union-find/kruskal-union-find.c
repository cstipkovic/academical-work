// Nome:
// Natalia Cabrera Alves - 31210856
// Lucas Nogueira Tormin - 31446140
// Allan Gustavo Fernandes - 31568211
// Clauber Pereira Stipkovic Halic - 31243045

#include <stdio.h>

#define MAX 30

typedef struct aresta {
    int u, v, w;
} aresta;

typedef struct arestalist {
    aresta data[MAX];
    int n;
} arestalist;

arestalist alist;

int grafo[MAX][MAX], n;
arestalist slist;

void ordena () {
    int i, j;
    aresta tmp;

    for (i = 1; i < alist.n; i++) {
        for (j = 0; j < alist.n - 1; j++) {
            if (alist.data[j].w > alist.data[j + 1].w) {
                tmp = alist.data[j];
                alist.data[j] = alist.data[j + 1];
                alist.data[j + 1] = tmp;
            }
        }
    }
}

int busca (int pertence[], int vertice) {
    return (pertence[vertice]);
}

void uniao (int pertence[], int c1, int c2) {
    int i;

    for (i = 0; i < n; i++) {
        if (pertence[i] == c2) {
            pertence[i] = c1;
        }
    }
}

void kruskal () {
    int pertence[MAX], i, j, cno1, cno2;
    alist.n = 0;

    for (i = 1; i < n; i++) {
        for (j = 0; j < i; j++) {
            if (grafo[i][j] != 0) {
                alist.data[alist.n].u = i;
                alist.data[alist.n].v = j;
                alist.data[alist.n].w = grafo[i][j];
                alist.n++;
            }
        }
    }

    ordena();

    for (i = 0; i < n; i++) {
        pertence[i] = i;
    }

    slist.n = 0;

    for (i = 0; i < alist.n; i++) {
        cno1 = busca(pertence, alist.data[i].u);
        cno2 = busca(pertence, alist.data[i].v);

        if (cno1 != cno2) {
            slist.data[slist.n] = alist.data[i];
            slist.n = slist.n + 1;
            uniao(pertence, cno1, cno2);
        }
    }
}

void mostra () {
    int i, custo = 0;

    printf("\nÁrvore resultante:"); 
    for (i = 0; i < slist.n; i++) {
        printf("\n%d\t%d\t%d", slist.data[i].u, slist.data[i].v, slist.data[i].w);
        custo = custo + slist.data[i].w;
    }

    printf("\n\nCusto da árvore = %d\n", custo);
}

int main () {
    int i, j;
    n = 3;

    grafo[0][0] = 1;
    grafo[0][1] = 2;
    grafo[0][2] = 3;

    grafo[1][0] = 6;
    grafo[1][1] = 4;
    grafo[1][2] = 5;

    grafo[2][0] = 7;
    grafo[2][1] = 9;
    grafo[2][2] = 8;

    printf("Matriz adjacente:\n");
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            printf("%d\t", grafo[i][j]);
        }
        printf("\n");
    }

    kruskal();
    mostra();

    return 0;
}
