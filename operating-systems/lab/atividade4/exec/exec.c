#include <stdio.h>
#include <string.h>
#include <unistd.h>

int main() {
	char argumentOrigin[100], argumentDestiny[100];
	char C[5];

	printf("Informe o comando: ");
	scanf("%s", C);
	getchar();
	printf("\n");

	if (strcmp(C, "dir") == 0) {
		execl("/bin/ls", "ls", "-lah", NULL);
	}

	if (strcmp(C, "type") == 0) {
		printf("Informe o arquivo: ");
		scanf("%s", argumentOrigin);
		printf("\n");
		getchar();

		execl("/bin/cat", "cat", argumentOrigin, NULL);
	}

	if (strcmp(C, "copy") == 0) {
		printf("Informe o arquivo: ");
		scanf("%s", argumentOrigin);
		printf("\n");
		getchar();

		printf("Informe o destino do arquivo: ");
		scanf("%s", argumentDestiny);
		printf("\n");
		getchar();

		execl("/bin/cp", "cp", argumentOrigin, argumentDestiny, NULL);
	}

	if (strcmp(C, "exit") == 0) {
		return 0;
	}
}
