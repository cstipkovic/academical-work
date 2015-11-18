#include <stdio.h>
#include <stdlib.h>

int main () {
    int pid;
    pid = fork();

    if (pid != 0) {
        while(1)
            sleep(100);
    } else {
        exit(0);
    }
}
