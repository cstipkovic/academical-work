package br.mackenzie.mackplay;

import java.util.Date;

public class Participacao {
    
    Date fim;
    Date inicio;
    double pontuacao;
    Jogador jogador;
    Jogo jogo;
    
    public Participacao(Jogador jogador, Jogo jogo) {
        this.jogador = jogador;
        this.jogo = jogo;
    }
    
    public void setFim(Date fim) {
        this.fim = fim;
    }
    
    public Date getFim() {
        return this.fim;
    }
    
    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }
    
    public Date getinicio() {
        return this.inicio;
    }
    
    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }
    
    public double getPontuacao() {
        return this.pontuacao;
    }
    
    public Jogo getPartida() {
        return this.jogo;
    }
}
