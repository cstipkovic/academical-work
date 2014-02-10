#include <iostream>
#include <vector>

using namespace std;

#include "OverloadingSumMethod.h"

OverloadingSumMethod::OverloadingSumMethod () {
	this->infoMessage();
	cout << endl;
}

OverloadingSumMethod::OverloadingSumMethod (double number) {
	this->infoMessage();
	cout << endl;
}

OverloadingSumMethod::OverloadingSumMethod (double number1, double number2) {
	cout << "Resultado da soma = " << (number1 + number2) << endl;
	cout << endl;
}

OverloadingSumMethod::OverloadingSumMethod (double number1, double number2, double number3) {
	cout << "Resultado da soma = " << (number1 + number2 + number3) << endl;
	cout << endl;
}

OverloadingSumMethod::OverloadingSumMethod (double number1, double number2, double number3, double number4) {
	cout << "Resultado da soma = " << (number1 + number2 + number3 + number4) << endl;
	cout << endl;
}

OverloadingSumMethod::OverloadingSumMethod (vector<double> number) {
	if (number.size() > 1) {
		double result = 0.0;

		for (unsigned int i = 0; i < number.size(); i++) {
			result = result + number[i];
		}

		cout << "Resultado da soma = " << result << endl;
		cout << endl;
	} else {
		this->infoMessage();
		cout << endl;
	}
}

void OverloadingSumMethod::infoMessage () {
	cout << "Voce deve informa 2, 3 ou 4 numeros ou um array com mais de um numero." << endl;
}