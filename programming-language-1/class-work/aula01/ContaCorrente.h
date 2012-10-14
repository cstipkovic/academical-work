/*
 * ContaCorrente.h
 */

#ifndef CONTACORRENTE_H_
#define CONTACORRENTE_H_

class ContaCorrente {
private:
	int idConta;
	float saldo;
	string idCorrentista;
public:
	ContaCorrente(int, float);
	void depositaValor(float);
	void sacarValor(float);
	float getSaldo();
};

#endif /* CONTACORRENTE_H_ */
