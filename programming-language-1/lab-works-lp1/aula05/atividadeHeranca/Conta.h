// Conta
class Conta {
    private:
        double saldo;
    public:
        Conta();
        double getSaldo();
        void deposita(double);
        bool SacarConta(double);
        void atualiza(double);
};
