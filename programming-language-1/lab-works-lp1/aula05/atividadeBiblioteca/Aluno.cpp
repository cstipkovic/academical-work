#include <iostream>

#include "Usuario.h"
#include "Aluno.h"

using namespace std;

Aluno::Aluno(string nNome, string nEndereco, int nNumero, string nBairro, int nIdUsuario, int nRA) {
    Usuario::cadastra(nNome, nEndereco, nNumero, nBairro, nIdUsuario);
    RA = nRA;
}