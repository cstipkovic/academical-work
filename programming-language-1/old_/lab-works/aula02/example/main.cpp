#include <iostream>
#include "Porta.h"

using namespace std;

int main() {
	Porta porta;

	porta.abre();

	if(porta.verificaStatusPorta()) {
		cout << "\n\n Porta aberta!\n\n";
	} else {
		cout << "\n\n Porta fechada!\n\n";
	}

	return 0;
}