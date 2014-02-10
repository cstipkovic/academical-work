#include <cstdlib>
#include <iostream>

#include "classes/ContaEspecial/ContaEspecial.h"

/*
 * 
 */
int main() {
    
    ContaEspecial ce(100.0, 10.0);

    // Deposita valor na conta especial
    ce.deposita(100.0);

	cout << "Saldo atual: " << ce.getSaldo() << endl;
	cout << "Limite: " << ce.getLimite() << endl;
	cout << "Disponível para uso: " <<  ce.getSaldoDisponivel() << endl;

	cout << endl;

	// Saca valor na conta especial
    ce.saca(110.0);

	cout << "Saldo atual: " << ce.getSaldo() << endl;
	cout << "Limite: " << ce.getLimite() << endl;
	cout << "Disponível: " << ce.getSaldoDisponivel() << endl;

    return 0;
}

