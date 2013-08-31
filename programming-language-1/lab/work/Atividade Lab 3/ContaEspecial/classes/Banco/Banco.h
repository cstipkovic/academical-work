#include <iostream>

using namespace std;

#ifndef BANCO_H
#define BANCO_H

class Banco {
    public:
        void setBancoNome(string);
        string getBancoNome();

    private:
        string nome;
};

#endif // BANCO_H
