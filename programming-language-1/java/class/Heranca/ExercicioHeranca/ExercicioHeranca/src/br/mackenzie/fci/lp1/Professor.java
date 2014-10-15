package br.mackenzie.fci.lp1;

public class Professor extends Pessoa {
    
    int grupoDocente;
    int escalaoProfessor;
    
    public Professor() {}
    
    public Professor(String nome, char sexo, int idade, int grupoDocente, int escalaoProfessor) {
        super(nome, sexo, idade);
        this.grupoDocente = grupoDocente;
        this.escalaoProfessor = escalaoProfessor;
    }

    public int getGrupoDocente() {
        return grupoDocente;
    }

    public int getEscalaoProfessor() {
        return escalaoProfessor;
    }
    
    @Override
    public void falar() {
        System.out.println("eu sou um Professor");
        super.falar();  
    }
}
