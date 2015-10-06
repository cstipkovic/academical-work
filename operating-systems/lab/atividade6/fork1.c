#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
#include <stdlib.h>

void main() {
	int pid[3];

	pid[0] = fork();
	pid[1] = fork();
	pid[2] = fork();

	int i;
	for (i = 0; i < 2; i++) {
		if (0 == pid[i]) {
			printf("FILHO: \t id is %d, pid (valor) is %d\n", getpid(), pid[i]);
		} else {
			printf("PAI: \t id is %d, pid (filho) is %d\n", getpid(), pid[i]);
		}

		sleep(10);
	}
}
