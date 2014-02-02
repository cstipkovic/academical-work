#include <iostream>

#include "Usuario.h"

using namespace std;

void Usuario::cadastra(string nNome, string nEndereco, int nNumero, string nBairro, int nIdUsuario) {
    nome = nNome;
    endereco = nEndereco;
    numero = nNumero;
    bairro = nBairro;
    idUsuario = nIdUsuario;
}

string Usuario::getNome() {
	return nome;
}

string Usuario::getEndereco() {
	return endereco;
}

string Usuario::getBairro() {
	return bairro;
}

int Usuario::getNumero() {
	return numero;
}

int Usuario::getIdUsuario() {
	return idUsuario;
}