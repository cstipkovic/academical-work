#include <iostream>

using namespace std;

class Livro : public Obra {
private:
    string ISBN;

public:
    Livro(string, string, string, string, string, int, string);
};