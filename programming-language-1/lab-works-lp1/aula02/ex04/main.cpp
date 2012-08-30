#include <iostream>
#include "Invoice.h"

using namespace std;

int main() {
	Invoice I1;

	I1.SetID(1);
	cout << "ID: " << I1.GetID() << endl;

	I1.SetQtItem(5);
	cout << "Qt Item: " << I1.GetQtItem() << endl;

	I1.SetPreco(5.50);
	cout << "Preço Unitário: " << I1.GetPreco() << endl;

	cout << "Total: " << I1.GetInvoiceAmount() << endl;

	return 0;
}
