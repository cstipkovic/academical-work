package heranca;

public class Telefonista extends Funcionario {
    private int estacaoDeTrabalho;
    
    public void setEstacaoDeTrabalho(int n_estacao) {
        estacaoDeTrabalho = n_estacao;
    }
    
    public int getEstacaoDeTrabalho() {
        return estacaoDeTrabalho;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Estacao de trabalho: " + this.getEstacaoDeTrabalho());
    }
}
