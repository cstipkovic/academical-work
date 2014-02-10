// STL deque guarda objetos de classe definida pelo usuário
//  Opera como vector mas é eficiente para inserção em ambas as extremidades

#include <iostream>
#include <string>
#include <deque>
#include <algorithm>
using namespace std;
    // digite o código discutido em aula para ProfessorAluno
class ProfessorAluno {
  private:  // encapsulado. A palavra private é opcional para classe

  
  public:
    ProfessorAluno() {     }   // construtor padrão
    ProfessorAluno(/*parâmetros a informar - os de private, acima*/) {}
     // funções da classe	
    // ...
	friend ostream& operator<< (ostream& s, const ProfessorAluno PA) {
       s << endl <<  "Nome: " << PA.Nome /* demais atributos com legenda*/;
 	  return s;
    }

	friend bool CritPrAl (const ProfessorAluno& pa1, const ProfessorAluno& pa2);
};   // encerra a classe ProfessorAluno


/*** 
     CritPrAl será a função de comparação, a ser usada no sort 
       para ordenar professores e alunos em ordem alfabética. Podem existir 
       diversas funções desse tipo, para ordenações por outros campos. 
        
******/

 bool CritPrAl (const ProfessorAluno& pa1, const ProfessorAluno& pa2) {
    /* uma pessoa está em ordem alfabética comparada a outra se: (critério inglês)
     * - o sobrenome estiver em ordem alfabética
     * - se tiverem o mesmo sobrenome, o nome decide
     */
    return (pa1.Nome < pa2.Nome);
   }

int main() {
    // cria algumas  pessoas do tipo ProfessorAluno 
         // é necessário completar os argumentos, faça-o, por gentileza	
    ProfessorAluno p1("Carlos Macedo");
    ProfessorAluno p2("Carlos Silva");
    ProfessorAluno p3("José Ribeiro");
    ProfessorAluno p4("Marcos Andrade");
    ProfessorAluno p5("Carlos Andrade");
    ProfessorAluno p6("Lúcio Souza");
    ProfessorAluno p7("Marli Costa");
    
    // insere algumas pessoas na coleção Col
    deque<ProfessorAluno> Col;
    Col.push_back(p1);
    Col.push_back(p2);
    Col.push_back(p3);
    Col.push_front(p4);  // deque é bom na inserção em ambos os extremos
    Col.push_front(p5);  // e possui push_back e push_front
    Col.push_back(p6);
    Col.push_back(p7);

    // exibe os elementos
    cout << "deque antes de sort():" << endl;
    deque<ProfessorAluno>::iterator pos;  // pos opera como um ponteiro que percorre Col
    for (pos = Col.begin(); pos != Col.end(); ++pos) {
        cout << *pos << endl;
      }  

    // Ordena os elementos
    sort(Col.begin(),Col.end(),    // faixa
         CritPesAlfa);       // criterio de ordenação

    // print elements
    cout << "deque após o sort():" << endl;
    for (pos = Col.begin(); pos != Col.end(); ++pos) {
        cout << *pos << endl;
    }
	return 0;
}
  
/**************
    Exercício de (8 a 9) de março de 2012

   1 - rodar o código acima, após completar os dados. 

   2 - escrever uma função de comparação por Ident (Código de Matrícula ou DRT) 
         e testar o funcionamento (incluir linhas antes do return vendo que reordena
         Col


************/
