#include <iostream>

using namespace std;

#include "Usuario.h"
#include "Aluno.h"
#include "Funcionario.h"

#include "Obra.h"
#include "Periodico.h"
#include "Academico.h"
#include "Livro.h"

int mainBusca() {
    // Aluno
    //Aluno al1("rafael", "rua tal", 1011, "jd brasil", 1, 123);

    // Testando a busca
    Aluno *al[3];

    al[0] = new Aluno al01("rafael01", "rua tal", 1011, "jd brasil", 1, 123);
    // al[1] = new Aluno al02("rafael02", "rua tal", 1011, "jd brasil", 1, 123);
    // al[2] = new Aluno al03("rafael03", "rua tal", 1011, "jd brasil", 1, 123);

    return 0;
}