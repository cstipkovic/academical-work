package PlanoDeSaude;

public class Paciente {
    
    private String nome;
    private int idade;

    Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return ("Paciente: " + this.nome + " - Idade: " + this.idade);
    }    
}
