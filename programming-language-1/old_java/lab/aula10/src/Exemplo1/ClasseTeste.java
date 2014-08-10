package Exemplo1;

import java.util.Scanner;

public class ClasseTeste {
    String nome;
    int idade;
    
    Scanner entrada = new Scanner(System.in);
    
    void cadastro() {
        System.out.println("Qual é o nome da pessoa?");
        nome = entrada.next();
        
        System.out.println("Qual é a idade da pessoa?");
        idade = entrada.nextInt();
    }
    
    void mostrar() {
        System.out.println("===============");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
