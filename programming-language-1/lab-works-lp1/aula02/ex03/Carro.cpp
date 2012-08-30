#include "Carro.h"

void Carro::abastecerCarro(qtCombustivel) {
    if (qtCombustivel <= 50 || (qtCombustivel + qtGasolinaNoTanque) <= 50) {
        qtGasolinaNoTanque = qtCombustivel;
        cout << "Abastecido!";
    } else {
        cout << "Quantidade de combustivel é maior que a que o tanque suporta.";
    }
}

void Carro::moverCarro(distancia) {
    
}

int Carro:LgetQtCombustivelNoTanque() {
    return qtGasolinaNoTanque;
}

double Carro:getKilometragem() {
    return kilometragem;
}
