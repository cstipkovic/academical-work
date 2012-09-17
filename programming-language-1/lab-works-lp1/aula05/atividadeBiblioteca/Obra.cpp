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