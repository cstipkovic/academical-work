#include <iostream>

using namespace std;

#include "Academico.h"

Academico::Academico(string nTipo, string nTitulo, string nAutor, string nLingua, string nEditora, int nAnoEdicao, string nDptPesquisa) {
    Obra::cadastra(nTipo, nTitulo, nAutor, nLingua, nEditora, nAnoEdicao);
    dptPesquisa = nDptPesquisa;
}