#include <unistd.h>
#include <stdio.h>

int main() {
	char pathTo[100];
	int i;

	printf("Caminho do destino: ");
	scanf("%s", pathTo);
	getchar();

	i = chdir(pathTo);

	if (i == 0) {
		printf("OK\n");
	} else {
		printf("nao OK\n");
	}
	
	return 0;
}
