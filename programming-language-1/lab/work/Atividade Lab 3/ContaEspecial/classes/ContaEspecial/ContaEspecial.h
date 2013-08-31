#include "../Conta/Conta.h"

#include "string"

using namespace std;

#ifndef CONTAESPECIAL_H
#define CONTAESPECIAL_H

class ContaEspecial : public Conta {
    public:
		ContaEspecial(string, double, double);
        
    private:
        double limite, taxaJuros;
};

#endif // CONTAESPECIAL_H
