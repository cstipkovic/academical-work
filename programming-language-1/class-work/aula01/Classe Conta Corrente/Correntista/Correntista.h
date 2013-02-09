/*
 * Correntista.h
 */
#include <string>

using namespace std;

#ifndef CORRENTISTA_H_
#define CORRENTISTA_H_

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
