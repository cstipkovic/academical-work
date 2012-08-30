#include <iostream>
#include "Carro.h"

using namespace std;

int main() {
    Carro C1, C2;

    C1.AbastecerCarro(20);
    C2.AbastecerCarro(30);

    C1.MoverCarro(200);
    C2.MoverCarro(400);


    // Carro 1
    cout << "Carro 1"
    cout << "-------"
    cout << "Percorreu: " << C1.GetKilometragem();
    cout << "Combustivel restante: " << C1.GetQtCombustivelNoTanque();

    cout << endl;

    // Carro 2
    cout << "Carro 2"
    cout << "-------"
    cout << "Percorreu: " << C2.GetKilometragem();
    cout << "Combustivel restante: " << C2.GetQtCombustivelNoTanque();

    return 0;
}