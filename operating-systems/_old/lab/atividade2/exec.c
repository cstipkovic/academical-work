#include <unistd.h>
#include <stdio.h>

int main() {
	int opcao;

	printf("informe a opcao: ");
	scanf("%d", &opcao);
	while(opcao != 0) {
		switch(opcao) {
			case 1:
				execl("/bin/cp", "cp", "/home/aluno/test.txt", "/home/aluno/topico2/test.txt", NULL);
				break;
			case 2:
				execl("/bin/ls", "ls", "/home/aluno/topico2/", NULL);
				break;
			case 3:
				execl("/bin/cat", "cat", "/home/aluno/topico2/test.txt", NULL);
				break;
			default:
				printf("informe a opcao: ");
				scanf("%d", &opcao);
				break;
		}
	}

	return 0;
}
