#include <iostream>

using namespace std;

class Aluno : public Usuario {
private:
    int RA;

public:
    Aluno(string, string, int, string, int, int);
};