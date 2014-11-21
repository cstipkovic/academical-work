package br.mackenzie.mackplay.main;

import java.util.ArrayList;
import java.util.List;

public abstract class Jogo {
    
    private String descricao;
    private boolean finalizado;
    private List<Lance> lancesDoJogo;
    private String nome;
    private int numeroMaxParticipantes;
    private String regras;
    Participacao participacao[];
    Jogador jogador[];
    
    int countParticipacao = 0;
    int countJogador = 0;
    
    public Jogo() {
        this.descricao = "nao definida";
        this.nome = "nao definido";
        this.regras = "a definir";
        this.participacao = new Participacao[200];
        this.lancesDoJogo = new ArrayList<Lance>(9);
        this.numeroMaxParticipantes = 2;
        this.jogador = new Jogador[numeroMaxParticipantes];
    }
    
    public Jogo(String descricao, String nome, String regras) {
        this.descricao = descricao;
        this.nome = nome;
        this.regras = regras;
        this.participacao = new Participacao[200];
        this.lancesDoJogo = new ArrayList<Lance>(9);
        this.numeroMaxParticipantes = 2;
        this.jogador = new Jogador[numeroMaxParticipantes];
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setLancesDoJogo(List<Lance> lancesDoJogo) {
        this.lancesDoJogo = lancesDoJogo;
    }

    public List<Lance> getLancesDoJogo() {
        System.out.println(this.lancesDoJogo);
        return this.lancesDoJogo;
    }
    
    public void setNumeroMaxParticipantes(int numeroMaxParticipantes) {
        this.numeroMaxParticipantes = numeroMaxParticipantes;
    }

    public int getNumeroMaxParticipantes() {
        return numeroMaxParticipantes;
    }
    
    public void setRegras(String regras) {
        this.regras = regras;
    }
    
    public String getRegras() {
        return this.regras;
    }
    
    public Participacao[] getParticipacoes() {
        return this.participacao;
    }
    
    public int getNumParticipacoes() {
        return this.countParticipacao;
    }
    
    public void addParticipacoes(Participacao participacao) {
        this.participacao[this.countParticipacao] = participacao;
        this.countParticipacao++;
    }
    
    public abstract void criaLancesDoJogo();
    
    public abstract void finaliza();
    
    public abstract Jogador getProximoJogador();
    
    public abstract Jogador getVencedor();
    
    public abstract boolean isFinalizado();
    
    public abstract List<Lance> listaLances(Jogador lista);
    
    public abstract boolean registraLance(Lance lance);
    
    public int registraParticipante(Jogador jogador) {
        this.jogador[countJogador] = jogador;
        countJogador++;
        
        return countJogador;
    }
    
    public abstract void setPrimeiroJogador(Jogador jogador);
    
}
