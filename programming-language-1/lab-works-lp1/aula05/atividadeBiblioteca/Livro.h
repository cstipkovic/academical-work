#include <iostream>

using namespace std;

#include "Obra.h"

class Livro : public Obra {
private:
    string ISBN;

public:
    Livro(string, string, string, string, string, int, string);
};