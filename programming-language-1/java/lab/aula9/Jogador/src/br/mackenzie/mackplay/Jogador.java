package br.mackenzie.mackplay;

public class Jogador {
    
    String alias;
    String login;
    String nome;
    double score;
    Participacao participacao[];
    int countParticipacao = 0;
    
    public Jogador() {
        this.nome = "Macke Junior";
        this.alias = "The Junior";
        this.login = "mack@mackenzie.com.br";
        this.participacao = new Participacao[200];
    }
    
    public Jogador(String alias, String nome, String login) {
        this.alias = alias;
        this.nome = nome;
        this.login = login;
        this.participacao = new Participacao[200];
    }
    
    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    public String getAlias() {
        return this.alias;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getLogin() {
        return this.login;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setScore(double score) {
        this.score = score;
    }
    
    public double getScore() {
        return this.score;
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
    
    public Participacao[] getParticipacoes() {
        return this.participacao;
    }
    
    public void addParticipacoes(Participacao participacao) {
        this.participacao[countParticipacao] = participacao;
        countParticipacao++;
    }
}
