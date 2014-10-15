package br.mackenzie.fci.lp1;

public class Pessoa {
    
    String nome;
    char sexo;
    int idade;
    
    public Pessoa() {}
    
    public Pessoa(String nome, char sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    
    public Pessoa(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void falar() {
        System.out.println("Eu sou uma pessoa");
    }
    
    public void falar(String frase) {
        System.out.print(frase);
    }
}
