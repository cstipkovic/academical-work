#include "Circulo.h"

#ifndef ESFERA_H
#define ESFERA_H

class Esfera : public Circulo {
public:
	Esfera(double diametro = 2);
	double Area();
	double Volume();
	void Imprimir();
};

#endif