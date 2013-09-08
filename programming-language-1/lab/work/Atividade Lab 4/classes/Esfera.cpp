#include "Esfera.h"

Esfera::Esfera (double n_diametro) {
	diametro = n_diametro;
	nome = "Esfera";
}

double Esfera::Area () {
	return (4 * PI * ((diametro / 2) * (diametro / 2)));
}

double Esfera::Volume () {
	return 0.0;
}

void Esfera::Imprimir () {
	cout << nome << Area() << endl;
}