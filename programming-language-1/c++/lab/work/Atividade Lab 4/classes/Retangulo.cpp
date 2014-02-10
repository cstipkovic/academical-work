#include "Retangulo.h"

Retangulo::Retangulo (double n_ladoA, double n_ladoB) {
	ladoA = n_ladoA;
	ladoB = n_ladoB;
	nome = "Retangulo";
}

double Retangulo::Area () {
	return (ladoA * ladoB);
}

void Retangulo::Imprimir () {
	cout << nome << ", " << Area() << endl;
}