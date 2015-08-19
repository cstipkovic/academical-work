package projetocinema;

public class SalaProjecao {
    
    private int capacidade;
    private int poltronaEspecialDiferenciada;
    private boolean emManutencao;
    private int numeroSala;

    public SalaProjecao(int capacidade, int poltronaEspecialDiferenciada, boolean emManutencao, int numeroSala) {
        this.capacidade = capacidade;
        this.poltronaEspecialDiferenciada = poltronaEspecialDiferenciada;
        this.emManutencao = emManutencao;
        this.numeroSala = numeroSala;
    }
    
    @Override
    public String toString() {
        return (
                this.capacidade + ";" + 
                this.poltronaEspecialDiferenciada + ";" + 
                this.emManutencao + ";" +
                this.numeroSala
                );
    }

    
}
