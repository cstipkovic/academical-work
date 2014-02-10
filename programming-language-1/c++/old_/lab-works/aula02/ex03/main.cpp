#include <iostream>
#include "Carro.h"

using namespace std;

int main() {
    Carro C1, C2;

    // Carro 1
    cout << "Carro 1" << endl;
    cout << "-------" << endl;
    cout << "Status: ";
    if (C1.AbastecerCarro(20)) {
        cout << "Abastecido";
    } else {
        cout << "O Tanque não comporta mais que 50 Litros";
    }
    cout << endl;
    C1.MoverCarro(200);
    cout << "Percorreu: " << C1.GetKilometragem() << " KM" << endl;
    cout << "Combustivel restante: " << C1.GetCombustivelNoTanque() << " Litros" << endl;
    cout << endl;

    // Carro 2
    cout << "Carro 2" << endl;
    cout << "-------" << endl;
    cout << "Status: ";
    if (C2.AbastecerCarro(30)) {
        cout << "Abastecido";
    } else {
        cout << "O Tanque não comporta mais que 50 Litros";
    }
    cout << endl;
    C2.MoverCarro(400);
    cout << "Percorreu: " << C2.GetKilometragem() << " KM" << endl;
    cout << "Combustivel restante: " << C2.GetCombustivelNoTanque() << " Litros" << endl;
    cout << endl;
    
    return 0;
}
