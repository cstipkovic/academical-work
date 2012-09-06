#include <iostream>

#include "Conta.h"
#include "ContaCorrente.h"

using namespace std;

// Conta Corrente
void ContaCorrente::atualiza(double taxa) {
    double saldoParcial = Conta::getSaldo();
    Conta::deposita(saldoParcial * (2 * taxa));
}

void ContaCorrente::deposita(double valorDeposito) {
    if(valorDeposito > 0.1) {
        double valorParcial = valorDeposito - 0.1;
        Conta::deposita(valorParcial);
     } else {
        cout << "O valor de Deposito deve ser maior que 0.10, pois È cobrada a taxa de 0.10 por deposito na Conta Corrente!";
     }
}