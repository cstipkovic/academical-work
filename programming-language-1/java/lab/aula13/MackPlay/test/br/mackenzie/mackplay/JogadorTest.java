package br.mackenzie.mackplay;

import br.mackenzie.mackplay.jogador.JogadorHumano;
import br.mackenzie.mackplay.jogo1.Jogo1;
import br.mackenzie.mackplay.main.Jogador;
import br.mackenzie.mackplay.main.Jogo;
import br.mackenzie.mackplay.main.Participacao;
import org.junit.Test;
import org.junit.Assert;

public class JogadorTest {
   
   @Test
   public void testaConstrutorPadrao(){
       Jogador jogador1 = new JogadorHumano();
       
       Assert.assertEquals(0.0, jogador1.getScore(), 0.001);
       Assert.assertEquals(0, jogador1.getNumParticipacoes());
       Assert.assertEquals(200, jogador1.getParticipacoes().length);
   }
    
   @Test
   public void testaConstrutorNaoPadrao(){
       String nome = "Mack Junior";
       String alias = "The Junior";
       String login = "mack@mackenzie.com.br";
       Jogador jogador1 = new JogadorHumano(alias, nome, login);
       
       Assert.assertEquals(nome, jogador1.getNome());
       Assert.assertEquals(alias, jogador1.getAlias());
       Assert.assertEquals(login, jogador1.getLogin());
       Assert.assertEquals(0.0, jogador1.getScore(), 0.001);
       Assert.assertEquals(0, jogador1.getNumParticipacoes());
       Assert.assertEquals(200, jogador1.getParticipacoes().length);
   }
   
   @Test
   public void testaModificadorNome(){
       String nome = "Mack Junior";
       Jogador jogador1 = new JogadorHumano();
       jogador1.setNome(nome);
       
       Assert.assertEquals(nome, jogador1.getNome());
   }
   
   @Test
   public void testaModificadorAlias(){
       String alias = "The Junior";
       Jogador jogador1 = new JogadorHumano();
       jogador1.setAlias(alias);
       
       Assert.assertEquals(alias, jogador1.getAlias());
   }
   
   @Test
   public void testaModificadorLogin(){
       String login = "mack@mackenzie.com.br";
       Jogador jogador1 = new JogadorHumano();
       jogador1.setLogin(login);
       
       Assert.assertEquals(login, jogador1.getLogin());
   }
    
   
   @Test
   public void testaAddParticipacao(){
        String nome = "Mack Junior";
        String alias = "The Junior";
        String login = "mack@mackenzie.com.br";
        Jogador jogador1 = new JogadorHumano(alias, nome, login);

        String descricao = "descricao do novo jogo.";
        String nomeJogo = "novo jogo";
        String regras = "regras do novo jogo";
        Jogo jogo1 = new Jogo1(descricao, nomeJogo, regras);
        
        String descricao2 = "descricao do jogo.";
        String nomeJogo2 = "jogo";
        String regras2 = "regras do jogo";
        Jogo jogo2 = new Jogo1(descricao2, nomeJogo2, regras2);
        
        Participacao participacao1 = new Participacao(jogador1,jogo1);
        jogador1.addParticipacoes(participacao1);
        
        Participacao participacao2 = new Participacao(jogador1,jogo2);
        jogador1.addParticipacoes(participacao2);
      
        Assert.assertEquals(2, jogador1.getNumParticipacoes());
        
        Assert.assertEquals(participacao1,jogador1.getParticipacoes()[0]);
        Assert.assertEquals(jogo1, jogador1.getParticipacoes()[0].getPartida());
        
        Assert.assertEquals(participacao2,jogador1.getParticipacoes()[1]);
        Assert.assertEquals(jogo2, jogador1.getParticipacoes()[1].getPartida());
   }  
}
