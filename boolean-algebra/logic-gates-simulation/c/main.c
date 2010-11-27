/*
 *  Logic Gates Simulation
 * */

#include <stdio.h>

int gateAND(int, int);
int gateOR(int, int);
int gateXOR(int, int);
int gateNAND(int, int);
int gateNOR(int, int);
int gateNOT(int);

int main() {
	unsigned int x, y, result, opcao;
	do {
		x = 0;
		y = 0;
		printf("\nEscolha a porta logica\n");
		printf("\n1\tAND");
		printf("\n2\tOR");
		printf("\n3\tXOR");
		printf("\n4\tNAND");
		printf("\n5\tNOR");
		printf("\n6\tNOT");

		printf("\n\nOpção: ");
		scanf("%d", &opcao);
		
		if(opcao == 6) {
			printf("\nDigite a entrada p/ NOT:");
			scanf("%d", &x);
		} else if(opcao >= 1 && opcao <= 5) {
			printf("\nDigite o valor de X:");
			scanf("%d", &x);
			printf("\nDigite o valor de Y:");
			scanf("%d", &y);
		}
		
		if(x < 2 && y < 2) {

			switch(opcao) {
				case 1:
					result = gateAND(x, y);
					break;
				case 2:
					result = gateOR(x, y);
					break;
				case 3:
					result = gateXOR(x, y);
					break;
				case 4:
					result = gateNAND(x, y);
					break;
				case 5:
					result = gateNOR(x, y);
					break;
				case 6:
					result = gateNOT(x);
					break;
				default:
					printf("\nOpção invalida!");
			}
			printf("\nSaida: %d\n", result);
			printf("===============");
		}

	} while(x < 2 && y < 2);
	
}

int gateAND(int x, int y) {
	return(x == 1 && y == 1);	
}

int gateOR(int x, int y) {
	return(x == 1 || y == 1);
}

int gateNOT(int x) {
	return(x == 1 ? 0 : 1);
}

int gateXOR(int x, int y) {
	return(x != y);
}

int gateNAND(int x, int y) {
	return(gateNOT(gateAND(x, y)));
}

int gateNOR(int x, int y) {
	return(gateNOT(gateOR(x, y)));
}
