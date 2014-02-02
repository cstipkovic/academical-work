#include <iostream>

using namespace std;

class Usuario {
private:
	string nome, endereco, bairro;
	int numero, idUsuario;

protected:
	void cadastra(string, string, int, string, int);
	string getNome();
	string getEndereco();
	string getBairro();
	int getNumero();
	int getIdUsuario();
};