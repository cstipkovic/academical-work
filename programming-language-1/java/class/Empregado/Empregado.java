public class Empregado {

	private String nome;
	private String cargo;
	private double salario;

	public Empregado(String novoNome, String novoCargo, double novoSalario) {
		nome = novoNome;
		cargo = novoCargo;
		salario = novoSalario
	}

	public Empregado(String novoNome, String novoCargo) {
		nome = novoNome;
		cargo = novoCargo;
		salario = 1000;
	}

	public void aumentoSalario(double porcentagem) {
		salario += salario * (porcentagem / 100);
	}

	public double getSalario() {
		return this.salario;
	}

	public String getCargo() {
		return this.cargo;
	}
}