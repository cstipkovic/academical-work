/*
	Atividade 2- Algoritmo que lê 3 números inteiros e mostre o 
	maior e o menor deles.
*/

#include <iostream>

using namespace std;

int main() {
	int num, maior, menor;

	cout << "Informe um numero: ";
	cin >> num;

	maior = menor = num;

	for (int i = 0; i <= 1; i++) {
		cout << "Informe um numero: ";
		cin >> num;

		if (num > maior) {
			maior = num;
		}

		if (num < menor) {
			menor = num;
		}
	}

	cout << endl;
	cout << "Maior numero é: " << maior << endl;
	cout << "Menor numero é: " << menor << endl;

	return 0;
}