#include <iostream>

using namespace std;

#include "Usuario.h"
#include "Funcionario.h"

Funcionario::Funcionario(string nNome, string nEndereco, int nNumero, string nBairro, int nIdUsuario, int nRF) {
    Usuario::cadastra(nNome, nEndereco, nNumero, nBairro, nIdUsuario);
    RF = nRF;
}

string Funcionario::getNome() {
	return Usuario::getNome();
}

string Funcionario::getEndereco() {
	return Usuario::getEndereco();
}

int Funcionario::getNumero() {
	return Usuario::getNumero();
}

string Funcionario::getBairro() {
	return Usuario::getBairro();
}

int Funcionario::getIdUsuario() {
	return Usuario::getIdUsuario();
}

int Funcionario::getRF() {
	return RF;
}