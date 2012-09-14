#include <iostream>

using namespace std;

#include "Obra.h"

class Periodico : public Obra {
private:
    string ISSN;

public:
    Periodico(string, string, string, string, string, int, string);
};