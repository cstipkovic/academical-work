#include <cstdlib>
#include <iostream>

using namespace std;

//programa principal 
int main(int argc, char *argv[]){
    
    char a;    
    
    cout<<"Digite a letra a ou a letra b, e tecle ENTER >>>  ";

    // entrada de dados    
    cin >> a; //ler a variavel "a"
    
    cout<<endl<<endl;//pulando 2 linhas
    
    
    if(a == 'a') 
      cout << "Vc digitou a letra 'a'" << endl;
    
    if(a == 'b')
      cout << "Vc digitou a letra 'b'"<< endl;
    
    if(a != 'a'  && a != 'b') 
      cout << "Nem a nem b ..." << endl;

   return EXIT_SUCCESS;

}
