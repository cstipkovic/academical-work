#include "Conta.h"

// Conta
Conta::Conta(string n_nomeBanco) {
  this->setBancoNome(n_nomeBanco);
  this->saldo = 0.00;
}

double Conta::getSaldo() {
    return this->saldo;
}

void Conta::deposita(double valorDeposito) {
    this->saldo = saldo + valorDeposito;
}

bool Conta::saca(double valorSacar) {
    if(getSaldo() >= valorSacar) {
        this->saldo = this->saldo - valorSacar;
        return true;
    } else {
        return false;
    }
}
