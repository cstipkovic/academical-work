#include <iostream>

using namespace std;

#include "Obra.h"
#include "Academico.h"

Academico::Academico(string nTipo, string nTitulo, string nAutor, string nLingua, string nEditora, int nAnoEdicao, string nDptPesquisa) {
    Obra::cadastra(nTipo, nTitulo, nAutor, nLingua, nEditora, nAnoEdicao);
    dptPesquisa = nDptPesquisa;
}

string Academico::getTipo() {
	return Obra::getTipo();
}

string Academico::getTitulo() {
	return Obra::getTitulo();
}

string Academico::getAutor() {
	return Obra::getAutor();
}

string Academico::getLingua() {
	return Obra::getLingua();
}

string Academico::getEditora() {
	return Obra::getEditora();
}

int Academico::getAnoEdicao() {
	return Obra::getAnoEdicao();
}

string Academico::getDptPesquisa() {
	return dptPesquisa;
}