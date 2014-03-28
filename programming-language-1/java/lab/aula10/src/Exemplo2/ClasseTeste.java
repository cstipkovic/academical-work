package Exemplo2;

import java.util.Scanner;

public class ClasseTeste {
    private String nome; // atributos privados
    private int idade;
    
    Scanner entrada = new Scanner(System.in);
    
    void cadastro() {
        System.out.println("Qual é o nome da pessoa?");
        nome = entrada.next();
        
        System.out.println("Qual é a idade da pessoa?");
        idade = entrada.nextInt();
    }
    
    void mostrar() {
        System.out.println("===================");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
    
    // método para obter o nome
    public String getNome() {
        return nome;
    }
    
    // método para obter idade
    public int getIdade() {
        return idade;
    }
    
    // método para inserir o nome
    public String setNome() {
        System.out.println("Qual é o nome da pessoa?");
        nome = entrada.next();
        
        return nome;
    }
    
    // método para alterar o idade
    public int mudaIdade() {
        return (idade + 1);
    }
}
