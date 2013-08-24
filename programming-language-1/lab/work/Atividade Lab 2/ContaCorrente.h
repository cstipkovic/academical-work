#include <string>

using namespace std;

// Conta
class ContaCorrente {
    private:
        double saldo;
     	string nomeCorrentista;

    public:
        ContaCorrente(string);
        double getSaldo();
        string getNomeCorrentista();
        void deposita(double);
        bool saca(double);
};
