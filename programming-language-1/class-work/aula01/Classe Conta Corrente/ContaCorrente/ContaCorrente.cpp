/*
 * ContaCorrente.cpp
 */

#include <cstdlib>

using namespace std;

#include "ContaCorrente.h"

ContaCorrente::ContaCorrente(int nIdConta, float saldoInicial, int nIdCorrentista) {
	idConta = nIdConta;
	saldo = saldoInicial;
	idCorrentista = nIdCorrentista;
}

bool ContaCorrente::depositaValor(float valor) {
	if (valor > 0.00) {
		saldo = valor;
		return true;
	} else {
		return false;
	}
}

bool ContaCorrente::sacaValor(float valor) {
	if (valor > 0.00) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			return true;
		} else {
			return false;
		}
	} else {
		return false;
	}
}

float ContaCorrente::getSaldo() {
	return saldo;
}
