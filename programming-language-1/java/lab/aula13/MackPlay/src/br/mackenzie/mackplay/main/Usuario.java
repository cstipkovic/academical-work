// Aluno: Clauber Pereira Stipkovic Halic
// Tia: 3124304-5

package br.mackenzie.mackplay.main;

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
        return this.nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }
    
    public boolean alteraSenha(String login, String senha) {
        return true;
    }
    
    public boolean validaSenha(String senha) {
        return true;
    }
}
