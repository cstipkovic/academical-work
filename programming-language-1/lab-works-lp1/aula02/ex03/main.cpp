#include <iostream>
#include "Carro.h"

using namespace std;

int main() {
    Carro C1, C2;
    
    C1.abastecerCarro(20);
    C2.abastecerCarro(30);
    
    C1.moverCarro(200);
    C2.moverCarro(400);
    
    
#   Carro 1
    cout << "Carro 1"
    cout << "-------"
    cout << "Percorreu: " << C1.getKilometragem();
    cout << "Combustivel restante: " << C1.getQtCombustivelNoTanque();
    
    cout << endl;
    
#   Carro 2
    cout << "Carro 2"
    cout << "-------"
    cout << "Percorreu: " << C2.getKilometragem();
    cout << "Combustivel restante: " << C2.getQtCombustivelNoTanque();
    
    return 0;
}