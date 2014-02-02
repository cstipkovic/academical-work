#include "Figura.h"

#ifndef RETANGULO_H
#define RETANGULO_H

class Retangulo : public Figura {
public:
	Retangulo(double ladoA = 2, double ladoB = 2);
	double Area();
	void Imprimir();

protected:
	double ladoA, ladoB;
	string nome;
};

#endif