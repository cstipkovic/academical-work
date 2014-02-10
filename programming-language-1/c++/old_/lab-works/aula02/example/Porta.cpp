#include "Porta.h"

void Porta::abre() {
	flag = true;
}

void Porta::fecha() {
	flag = false;
}

bool Porta::verificaStatusPorta() {
	if (flag) {
		return true;
	} else {
		return false;
	}
}