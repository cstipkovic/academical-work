/*
 * Correntista.h
 */

#ifndef CORRENTISTA_H_
#define CORRENTISTA_H_

#include <iostream>

using namespace std;

class Correntista {
private:
	string nome;
	int idCorrentista;
public:
	Correntista(int, string);
	string getNome();
	int getIdCorrentista();
};

#endif /* CORRENTISTA_H_ */
