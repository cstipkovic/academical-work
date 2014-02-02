#include <iostream>

using namespace std;

#include "Obra.h"
#include "Periodico.h"

Periodico::Periodico(string nTipo, string nTitulo, string nAutor, string nLingua, string nEditora, int nAnoEdicao, string nISSN) {
    Obra::cadastra(nTipo, nTitulo, nAutor, nLingua, nEditora, nAnoEdicao);
    ISSN = nISSN;
}

string Periodico::getTipo() {
	return Obra::getTipo();
}

string Periodico::getTitulo() {
	return Obra::getTitulo();
}

string Periodico::getAutor() {
	return Obra::getAutor();
}

string Periodico::getLingua() {
	return Obra::getLingua();
}

string Periodico::getEditora() {
	return Obra::getEditora();
}

int Periodico::getAnoEdicao() {
	return Obra::getAnoEdicao();
}

string Periodico::getISSN() {
	return ISSN;
}