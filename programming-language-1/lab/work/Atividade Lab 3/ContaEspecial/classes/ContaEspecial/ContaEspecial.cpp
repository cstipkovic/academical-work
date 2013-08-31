#include "ContaEspecial.h"

ContaEspecial::ContaEspecial(string n_nomeBanco, double n_limite, double n_taxaJuros) {
    this->setBancoNome(n_nomeBanco);
    this->limite = n_limite;
    this->taxaJuros = n_taxaJuros;
}