#include <iostream>

using namespace std;

#include "Usuario.h"
#include "Aluno.h"

Aluno::Aluno(string nNome, string nEndereco, int nNumero, string nBairro, int nIdUsuario, int nRA) {
    Usuario::cadastra(nNome, nEndereco, nNumero, nBairro, nIdUsuario);
    RA = nRA;
}

string Aluno::getNome() {
	return Usuario::getNome();
}

string Aluno::getEndereco() {
	return Usuario::getEndereco();
}

string Aluno::getBairro() {
	return Usuario::getBairro();
}

int Aluno::getNumero() {
	return Usuario::getNumero();
}

int Aluno::getIdUsuario() {
	return Usuario::getIdUsuario();
}

int Aluno::getRA() {
	return RA;
}