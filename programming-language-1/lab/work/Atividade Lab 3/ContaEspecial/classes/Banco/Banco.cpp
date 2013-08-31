#include "Banco.h"

void Banco::setBancoNome(string n_bancoNome) {
  this->nome = n_bancoNome;
}

string Banco::getBancoNome() {
  return this->nome;
}