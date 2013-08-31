#include <iostream>

using namespace std;

#ifndef CONTA_H
#define CONTA_H

class Conta : public Banco {
    public:
        Conta(string);
        double getSaldo();
        void deposita(double);
        bool saca(double);
        
    private:
        double saldo;
};

#endif // CONTA_H
