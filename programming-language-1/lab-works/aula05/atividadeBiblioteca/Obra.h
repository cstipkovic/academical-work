#include <iostream>

using namespace std;

class Obra {
private:
    string tipo, titulo, autor, lingua, editora;
    int anoEdicao;
protected:
    void cadastra(string, string, string, string, string, int);
    string getTipo();
    string getTitulo();
    string getAutor();
    string getLingua();
    string getEditora();
    int getAnoEdicao();
};