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
        this.participacao = new Participacao[200];
    }
    
    public Jogo(String descricao, String nome, String regras) {
        this.descricao = descricao;
        this.nome = nome;
        this.regras = regras;
        this.participacao = new Participacao[200];
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
        return this.countParticipacao;
    }
    
    public void addParticipacoes(Participacao participacao) {
        this.participacao[this.countParticipacao] = participacao;
        this.countParticipacao++;
    }
}
