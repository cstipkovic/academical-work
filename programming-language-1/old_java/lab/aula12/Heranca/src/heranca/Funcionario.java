package heranca;

public class Funcionario {
    private String nome;
    private double salario;
    
    public void setNome(String n_nome) {
        nome = n_nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setSalario(double n_salario) {
        salario = n_salario;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public double calculaBonificacao() {
        return this.salario * 0.1;
    }
    
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Bonificacao: " + this.calculaBonificacao());
    }
}
