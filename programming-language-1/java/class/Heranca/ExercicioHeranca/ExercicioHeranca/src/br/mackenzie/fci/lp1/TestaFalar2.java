package br.mackenzie.fci.lp1;

import java.util.Scanner;

public class TestaFalar2 {
    
    public static void main (String args[]) {
        
        char escolha;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escolha p ou a: ");
        escolha = entrada.next().charAt(0);
        
        switch(escolha) {
            case 'p':
                Professor p = new Professor("Helena Lopes", 'f', 40, 550, 2);
                System.out.println("Nome: " + p.getNome());
                System.out.println("Sexo: " + p.getSexo());
                System.out.println("Idade: " + p.getIdade());
                System.out.println("Grupo Docente: " + p.getGrupoDocente());
                System.out.println("Escalao professor: " + p.getEscalaoProfessor());
                p.falar();
                break;
                
            case 'a':
                Aluno a = new Aluno("Pedro Martins", 'm', 15, 23, "A");
                System.out.println("Nome: " + a.getNome());
                System.out.println("Sexo: " + a.getSexo());
                System.out.println("Idade: " + a.getIdade());
                System.out.println("Numero: " + a.getNumero());
                System.out.println("Turma: " + a.getTurma());
                a.falar();
                break;
        }
    }
}
