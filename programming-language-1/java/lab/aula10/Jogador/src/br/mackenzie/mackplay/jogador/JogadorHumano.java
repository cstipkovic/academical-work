package br.mackenzie.mackplay.jogador;

import br.mackenzie.mackplay.Jogador;
import java.util.Date;

public class JogadorHumano extends Jogador {
    
    private Date dataNasciemnto;
    private String sexo;

    public JogadorHumano() {
        super();
    }

    public JogadorHumano(String alias, String nome, String login) {
        super.setAlias(alias);
        super.setNome(nome);
        super.setLogin(login);
    }

    @Override
    public boolean alteraSenha(String login, String senha) {
        if (super.getSenha() != senha) {
            super.setSenha(senha);
            return true;
        }
        
        return false;
    }

    @Override
    public boolean validaSenha(String senha) {
        if (super.getSenha() == senha) {
            return true;
        }
        
        return false;
    }
}
