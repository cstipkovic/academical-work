#include "Circulo.h"

Circulo::Circulo (double n_diametro) {
	diametro = n_diametro;
	nome = "Circulo";
}

double Circulo::Area () {
	return (PI * (diametro / 2) * (diametro / 2));
}

void Circulo::Imprimir () {
	cout << nome << ", " << Area() << endl;
}