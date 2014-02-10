#include "Conta.h"

// Conta
Conta::Conta() {
    saldo = 0.00;
}

double Conta::getSaldo() {
    return saldo;
}

void Conta::deposita(double valorDeposito) {
    saldo = saldo + valorDeposito;
}

bool Conta::SacarConta(double valorSacar) {
    if(getSaldo() >= valorSacar) {
        saldo = saldo - valorSacar;
        return true;
    } else {
        return false;
    }
}

void Conta::atualiza(double taxa) {
    saldo += saldo * taxa;
}
