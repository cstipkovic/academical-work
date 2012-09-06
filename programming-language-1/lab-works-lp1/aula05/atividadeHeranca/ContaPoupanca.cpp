#include "ContaPoupanca.h"

// Conta Poupanca
void ContaPoupanca::atualiza(double taxa) {
     double saldoParcial = Conta::getSaldo();
     Conta::deposita(saldoParcial * (3 * taxa));
}
