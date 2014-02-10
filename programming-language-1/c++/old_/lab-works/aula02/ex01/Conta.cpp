#include <iostream>
#include "Conta.h"

using namespace std;

Conta::Conta(int nNumeroConta, string nNomeTitular, float nSaldo) {
	numeroConta = nNumeroConta;
	nomeTitular = nNomeTitular;
	saldo = nSaldo;
}

bool Conta::deposita(float valor) {
	if(valor > 0.0) {
		saldo = valor;
		return true;
	} else {
		return false;
	}
}

void Conta::consulta() {
	// 
}