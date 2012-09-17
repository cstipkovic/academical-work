#include <iostream>

class Funcionario : public Usuario {
private:
    int RF;

public:
    Funcionario(string, string, int, string, int, int);
    string getNome();
    string getEndereco();
    int getNumero();
    string getBairro();
    int getIdUsuario();
    int getRF();
};