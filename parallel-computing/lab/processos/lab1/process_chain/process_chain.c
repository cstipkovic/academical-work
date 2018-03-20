#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(int argc, char *argv[])
{
    pid_t childpid = 0;
    int i, n;

    if (argc != 2)
    { /* check for valid number of command-line arguments */
        fprintf(stderr, "Usage: %s processes\n", argv[0]);

        return 1;
    }

    n = atoi(argv[1]);
    for (i = 1; i < n; i++)
        if (childpid = fork())
            break;

    // fprintf(stderr, "i:%d process ID:%ld parent ID:%ld child ID:%ld\n",
    //         i, (long)getpid(), (long)getppid(), (long)childpid);

    fprintf(stdout, "i:%d process ID:%ld parent ID:%ld child ID:%ld\n",
            i, (long)getpid(), (long)getppid(), (long)childpid);

    return 0;
}

/*
1-  Rode o programa anterior para valores grandes de n. 
    As mensagens sempre estarao ordenadas pelo valor de i? 

    Resposta: Não, pois o tempo de mudança de estado de um processo para “feito” varia, 
        dependendo da fila de prioridades dos processos que estão em estado de “execução” 
        naquele momento.

2-  O que acontece se o programa anterior escreve-se as mensagens para sys.stdout,
    usando print, ao inv´es de para sys.stderr?

    Resposta: Nao consegui verificar ao certo a diferenca, mas pelo que notei o stdout
        faz a saida um pouco mais rapida do que o stderr, ja que ele nao apresenta uma 
        descricao mais detalhada de um erro, como e o caso do stderr.
*/