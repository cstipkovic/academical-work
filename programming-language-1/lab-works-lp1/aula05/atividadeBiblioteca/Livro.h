#include <iostream>

using namespace std;

class Livro : public Obra {
private:
    int ISBN;

public:
    Livro(string, string, string, string, string, int, int);
    string getTipo();
    string getTitulo();
    string getAutor();
    string getLingua();
    string getEditora();
    int getAnoEdicao();
    int getISBN();
};