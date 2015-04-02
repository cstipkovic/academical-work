package cinema.dominio;

public class Sala {

    public int id;
    public int capacidade;
    public int poltronaEspecialDiferenciada;
    public boolean emManutencao;
    public int numeroSala;

    public Sala(int id, int capacidade, int poltronaEspecialDiferenciada, boolean emManutencao, int numeroSala) {
        this.id = id;
        this.capacidade = capacidade;
        this.poltronaEspecialDiferenciada = poltronaEspecialDiferenciada;
        this.emManutencao = emManutencao;
        this.numeroSala = numeroSala;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPoltronaEspecialDiferenciada() {
        return poltronaEspecialDiferenciada;
    }

    public void setPoltronaEspecialDiferenciada(int poltronaEspecialDiferenciada) {
        this.poltronaEspecialDiferenciada = poltronaEspecialDiferenciada;
    }

    public boolean isEmManutencao() {
        return emManutencao;
    }

    public void setEmManutencao(boolean emManutencao) {
        this.emManutencao = emManutencao;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }
}
