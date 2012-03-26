// TODO Fazer a inclusão da função Aprovado() em Aluno e Disciplina
/*
   bool Aprovado() {
   if (Disciplina.> 25.0) return false;
   if (Media() < 6.0) return false;
   return true;
   }
   */
/*  Created by Anjuta version 1.2.4a
 *  This file will not be overwritten */
#include <stdio.h>
#include <iostream>
#include <string>
#include <deque>
#include <vector>
#include <algorithm>
using namespace std;
class ProfessorAluno {
  private:  // encapsulado. A palavra private é opcional para classe
    long Ident, AnoMesDia;
    string Nome, Ender;
    char Sexo;

  public:
    ProfessorAluno() { } // construtor padrão
    ProfessorAluno(long Id, string No, long AMD, char S, string E) {
      Ident = Id;
      Nome = No;
      AnoMesDia = AMD;
      Sexo = S;
      Ender = E;
    } // construtor normal
    // funções da classe
    // ...
    void AltEnder(string NE) { Ender = NE; }
    friend ostream& operator << (ostream& s, const ProfessorAluno PA) {
      s << endl <<  "Identificação: " << PA.Ident <<  "Nome: " << PA.Nome /* demais atributos com legenda*/;
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
  return (pa1.Nome < pa2.Nome);
}
// classe Disciplina - necessária em Aluno

float Vet[] = {0.0, 0.0, 0.0, 0.0 ,0.0}; // para iniciar o vetor de notas
class Disciplina {
  private:
    long Codigo;
    string Nome;
    float PercFaltas;
    vector<float> Notas;

  public:
    Disciplina() {}
    Disciplina(long Id, string Nom, float PF=0.0) :
      Codigo(Id), Nome(Nom), PercFaltas(PF) { Notas.insert(Notas.begin(),Vet,Vet+5); }
    float PegaNota(short Pos) { return Notas[Pos]; }
    void AltNota(short Pos, float V) { Notas[Pos] = V; }
    // ...
    float PegaPF() {return PercFaltas;}
    void AltPF(float PF) {PercFaltas=PF;}
    long PegaCod() {return Codigo;}
    bool Aprovado();  // a codificar, critério Mackenzie
    float Media();

    friend ostream& operator << (ostream& s, const Disciplina &D) {
      s << endl << "Disc:" << D.Nome << " " << D.Codigo << " " << D.PercFaltas;
      return s;
    }

    bool operator == (const Disciplina &D2);  // necessário para o find
};
bool Disciplina :: operator == (const Disciplina &D2) {
  return Codigo == D2.Codigo;
}
// N1 é média ponderada - neste semestre mudou
// 60% N1 + 40%  N2
float Disciplina :: Media() {   // há um erro, a corrigir
  short Pesos[4] = {2,2,3,3};
  float Total = 0;
  short Conta;
  for (Conta=0; Conta < 4; Conta++) {
    Total += Notas[Conta] * Pesos[Conta];
  }
  float Media = (5 * (Total/10) + 5 * Notas[4]) / 10.0;
  return Media;
}
class Aluno : public ProfessorAluno {
  private:
    string Curso;
    bool Matriculado;
  public:
    Aluno() { }
    Aluno(long Id, string No, long AMD, char S, string E, string Cur, bool Matr) :
      ProfessorAluno (Id, No, AMD, S, E), Curso(Cur), Matriculado(Matr){ }
    friend ostream& operator<< (ostream& s, const Aluno A) {
      s << endl <<  ProfessorAluno(A) << " Curso: " << A.Curso /* demais atributos com legenda*/;
      return s;
    }
    void AltNota(Disciplina D, short Pos, float Nota);
    // outras funções
    float Media(Disciplina Dis);

