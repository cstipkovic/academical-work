#include "Conta.h"

// Conta
Conta::Conta() {
    saldo = 0.00;
}

void Conta::setSaldo(double n_saldo) {
    saldo = n_saldo;
}

double Conta::getSaldo() {
    return saldo;
}

void Conta::deposita(double valorDeposito) {
    setSaldo(getSaldo() + valorDeposito);
}

bool Conta::saca(double valorSacar) {
    double n_saldo;

    if(getSaldo() >= valorSacar) {
        n_saldo = getSaldo() - valorSacar;
        setSaldo(n_saldo);
        return true;
    } else {
        return false;
    }
}
