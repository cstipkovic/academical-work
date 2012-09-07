#include <iostream>

#include "Obra.h"
#include "Livro.h"

using namespace std;

Livro::Livro(string nTipo, string nTitulo, string nAutor, string nLingua, string nEditora, int nAnoEdicao, string nISBN) {
    Obra::cadastra(nTipo, nTitulo, nAutor, nLingua, nEditora, nAnoEdicao);
    ISBN = nISBN;
}