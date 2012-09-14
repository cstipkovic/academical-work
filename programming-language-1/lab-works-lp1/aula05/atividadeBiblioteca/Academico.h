#include <iostream>

using namespace std;

#include "Obra.h"

class Academico : public Obra {
private:
    string dptPesquisa;

public:
    Academico(string, string, string, string, string, int, string);
};