#include <iostream>

#include "ContaCorrente.h"
#include "ContaPoupanca.h"

using namespace std;

int main() {
    Conta c;
    ContaCorrente cc;
    ContaPoupanca cp;
    c.deposita(1000);
    cc.deposita(1000);
    cp.deposita(1000);
    c.atualiza(0.01);
    cc.atualiza(0.01);
    cp.atualiza(0.01);
    cout << c.getSaldo() << endl;
    cout <<  cc.getSaldo() << endl;
    cout << cp.getSaldo() << endl;

    return 0;
}
