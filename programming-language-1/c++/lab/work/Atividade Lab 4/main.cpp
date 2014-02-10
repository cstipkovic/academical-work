// #include "classes/Esfera.h"
// #include "classes/Paralelepipedo.h"

#include "classes/Retangulo.h"

int main () {
	Figura *FIG[4];

	FIG[0] = new Retangulo();
	FIG[1] = new Paralelepipedo();
	FIG[2] = new Circulo();
	FIG[3] = new Esfera();

	return 0;
}