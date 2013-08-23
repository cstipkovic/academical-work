#include <iostream>

#include "Conta.h"

using namespace std;

int main() {
    Conta c;

    c.deposita(1000);

    c.atualiza(0.01);

    cout << c.getSaldo() << endl;
    cout <<  cc.getSaldo() << endl;
    cout << cp.getSaldo() << endl;

    return 0;
}
