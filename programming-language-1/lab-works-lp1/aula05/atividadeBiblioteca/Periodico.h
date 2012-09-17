#include <iostream>

using namespace std;

class Periodico : public Obra {
private:
    string ISSN;

public:
    Periodico(string, string, string, string, string, int, string);
    string getTipo();
    string getTitulo();
    string getAutor();
    string getLingua();
    string getEditora();
    int getAnoEdicao();
    string getISSN();
};