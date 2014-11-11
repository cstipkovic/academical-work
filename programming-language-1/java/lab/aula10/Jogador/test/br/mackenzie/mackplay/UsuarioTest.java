package br.mackenzie.mackplay;

import org.junit.Assert;
import org.junit.Test;

public class UsuarioTest {

    @Test
    public void testaUsuarioLoginOK(){
        String login = "mack@mackenzie.com.br";
        String senha = "mack123";
        Usuario u = new JogadorHumano();
        u.setLogin(login);
        u.setSenha(senha);
        Assert.assertEquals(login, u.getLogin());
        Assert.assertTrue(u.validaSenha(senha));        
    }
    
    

        @Test
    public void testaUsuarioLoginNOK(){
        String login = "mack@mackenzie.com.br";
        String senha = "mack123";
        Usuario u = new JogadorHumano();
        u.setLogin(login);
        u.setSenha(senha);
        Assert.assertEquals(login, u.getLogin());
        Assert.assertFalse(u.validaSenha(senha+"a"));        
    }
    
        @Test
    public void testaUsuarioAlteraSenha(){
        String login = "mack@mackenzie.com.br";
        String senha = "mack123";
        String novaSenha = "1234mack";
        Usuario u = new JogadorHumano();
        u.setLogin(login);
        u.setSenha(senha);
        u.alteraSenha(senha, novaSenha);
        Assert.assertEquals(login, u.getLogin());
        Assert.assertTrue(u.validaSenha(novaSenha));        
    }
}