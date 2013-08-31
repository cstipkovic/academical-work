#include <cstdlib>
#include <iostream>

#include "classes/Banco/Banco.h"

/*
 * 
 */
int main(int argc, char** argv) {
    
    Banco b;
    
    b.setBancoNome("teste");
    
    cout << b.getBancoNome() << endl;

    return 0;
}

