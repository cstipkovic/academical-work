package br.mackenzie.fci.lp1;

public class Aluno extends Pessoa {
    
    int numero;
    String turma;
    
    public Aluno() {}
    
    public Aluno(String nome, char sexo, int idade, int numero, String turma) {
        super(nome, sexo, idade);
        this.numero = numero;
        this.turma = turma;
    }

    public int getNumero() {
        return numero;
    }

    public String getTurma() {
        return turma;
    }
    
    @Override
    public void falar() {
        System.out.println("eu sou um Aluno");
        super.falar();
    }
}
