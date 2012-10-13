#include "Conta.h"
#include "ContaPoupanca.h"

// Conta Poupanca
void ContaPoupanca::atualiza(double taxa) {
    double saldoParcial = getSaldo();
    deposita(saldoParcial * (3 * taxa));
}
