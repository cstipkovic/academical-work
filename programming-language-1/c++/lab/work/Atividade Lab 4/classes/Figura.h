#include <iostream>

using namespace std;

#define PI 3.14

#ifndef FIGURA_H
#define FIGURA_H

class Figura {
public:
	virtual double Area() = 0;
	virtual void Imprimir();
};

#endif