#include <string>

#include "ContaCorrente.h"

using namespace std;

// Conta
ContaCorrente::ContaCorrente(string n_nomeCorrentista) {
    saldo = 0.00;
    nomeCorrentista = n_nomeCorrentista;
}

double ContaCorrente::getSaldo() {
    return saldo;
}

string ContaCorrente::getNomeCorrentista() {
    return nomeCorrentista;
}

void ContaCorrente::deposita(double valorDeposito) {
    saldo = saldo + valorDeposito;
}

bool ContaCorrente::saca(double valorSacar) {
    if(getSaldo() >= valorSacar) {
        saldo = saldo - valorSacar;
        return true;
    } else {
        return false;
    }
}
