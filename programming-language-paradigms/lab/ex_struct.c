#include <stdio.h>
#include <string.h>

struct endereco {
	char rua[50];
	int num;
	char bairro[20];
	char cidade[30];
	int cep;
};

struct ficha_pessoal {
	char nome[50];
	int telefone;
	struct endereco end;
};

int main() {
	struct ficha_pessoal ficha;
	strcpy(ficha.nome, "Daniela");
	ficha.telefone = 12345678;
	
	strcpy(ficha.end.cidade, "Sao Paulo");
	
	printf("%s", ficha.nome);
	
	return 0;
}
