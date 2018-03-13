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

    fprintf(stderr, "i:%d process ID:%ld parent ID:%ld child ID:%ld\n",
            i, (long)getpid(), (long)getppid(), (long)childpid);

    return 0;
}

/*
1-  Rode o programa anterior para valores grandes de n. 
    As mensagens sempre estar˜ao ordenadas pelo valor de i? 

2-  O que acontece se o programa anterior escreve - se as mensagens para sys.stdout,
    usando print, ao inv´es de para sys.stderr ?
*/