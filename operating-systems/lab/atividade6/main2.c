#include <stdio.h>
#include <pthread.h>

void* thread_func (void* parametro) {
    
	int i = 0;
	int *p = (int *)parametro;
    
	for (i = 0; i < *p; i++) {
        	printf("%d parametro: %d\n", i, *p);
    	}
	
	return 0;
}

int main (int argc, char **argv) {

	pthread_t thread_handler;
	int n_parametro = 10;

	int ret = pthread_create(&thread_handler, 0, thread_func, (void *)&n_parametro);

	if (ret != 0) {
		printf("Falha na criacao da thread: erro %d", ret);
		return 1;
	}

	pthread_join(thread_handler, 0);

	return 0;
}
