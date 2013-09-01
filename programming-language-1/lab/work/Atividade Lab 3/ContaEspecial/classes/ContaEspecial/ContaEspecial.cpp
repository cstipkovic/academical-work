#include "ContaEspecial.h"

ContaEspecial::ContaEspecial (double n_limite, double n_taxaJuros) {
    limite = n_limite;
    taxaJuros = n_taxaJuros;
}

double ContaEspecial::getLimite () {
	return limite;
}

double ContaEspecial::getSaldoDisponivel () {
	return (getSaldo() + getLimite());
}

bool ContaEspecial::saca (double valorSacar) {
	if(getSaldoDisponivel() >= valorSacar) {
        setSaldo(getSaldo() - valorSacar);
        return true;
    } else {
        return false;
    }
}