/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31056318
 */
public class Ingresso {
    private Jogo jogo;
    private String tipo;

    public Ingresso() {
    }

    public Ingresso(Jogo jogo, String tipo) {
        this.jogo = jogo;
        this.tipo = tipo;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Ingresso{" + "jogo=" + jogo + ", tipo=" + tipo + '}';
    }

}
