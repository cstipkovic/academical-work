#include <iostream>

using namespace std;

#include "classes/OverloadingSumMethod.h"

int main () {
	double 	numero  = 0,
			numero1 = 1,
			numero2 = 2,
			numero3 = 3,
			numero4 = 4,
			numeroArray [] = {0, 1, 2, 3, 4, 5};

	cout << "Construtor vazio: " << endl;
	OverloadingSumMethod om;

	// cout << "Construtor com um parametro: " << endl;
	// OverloadingSumMethod om1(numero);

	cout << "Construtor com dois parametros: " << endl;
	OverloadingSumMethod om2(numero1, numero2);

	cout << "Construtor com tres parametros: " << endl;
	OverloadingSumMethod om3(numero1, numero2, numero3);

	cout << "Construtor com quatro parametros: " << endl;
	OverloadingSumMethod om4(numero1, numero2, numero3, numero4);

	cout << "Construtor usando array como parametro: " << endl;
	OverloadingSumMethod om5(numeroArray[]);

	return 0;
}