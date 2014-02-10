#include "Paralelepipedo.h"

Paralelepipedo::Paralelepipedo (double n_ladoA, double n_ladoB, double n_ladoC) {
	ladoA = n_ladoA;
	ladoB = n_ladoB;
	ladoC = n_ladoC;
	nome = "Paralelepipedo";
}

double Paralelepipedo::Volume () {
	return 0.0;
}

void Paralelepipedo::Imprimir () {
	cout << nome << ", " << Area() << endl;
}