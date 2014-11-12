package br.mackenzie.mackplay;

public abstract class Usuario {
    private String login;
    private String nome;
    private String senha;
    
    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }
    
    public abstract boolean alteraSenha(String login, String senha);
    
    public abstract boolean validaSenha(String senha);
}
