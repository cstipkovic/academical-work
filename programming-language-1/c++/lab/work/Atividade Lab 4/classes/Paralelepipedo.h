#include "Retangulo.h"

#ifndef PARALELEPIPEDO_H
#define PARALELEPIPEDO_H

class Paralelepipedo : public Retangulo {
public:
	Paralelepipedo(double ladoA = 2, double ladoB = 2, double ladoC = 2);
	double Volume();
	void Imprimir();
protected:
	double ladoC;
};

#endif