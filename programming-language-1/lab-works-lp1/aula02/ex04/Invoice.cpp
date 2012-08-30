#include <iostream>
#include "Invoice.h"

using namespace std;

Invoice::Invoice() {
	ID = 0;
	qtItem = 0;
	preco = 0.0;
	descricao = "";
}

int Invoice::GetID() {
	return ID;
}

void Invoice::SetID(int novoID) {
	ID = novoID;
}

int Invoice::GetQtItem() {
	return qtItem;
}

void Invoice::SetQtItem(int novaQtItem) {
	if(novaQtItem > 0) {
		qtItem = novaQtItem;
	} else {
		qtItem = 0;
	}
}

float Invoice::GetPreco() {
	return preco;
}

void Invoice::SetPreco(float novoPreco) {
	if(novoPreco > 0.0) {
		preco = novoPreco;
	} else {
		preco = 0.0;
	}
}

string Invoice::GetDescricao() {
	return descricao;
}

void Invoice::SetDescricao(string novaDescricao) {
	descricao = novaDescricao;
}

double Invoice::GetInvoiceAmount() {
	return (GetPreco() * GetQtItem());
}