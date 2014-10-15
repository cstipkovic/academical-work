package br.mackenzie.fci.lp1;

import java.util.Scanner;

public class TestaFalar4 {
    
    public static void main (String args[]) {
        
        Aluno a = new Aluno();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a frase que aluno ira pronunciar: ");
        a.falar(entrada.nextLine());
    }
}
