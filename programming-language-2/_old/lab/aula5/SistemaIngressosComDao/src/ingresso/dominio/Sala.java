package ingresso.dominio;

import java.math.BigInteger;

public class Sala {
    
    public long numero;
    public int capacidade;
    public int qtPoltronaEspecial;
    public boolean emManutencao;

    public Sala(long numero, int capacidade, int qtPoltronaEspecial, boolean emManutencao) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.qtPoltronaEspecial = qtPoltronaEspecial;
        this.emManutencao = emManutencao;
    }

    public Sala(long numero) {
        this.numero = numero;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQtPoltronaEspecial() {
        return qtPoltronaEspecial;
    }

    public void setQtPoltronaEspecial(int qtPoltronaEspecial) {
        this.qtPoltronaEspecial = qtPoltronaEspecial;
    }

    public boolean isEmManutencao() {
        return emManutencao;
    }

    public void setEmManutencao(boolean emManutencao) {
        this.emManutencao = emManutencao;
    }    
}
