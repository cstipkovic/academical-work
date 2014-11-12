package br.mackenzie.mackplay.jogador;

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

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean alteraSenha(String user, String senha) {
        return true;
    }
    
    public boolean validaSenha(String senha) {
        return true;
    }
}
