#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <sys/types.h>
#include <stdlib.h>
int main(void)
{
pid_t pid;
int aux;
int status;
pid=fork();
if (pid<0)
{
perror("Erro ao criar o processo\n");
exit(-1);
}
else
{
if (pid > 0) /* Código do Pai */
{
printf("Pai\n");
do
{
aux = waitpid(pid, &status, WNOHANG);
if (aux==-1)
{
perror("Erro em waitpid");
exit(-1);
}
if (aux == 0)
{
printf(".\n");
sleep(1);
}
} while (aux == 0);
if (WIFEXITED(status))
{
printf("Pai: o filho retornou o valor:%d\n", WEXITSTATUS(status));
}
}
else /* Código do filho */
{
printf("Filho\n");
sleep(5);
printf("Filho saindo...\n");
exit(5);
}
exit(0);
}
}
