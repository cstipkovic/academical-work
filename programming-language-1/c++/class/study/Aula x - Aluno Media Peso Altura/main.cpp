#include <iostream>
#include <vector>

using namespace std;

class Aluno {
public:
	Aluno(string, double, double);

private:
	string nome;
	double peso;
	double altura;
};

Aluno::Aluno (string n_nome, double n_peso, double n_altura) {
	this->nome = n_nome;
	this->peso = n_peso;
	this->altura = n_altura;
}

int main () {
	vector<Aluno>* alunos;

	alunos[0] = new Aluno("ze", 80.0, 1.70);

	// alunos[0] = new Aluno("ze", 80.0, 1.70);
	// alunos[1] = new Aluno("jao", 120.0, 1.69);

	return 0;
}