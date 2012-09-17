#include <iostream>

using namespace std;

#include "Obra.h"
#include "Livro.h"

Livro::Livro(string nTipo, string nTitulo, string nAutor, string nLingua, string nEditora, int nAnoEdicao, int nISBN) {
    Obra::cadastra(nTipo, nTitulo, nAutor, nLingua, nEditora, nAnoEdicao);
    ISBN = nISBN;
}

string Livro::getTipo() {
	return Obra::getTipo();
}

string Livro::getTitulo() {
	return Obra::getTitulo();
}

string Livro::getAutor() {
	return Obra::getAutor();
}

string Livro::getLingua() {
	return Obra::getLingua();
}

string Livro::getEditora() {
	return Obra::getEditora();
}

int Livro::getAnoEdicao() {
	return Obra::getAnoEdicao();
}

int Livro::getISBN() {
	return ISBN;
}