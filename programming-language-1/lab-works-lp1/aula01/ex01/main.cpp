#include <cstdlib>
#include <iostream>

using namespace std;

// Programa principal

int main(int argc, char *argv[]) {
  int a;

  cout  << "Digite o numero 1 ou o numero 2, e prima ENTER >>>  ";

  // Entrada de Dados
  cin >> a; // ler a variável 'a'

  cout << endl << endl; // pulando 2 linhas


  if (a == 1) {
    cout << "Vc digitou o numero UM" << endl;
  }

  if (a == 2) {
    cout << "Vc digitou o numero DOIS"<< endl;
  }

  if (a != 1 && a != 2) {
    cout << "falei para digitar 1 ou 2?" << endl;
  }

  return EXIT_SUCCESS;
}