    vector <Disciplina> Disciplinas;  // vetor com disciplinas
};

// a simplicidade do find (um dos algoritmos do STL ajuda muito)
void Aluno :: AltNota(Disciplina Dis, short Pos, float Not) {
  vector<Disciplina> :: iterator PD;
  PD = find(Disciplinas.begin(), Disciplinas.end(), Dis);
  if (PD != Disciplinas.end()) PD->AltNota(Pos, Not);
  return;
}

/*****    // versão anterior, de AltNota, com array ao estilo C

  void Aluno :: AltNota(long CoDis, short Pos, float Not) {
  short Conta;
  bool Achou = false;
  for (Conta=0; Conta<8; Conta++) {
  Dis = Disciplinas [Conta];
  if(Dis.PegaCod() == CoDis) {
  Achou = true;
  break;
  } // fim if
  } // fim for
  if (Achou) Disciplinas[Conta].AltNota(Pos, Not);
  return;
  }
 ************/
float Aluno :: Media(Disciplina D) {
  vector<Disciplina> :: iterator PD;
  PD = find(Disciplinas.begin(), Disciplinas.end(), D);
  if (PD == Disciplinas.end() ) {
    cout << " Não achou disc: " << D;
    return 0;
  } else
    return PD->Media();
}

int main() {
  // cria algumas  pessoas do tipo ProfessorAluno
  // é necessário completar os argumentos, faça-o, por gentileza
  ProfessorAluno p1(1, "Carlos Macedo", 19781123, 'M', "Consolação,896");
  ProfessorAluno p2(12, "Carlos Silva", 19781123, 'M', "Consolação,896");
  ProfessorAluno p3(4, "José Ribeiro", 19781123, 'M', "Consolação,896");

  // insere algumas pessoas do tipo ProfessorAluno na coleção Col
  deque<ProfessorAluno> Col;
  Col.push_back(p1);
  Col.push_back(p2);
  Col.push_back(p3);
  // exibe os elementos
  cout << "deque antes de sort():" << endl;
  // pos opera como um ponteiro que percorre Col
  deque<ProfessorAluno> :: iterator pos;
  for (pos = Col.begin(); pos != Col.end(); ++pos) {
    cout << *pos << endl;
  }
  // Ordena os elementos alfabeticamente
  sort(Col.begin(),Col.end(), // faixa
      CritPrAl); // criterio de ordenação
  // print elements
  cout << "deque após o sort():" << endl;
  for (pos = Col.begin(); pos != Col.end(); ++pos) {
    cout << *pos << endl;
  }
  // ****************  Testes da classe Disciplina - a melhorar
  // incluir testes aqui
  Disciplina D1(100, "BD", 0.);
  Disciplina D2(200, "PE I", 0.);
  // ******** Teste da classe  Aluno - a melhorar
  Aluno A1(10, "Alfredo Soares", 19820514, 'M', "Freg do Ó", "Sist Inf.", true);
  Aluno A2(20, "Ricardo Pimentel", 19810601, 'M', "Aricanduva", "Sist Inf.", true);
  A1.Disciplinas.push_back(D1);
  A1.Disciplinas.push_back(D2);
  A1.AltNota(D2, 0, 7.8);  // Notas[0]= 7.8 para a disciplina de código 200
  A1.AltNota(D2, 1, 7.5);
  A1.AltNota(D2, 2, 5.8);
  A1.AltNota(D2, 3, 8.5);
  A1.AltNota(D2, 4, 6.3);
  float Med = A1.Media(D2);
  cout << endl << "Al: "<< A1 << " Media de " << D2 << " é: " << Med << endl;
  //system("pause");
  return 0;
}

/**************
  Exercício de (15 e 16; e 22 e 23) de março de 2012
  1 - estudar as classes Disciplina e Aluno, usando vector

  2 - entender o funcionamento do algoritmo find, do STL  (ele procura um objeto
  igual ao dado ->  implica o operador de comparação ==
  Se achar retorna o iterador apontando para o elemento encontrado
  senão o iterador estará apontando para o final da coleção
  3 - corrigir a função de média de disciplina, que está errada
  e experimentar com três disciplinas
  Você pode fazer a entrada de todas as notas de uma única vez (são cinco)
  float N1, N2, N3, N4, N5;
  cin >> N1 >> N2 >> N3 >> N4 >> N5
  veja que o formato é do tipo 5.7 para cada nota (ao final, Enter)
  4 - A partir do resultado de Media e usando a percentagem de faltas exiba mensagem
  de aprovado ou reprovado, juntamente com os dados do aluno, a percentagem
  de faltas e a nota do semestre. Para tal use a Regra Mackenzie, abaixo:
  - - - Percentagem de faltas  deve ficar em qual classe?
  Regra - se percentagem de faltas > 25.0% -> reprovado por faltas
  se 25.0% > percentagem de faltas > 20.0% e Nota < 7.0 -> reprovado
  se percentagem de faltas < 20.0% e Nota < 6.0 -> reprovado
  senao aprovado com percentagem de faltas tal e Nota tal

  Escolha uma das classes para pôr a função
  bool Aprovado(float Media, float PF);  // pode ficar em Disciplina ou
// em Aluno

Observação: Este exercício será usado para cômputo da Nota Semestral de laboratório
de LOO (já representa um bom trecho do conhecimento de LOO)
 ************/

