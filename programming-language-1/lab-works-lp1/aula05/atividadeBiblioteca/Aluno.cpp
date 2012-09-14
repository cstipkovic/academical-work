#include <iostream>

using namespace std;

#include "Usuario.h"
#include "Aluno.h"

Aluno::Aluno(string nNome, string nEndereco, int nNumero, string nBairro, int nIdUsuario, int nRA) {
    Usuario::cadastra(nNome, nEndereco, nNumero, nBairro, nIdUsuario);
    RA = nRA;
}

// string Aluno::getAluno(int RA) {
//     return ([Usuario::nNome]);
// }