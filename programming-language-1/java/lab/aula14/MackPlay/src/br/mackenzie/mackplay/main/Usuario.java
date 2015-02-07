package br.mackenzie.mackplay.main;

public abstract class Usuario {
    
    public String login;
    public String nome;
    public String senha;
    
    public boolean alteraSenha(String login, String senha) {
        if (this.getLogin().equals(login)) {
            this.setSenha(senha);
            return true;
        }
        
        return false;
    }
    
    public boolean validaSenha(String senha) {
        return this.getSenha().equals(senha);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
