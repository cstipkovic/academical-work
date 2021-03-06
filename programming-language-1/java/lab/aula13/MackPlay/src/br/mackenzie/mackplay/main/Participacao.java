// Aluno: Clauber Pereira Stipkovic Halic
// Tia: 3124304-5

package br.mackenzie.mackplay.main;

import java.util.ArrayList;
import java.util.Date;

public class Participacao {
    
    Date fim;
    Date inicio;
    double pontuacao;
    Jogador jogador;
    Jogo jogo;
    ArrayList<Lance> lances;
    
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
    
    public Date getInicio() {
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
    
    public Jogador getParticipante() {
        return this.jogador;
    }
    
    public boolean adicionaLance(Lance lance) {
        this.lances.add(lance);
        return true;
    }
}
