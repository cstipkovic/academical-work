#include "Figura.h"

#ifndef CIRCULO_H
#define CIRCULO_H

class Circulo : public Figura {
public:
	Circulo(double diametro = 2);
	double Area();
	void Imprimir();

protected:
	double diametro;
	string nome;
};

#endif