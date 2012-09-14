#include <iostream>

using namespace std;    

#include "Livro.h"

Livro::Livro(string nTipo, string nTitulo, string nAutor, string nLingua, string nEditora, int nAnoEdicao, string nISBN) {
    Obra::cadastra(nTipo, nTitulo, nAutor, nLingua, nEditora, nAnoEdicao);
    ISBN = nISBN;
}