/*
 * Correntista.cpp
 */
#include <string>

using namespace std;

#include "Correntista.h"

Correntista::Correntista(int nIdCorrentista, string nNome) {
    idCorrentista = nIdCorrentista;
    nome = nNome;
}

string Correntista::getNome() {
	return nome;
}

int Correntista::getIdCorrentista() {
	return idCorrentista;
}
