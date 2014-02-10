#include <iostream>
#include <string>

#include "ContaCorrente.h"

using namespace std;

int main() {
    ContaCorrente c1("Jose");
    ContaCorrente c2("Marcio");
    ContaCorrente c3("Lidiany");

    c1.deposita(1000);
    c2.deposita(100);
    c3.deposita(10);


    cout << "Sacar 100.01 de " << c2.getNomeCorrentista() << endl;
    if (!c2.saca(100.01)) {
    	cout << c2.getNomeCorrentista() << ": saldo insuficiente" << endl;
    }
    
    cout << endl;

    cout << "Sacar 5 de " << c3.getNomeCorrentista() << endl;
    if (!c3.saca(5)) {
    	cout << c3.getNomeCorrentista() << ": saldo insuficiente" << endl;
    }

    cout << endl;

    cout << c1.getNomeCorrentista() << ": saldo " << c1.getSaldo() << endl;
    cout << c2.getNomeCorrentista() << ": saldo " << c2.getSaldo() << endl;
    cout << c3.getNomeCorrentista() << ": saldo " << c3.getSaldo() << endl;

    return 0;
}
