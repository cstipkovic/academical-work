#include <iostream>

#include "../Conta/Conta.h"

using namespace std;

#ifndef CONTAESPECIAL_H
#define CONTAESPECIAL_H

class ContaEspecial : public Conta {
    public:
		ContaEspecial (double, double);

		double getLimite ();
		double getSaldoDisponivel ();

		bool saca (double);
        
    private:
        double limite, taxaJuros;
};

#endif // CONTAESPECIAL_H
