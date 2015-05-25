package cinema.model;

public class Sala {

    public int id;
    public int capacidade;
    public int poltronaEspecialDiferenciada;
    public boolean emManutencao;

    public Sala(int id, int capacidade, int poltronaEspecialDiferenciada, boolean emManutencao) {
        this.id = id;
        this.capacidade = capacidade;
        this.poltronaEspecialDiferenciada = poltronaEspecialDiferenciada;
        this.emManutencao = emManutencao;
    }
    
    public Sala(int id) {
        this.id = id;
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
}
