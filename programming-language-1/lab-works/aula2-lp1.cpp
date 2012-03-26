// Array x vector STL
// Calcular a media dos elementos

#include <string>
#include <iostream>
#include <vector>

using namespace	std;

short Idades[] = {13, 27, 38, 31, 45, 32, 18, 16};

// short Media(short *Mrr, short Tam);
short Media(const vector<short> & v);

short Total = 0;

int main() {
	short Conta = 0;
	vector<short> Ids;

	for (; Conta < 8; Conta++) {
		Ids.push_back(Idades[Conta]);
	}

	short Med = Media(Ids);
	cout << "A média das idades é:0" << Med << endl;
	Idades[2] = Idades[3];

	return 0;
}

short Media(const vector<short> & Id) {
	short Conta = 0;
	for (; Conta < Id.size(); Conta++) {
		Total += Id[Conta];
	}

	short Med = Total;
	return Med;
}