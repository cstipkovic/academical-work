#include <iostream>

using namespace std;

class Conta {
private:
	int numeroConta;
	string nomeTitular;
	float saldo;
public:
	Conta(int, string, float);
	bool deposita(float);
	void consulta();
	void saque(float);
};