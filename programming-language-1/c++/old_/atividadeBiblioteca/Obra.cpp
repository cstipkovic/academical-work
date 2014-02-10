#include <iostream>

using namespace std;

#include "Obra.h"

void Obra::cadastra(string nTipo, string nTitulo, string nAutor, string nLingua, string nEditora, int nAnoEdicao) {
    tipo = nTipo;
    titulo = nTitulo;
    autor = nAutor;
    lingua = nLingua;
    editora = nEditora;
    anoEdicao = nAnoEdicao;
}

string Obra::getTipo() {
	return tipo;
}

string Obra::getTitulo() {
	return titulo;
}

string Obra::getAutor() {
	return autor;
}

string Obra::getLingua() {
	return lingua;
}

string Obra::getEditora() {
	return editora;
}

int Obra::getAnoEdicao() {
	return anoEdicao;
}