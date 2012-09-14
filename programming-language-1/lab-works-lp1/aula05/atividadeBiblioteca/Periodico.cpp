#include <iostream>

using namespace std;

#include "Periodico.h"

Periodico::Periodico(string nTipo, string nTitulo, string nAutor, string nLingua, string nEditora, int nAnoEdicao, string nISSN) {
    Obra::cadastra(nTipo, nTitulo, nAutor, nLingua, nEditora, nAnoEdicao);
    ISSN = nISSN;
}