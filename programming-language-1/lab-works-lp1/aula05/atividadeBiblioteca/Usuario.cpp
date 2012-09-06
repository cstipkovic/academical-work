#include <iostream>

#include "Usuario.h"

using namespace std;

Usuario::Usuario(string nNome, string nEndereco, int nNumero, string nBairro, int nIdUsuario) {
    nome = nNome;
    endereco = nEndereco;
    numero = nNumero;
    bairro = nBairro;
    idUsuario = nIdUsuario;
}