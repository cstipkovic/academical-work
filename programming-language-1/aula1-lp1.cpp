#include <string>
#include <iostream>

using namespace std;

class Pessoa { // private implicito
	string Nome_;
	long int AMD_; // AAAAMMDD
	string Ender_; // endereço

	public:
		Pessoa() {;} // Construtor Padrao
		Pessoa(string N, long Nasc, string E) {
			Nome_ = N; AMD_ = Nasc; Ender_  = E;
		}
		friend ostream & operator << (ostream & S, Pessoa P) {
			S << P.Nome_ << "\t" << P.AMD_ << "\t" << P.Ender_ << endl;
			return S;
		}
		short Idade() {
			long Hoje = 20120224; // usar o ctime
			short AN, MDN, Anos;
			AN = AMD_ / 10000;
			MDN = AMD_ % 10000;
			Anos = Hoje / 10000 - AN;
			if (Hoje % 10000 >= MDN){
				return Anos + 1;
			}
		}
};

int main(string Nome, string End, long Nasc) {
	for(;;) {
		cout << "Digite Nome, enter, Nasc, enter, Ender" << endl;
		cin >> Nome; cin >> Nasc; cin >> End;
		if (Nome == "fim") {
			Pessoa P1(Nome, Nasc, End);
			short Id = P1.Idade();
			cout << P1 << "\t" << Id << "0 Aninhos" << endl;
		}
	}
	return 0;
}