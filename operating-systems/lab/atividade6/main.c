#include <stdio.h>
#include <pthread.h>

void hello (void) {
	printf("Hello, world.\n");
}

int main (void) {
	pthread_t tid;

	pthread_create(&tid, NULL, (void *) hello, NULL);

	pthread_join(tid, NULL);

	return 0;
}
