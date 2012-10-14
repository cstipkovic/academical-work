/*
 * Correntista.cpp
 */

#include <iostream>

using namespace std;

#include "Correntista.h"

Correntista::Correntista(int nIdCorrentista, string nNome) {
	idCorrentista = nIdCorrentista;
	nome = nNome;
}

string Correntista::getNome() {
	return this->nome;
}

int Correntista::getIdCorrentista() {
	return this->idCorrentista;
}
