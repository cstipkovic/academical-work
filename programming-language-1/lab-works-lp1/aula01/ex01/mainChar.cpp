#include <cstdlib>
#include <iostream>

using namespace std;

// Programa principal

int main(int argc, char *argv[]) {
  char a;

  cout  << "Digite a letra a ou a letra b, e prima ENTER >>>  ";

  // Entrada de Dados
  cin >> a; // ler a variável 'a'

  cout << endl << endl; // pulando 2 linhas


  if (a == 'a') {
    cout << "Vc digitou a letra a" << endl;
  }

  if (a == 'b') {
    cout << "Vc digitou a letra a"<< endl;
  }

  if (a != 'a' && a != 'b') {
    cout << "falei para digitar a ou b?" << endl;
  }

  return EXIT_SUCCESS;
}
