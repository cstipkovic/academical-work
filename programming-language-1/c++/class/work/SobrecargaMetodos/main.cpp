#include <iostream>
#include <vector>

using namespace std;

#include "classes/OverloadingSumMethod.h"

int main () {
	double 	numero  = 0,
			numero1 = 1,
			numero2 = 2,
			numero3 = 3,
			numero4 = 4,
			numeroArray[] = {5.0, 4.0, 3.0, 2.0, 1.0, 0.0};

	vector<double> numeroVector(numeroArray, numeroArray + sizeof(numeroArray) / sizeof(double));

	cout << "Construtor vazio: " << endl;
	OverloadingSumMethod om;

	cout << "Construtor com um parametro: " << endl;
	OverloadingSumMethod om1(numero);

	cout << "Construtor com dois parametros: " << endl;
	OverloadingSumMethod om2(numero1, numero2);

	cout << "Construtor com tres parametros: " << endl;
	OverloadingSumMethod om3(numero1, numero2, numero3);

	cout << "Construtor com quatro parametros: " << endl;
	OverloadingSumMethod om4(numero1, numero2, numero3, numero4);

	cout << "Construtor usando array como parametro: " << endl;
	OverloadingSumMethod om5(numeroVector);

	return 0;
}