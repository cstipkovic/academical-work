package elepedois.entidades;

public class Sala {
    private Integer numero;
    private Integer capacidade;

    public Sala() {
    }

    public Sala(Integer numero, Integer capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }
    
    @Override
    public String toString() {
        return "sala " + numero + " (" + capacidade + " lugares)";
    }
}
