/*
 * ContaCorrente.h
 */

#ifndef CONTACORRENTE_H_
#define CONTACORRENTE_H_

class ContaCorrente {
private:
	int idConta, idCorrentista;;
	float saldo;
public:
	ContaCorrente(int, float, int);
	bool depositaValor(float);
	bool sacaValor(float);
	float getSaldo();
};

#endif /* CONTACORRENTE_H_ */
