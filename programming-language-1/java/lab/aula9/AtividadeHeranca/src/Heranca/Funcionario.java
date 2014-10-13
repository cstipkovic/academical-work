package Heranca;

public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calculaBonificacao() {
        return this.salario * 0.1;
    }
    
    public void mostraDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Bonificacao: " + this.calculaBonificacao());
    }
}
