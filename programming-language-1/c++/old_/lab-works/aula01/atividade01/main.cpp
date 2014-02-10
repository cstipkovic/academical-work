/*
	Atividade 1 - Calcula a média aritmética das 3 notas de um aluno e mostra, 
	além do valor da média, uma mensagem de "Aprovado", caso a média seja 
	igual ou superior a 6, ou a mensagem "reprovado", caso contrário.
*/

#include <iostream>

using namespace std;

int main() {
	float nota1, nota2, nota3, media;

	//for (i = 0, )

	cout << "Informa a nota 1: ";
	cin >> nota1;
	cout << endl;

	cout << "Informa a nota 2: ";
	cin >> nota2;
	cout << endl;

	cout << "Informa a nota 3: ";
	cin >> nota3;
	cout << endl;


	media = (nota1 + nota2 + nota3) / 3;

	if (media >= 6) {
		cout << "Média do(a) Aluno(a): " << media << endl;
		cout << "Parabéns! Aprovado(a)!" << endl;
	} else {
		cout << "Média do(a) Aluno(a): " << media << endl;
		cout << "Desculpe! Reprovado(a)!" << endl;
	}
	return 0;
}