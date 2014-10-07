package br.mackenzie.mackplay;

public class Jogo {
    
    String descricao;
    String nome;
    String regras;
    Participacao participacao[];
    int countParticipacao = 0;
    
    public Jogo() {
        this.descricao = "nao definida";
        this.nome = "nao definido";
        this.regras = "a definir";
    }
    
    public Jogo(String descricao, String nome, String regras) {
        this.descricao = descricao;
        this.nome = nome;
        this.regras = regras;
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
        int numParticipacoes = 0;
        for (int i = 0; i < this.participacao.length; i++) {
            if (this.participacao[i] != null) {
                numParticipacoes++;
            }
        }
        
        return numParticipacoes;
    }
    
    public void addParticipacoes(Participacao participacao) {
        this.participacao[this.countParticipacao] = participacao;
        this.countParticipacao++;
    }
}
