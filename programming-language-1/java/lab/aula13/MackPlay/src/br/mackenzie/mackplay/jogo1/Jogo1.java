package br.mackenzie.mackplay.jogo1;

import br.mackenzie.mackplay.main.Jogador;
import br.mackenzie.mackplay.main.Jogo;
import br.mackenzie.mackplay.main.Lance;
import java.util.List;

public class Jogo1 extends Jogo {
    
    private Jogador jogador;
    private Jogador vencedor;
    private boolean finalizado;

    public Jogo1() {
        super();
    }

    public Jogo1(String descricao, String nome, String regras) {
        super(descricao, nome, regras);
    }
    
    @Override
    public void criaLancesDoJogo() {
        
    }
    
    @Override
    public void finaliza() {
        this.finalizado = true;
    }
    
    @Override
    public Jogador getProximoJogador() {
        return this.jogador;
    }
    
    @Override
    public Jogador getVencedor() {
        return this.vencedor;
    }
    
    @Override
    public boolean isFinalizado() {
        if (finalizado == true) {
            return true;
        }
        
        return false;
    }
    
    @Override
    public List<Lance> listaLances(Jogador jogadorLance) {
        return super.getLancesDoJogo();
    }
    
    @Override
    public boolean registraLance(Lance lance) {
        Lance lista = (Lance) super.getLancesDoJogo();
        return true;
    }
    
    @Override
    public void setPrimeiroJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    
}
