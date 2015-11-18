/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31056318
 */
public class Local {

    private String cidade;
    private String estadio;
    private int arq_Padrao;
    private int arq_inferior;
    private int arq_numerada;

    public Local() {
    }

    public Local(String cidade, String estadio, int arq_Padrao, int arq_inferior, int arq_numerada, int camarote) {
        this.cidade = cidade;
        this.estadio = estadio;
        this.arq_Padrao = arq_Padrao;
        this.arq_inferior = arq_inferior;
        this.arq_numerada = arq_numerada;
        this.camarote = camarote;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getarq_Padrao() {
        return arq_Padrao;
    }

    public void setarq_Padrao(int arq_Padrao) {
        this.arq_Padrao = arq_Padrao;
    }

    public int getArq_inferior() {
        return arq_inferior;
    }

    public void setArq_inferior(int arq_inferior) {
        this.arq_inferior = arq_inferior;
    }

    public int getArq_numerada() {
        return arq_numerada;
    }

    public void setArq_numerada(int arq_numerada) {
        this.arq_numerada = arq_numerada;
    }

    public int getCamarote() {
        return camarote;
    }

    public void setCamarote(int camarote) {
        this.camarote = camarote;
    }
    int camarote;

    @Override
    public String toString() {
        return "Local{" + "cidade=" + cidade + ", estadio=" + estadio + ", arq_Padrao=" + arq_Padrao + ", arq_inferior=" + arq_inferior + ", arq_numerada=" + arq_numerada + ", camarote=" + camarote + '}';
    }
}
