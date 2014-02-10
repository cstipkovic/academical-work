#include <iostream>
#include "Carro.h"

using namespace std;

Carro::Carro() {
    qtCombustivelNoTanque = 0;
    kilometragem = 0;
}

int Carro::GetAutonomiaTanque() {

    int autonomiaTanqueKM;
    autonomiaTanqueKM = GetCombustivelNoTanque() * 15;

    return autonomiaTanqueKM;
}

float Carro::GetCombustivelNoTanque() {
    return qtCombustivelNoTanque;
}

void Carro::SetCombustivelNoTanque(float novaQtCombustivelNoTanque) {
    qtCombustivelNoTanque = novaQtCombustivelNoTanque;
}

int Carro::GetKilometragem() {
    return kilometragem;
}

void Carro::SetKilometragem(int novaKilometragem) {
    kilometragem = novaKilometragem;
}

bool Carro::AbastecerCarro(int qtCombustivel) {

    if ((qtCombustivel + qtCombustivelNoTanque) <= 50) {
        qtCombustivelNoTanque = qtCombustivelNoTanque + qtCombustivel;
        return true;
    } else {
        return false;
    }
}

void Carro::MoverCarro(int percorrerDistancia) {

    if (percorrerDistancia == GetAutonomiaTanque()) {
        SetKilometragem(percorrerDistancia);
        SetCombustivelNoTanque(0.0);
    } else if (percorrerDistancia < GetAutonomiaTanque()) {
        SetKilometragem(percorrerDistancia);
        SetCombustivelNoTanque((GetAutonomiaTanque() - percorrerDistancia) / 15.0);
    } else {
        SetKilometragem(GetAutonomiaTanque());
        SetCombustivelNoTanque(0.0);
    }
}
