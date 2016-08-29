#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>

#define NUM_THREADS 10
#define t 4

int A [t][t];
int B [t][t];
int AxB [t][t];

struct vetor {
	int i;
	int j;
};

void *multiplicaThread(void *param) {
	struct vetor *data = param;
	int n, sum = 0;

	for (n = 0; n < t; n++) {
		sum += A[data->i][n] * B[n][data->j];
	}

	AxB[data->i][data->j] = sum;

	pthread_exit(0);
}


int main(int argc, char *argv[]) {
	int c, d;
	int min = 0;
	int max = 10;

	for (c = 0; c < t; c++) {
		for (d = 0; d < t; d++) {
			A[c][d] = min + (rand() % (int)(max - min + 1));
			B[c][d] = min + (rand() % (int)(max - min + 1));
		}
	}

	int i,j, count = 0;
	for (i = 0; i < t; i++) {
		for (j = 0; j < t; j++) {
			struct vetor *data = (struct vetor *) malloc(sizeof(struct vetor));
			data->i = i;
			data->j = j;

			pthread_t tid;
			pthread_attr_t attr;

			pthread_attr_init(&attr);

			pthread_create(&tid, &attr, multiplicaThread, data);

			pthread_join(tid, NULL);
			count++;
		}
	}

	for (i = 0; i < t; i++) {
		for (j = 0; j < t; j++) {
			printf("%d ", AxB[i][j]);
		}
		printf("\n");
	}
}
