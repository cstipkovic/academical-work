#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>

main() {
	int pid1 = fork();
	int pid2 = fork();

	printf("%d, %d, %d\n", getpid(), pid1, pid2);

	system("date");
}
