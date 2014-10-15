package br.mackenzie.fci.lp1;

import java.util.Scanner;

public class TestaFalar3 {
    
    public static void main (String args[]) {
        
        char escolha;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escolha p ou a: ");
        escolha = entrada.next().toLowerCase().charAt(0);
        
        String nome;
        char sexo;
        int idade;
        
        switch(escolha) {
            case 'p':
                System.out.println("Informe o nome:");
                nome = entrada.next();
                
                System.out.println("Infome o sexo");
                sexo = entrada.next().charAt(0);
                
                System.out.println("informe idade");
                idade = entrada.nextInt();
                
                Professor p = new Professor();
                p.setNome(nome);
                p.setSexo(sexo);
                p.setIdade(idade);
                
                System.out.println("Nome: " + p.getNome());
                System.out.println("Sexo: " + p.getSexo());
                System.out.println("Idade: " + p.getIdade());
                p.falar();
                break;
                
            case 'a':
                System.out.println("Informe o nome:");
                nome = entrada.next();
                
                System.out.println("Infome o sexo");
                sexo = entrada.next().charAt(0);
                
                System.out.println("informe idade");
                idade = entrada.nextInt();
                
                Aluno a = new Aluno();
                a.setNome(nome);
                a.setSexo(sexo);
                a.setIdade(idade);
                
                System.out.println("Nome: " + a.getNome());
                System.out.println("Sexo: " + a.getSexo());
                System.out.println("Idade: " + a.getIdade());
                a.falar();
                break;
        }
    }
}
