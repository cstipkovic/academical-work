/*
 * test.cpp
 */

#include <iostream>

using namespace std;

#include "Correntista.h"
#include "ContaCorrente.h"

int main() {
	Correntista cliente(1, "Fulano");
	cout << "Nome do Correntista: " << cliente.getNome() << endl;

	ContaCorrente cc(1, 10.00, cliente.getIdCorrentista());
	cc.depositaValor(0.00);
	cc.depositaValor(5.00);
	cout << "Saldo da conta corrente: " << cc.getSaldo() << endl;

	if (cc.sacaValor(20.00)) {
		cout << "Valor sacado com sucesso!" << endl;
	} else {
		cout << "Saldo insuficiente!" << endl;
	}

	return 0;
}



