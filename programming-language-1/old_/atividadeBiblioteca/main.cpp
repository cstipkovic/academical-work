#include <iostream>

using namespace std;

#include "Usuario.h"
#include "Aluno.h"
#include "Funcionario.h"

#include "Obra.h"
#include "Periodico.h"
#include "Academico.h"
#include "Livro.h"

int main() {
    // Aluno
    Aluno al1("rafael", "rua tal", 1011, "jd brasil", 1, 123);
    cout << "Aluno: " << al1.getNome() << endl;
    cout << al1.getEndereco() << endl;
    cout << al1.getBairro() << endl;
    cout << al1.getNumero() << endl;
    cout << al1.getIdUsuario() << endl;
    cout << al1.getRA() << endl;

    cout << "--------------" << endl;

    // Funcionario
    Funcionario fu1("cardoso", "rua tali", 10, "jd florida", 34, 321);
    cout << "Funcionario: " << fu1.getNome() << endl;
    cout << fu1.getEndereco() << endl;
    cout << fu1.getBairro() << endl;
    cout << fu1.getNumero() << endl;
    cout << fu1.getIdUsuario() << endl;
    cout << fu1.getRF() << endl;

    cout << "--------------" << endl;

    // Periodico
    Periodico pe1("revista", "firefox magazine", "comunidade", "pt-BR", "Mozilla", 2012, "1748-7188");
    cout << "Periodico: " << pe1.getTipo() << endl;
    cout << pe1.getTitulo() << endl;
    cout << pe1.getAutor() << endl;
    cout << pe1.getLingua() << endl;
    cout << pe1.getEditora() << endl;
    cout << pe1.getAnoEdicao() << endl;
    cout << pe1.getISSN() << endl;

    cout << "--------------" << endl;

    // Academico
    Academico ac1("tese", "otimização de browser engine", "Clauber Stipkovic", "pt-BR", "Stanford/Mozilla", 2015, "Computer Science");
    cout << "Academico: " << ac1.getTipo() << endl;
    cout << ac1.getTitulo() << endl;
    cout << ac1.getAutor() << endl;
    cout << ac1.getLingua() << endl;
    cout << ac1.getEditora() << endl;
    cout << ac1.getAnoEdicao() << endl;
    cout << ac1.getDptPesquisa() << endl;

    cout << "--------------" << endl;

    // Livro
    Livro li1("tecnico", "javascript avançado", "Brendan Eich", "en-US", "Mozilla", 2012, 1565923715);
    cout << "Livro: " << li1.getTipo() << endl;
    cout << li1.getTitulo() << endl;
    cout << li1.getAutor() << endl;
    cout << li1.getLingua() << endl;
    cout << li1.getEditora() << endl;
    cout << li1.getAnoEdicao() << endl;
    cout << li1.getISBN() << endl;

    return 0;
}