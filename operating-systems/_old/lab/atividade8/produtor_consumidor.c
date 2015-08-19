#define __USE_GNU 1 
#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

#include <semaphore.h>

#define N_ITENS 30
int buffer[N_ITENS];

sem_t pos_vazia;
sem_t pos_ocupada;

int inicio = 0, final = 0;

void* produtor(void *v) {
  int i;

  for (i = 0; i < 3 * N_ITENS; i++) {
    sem_wait(&pos_vazia);
    printf("Produtor, item = %d.\n", i);     
    final = (final + 1) % N_ITENS;
    buffer[final] = i;
    sem_post(&pos_ocupada);
    sleep(random() % 3); 
  }
  
  return NULL;
}

void* consumidor(void *v) {
  int i;

  for (i = 0; i < 3 * N_ITENS; i++) {
    sem_wait(&pos_ocupada);
    inicio = (inicio + 1) % N_ITENS;
    printf("Consumidor, item = %d.\n", buffer[inicio]);
    sem_post(&pos_vazia);
    sleep(random() % 3);  
  }

  return NULL;
}

int main() {

  pthread_t thr_produtor, thr_consumidor;

  sem_init(&pos_vazia, 0, N_ITENS);
  sem_init(&pos_ocupada, 0, 0);
  
  pthread_create(&thr_produtor, NULL, produtor, NULL);
  pthread_create(&thr_consumidor, NULL, consumidor, NULL);

  pthread_join(thr_produtor, NULL); 
  pthread_join(thr_consumidor, NULL);

  sem_destroy(&pos_vazia);
  sem_destroy(&pos_ocupada);
  
  return 0;
}

