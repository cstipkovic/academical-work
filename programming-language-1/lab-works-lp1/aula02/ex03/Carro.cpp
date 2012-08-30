#include <iostream>
#include "Carro.h"

using namespace std;

void Carro::AbastecerCarro(qtCombustivel) {
    if (qtCombustivel <= 50 || (qtCombustivel + qtGasolinaNoTanque) <= 50) {
        qtGasolinaNoTanque = qtCombustivel;
        cout << "Abastecido!";
    } else {
        cout << "Quantidade de combustivel é maior que a que o tanque suporta.";
    }
}

void Carro::MoverCarro(distancia) {

}

int Carro::GetQtCombustivelNoTanque() {
    return qtGasolinaNoTanque;
}

double Carro::GetKilometragem() {
    return kilometragem;
}
