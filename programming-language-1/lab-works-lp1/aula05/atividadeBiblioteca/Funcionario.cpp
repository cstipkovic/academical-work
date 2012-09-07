#include <iostream>

#include "Usuario.h"
#include "Funcionario.h"

Funcionario::Funcionario(string nNome, string nEndereco, int nNumero, string nBairro, int nIdUsuario, int nRF) {
    Usuario::cadastra(nNome, nEndereco, nNumero, nBairro, nIdUsuario);
    RF = nRF;
}