#include <iostream>

using namespace std;

class Academico : public Obra {
private:
    string dptPesquisa;

public:
    Academico(string, string, string, string, string, int, string);
    string getTipo();
    string getTitulo();
    string getAutor();
    string getLingua();
    string getEditora();
    int getAnoEdicao();
    string getDptPesquisa();
};