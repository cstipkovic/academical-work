// Aluno: Clauber Pereira Stipkovic Halic
// Tia: 3124304-5

package br.mackenzie.mackplay.jogador;

import br.mackenzie.mackplay.main.Jogador;
import java.util.Date;

public class JogadorHumano extends Jogador {
    
    private Date dataNascimento;
    private String sexo;

    public JogadorHumano() {
        super();
    }    

    public JogadorHumano(String alias, String nome, String login) {
        super(alias, nome, login);
    }

    @Override
    public boolean alteraSenha(String senha, String novaSenha) {
        if (!super.getSenha().equals(novaSenha)) {
            super.setSenha(novaSenha);
            return true;
        }
        
        return false;
    }
    
    @Override
    public boolean validaSenha(String senha) {
        if (super.getSenha().equals(senha)) {
            return true;
        }
        
        return false;
    }
    
}
