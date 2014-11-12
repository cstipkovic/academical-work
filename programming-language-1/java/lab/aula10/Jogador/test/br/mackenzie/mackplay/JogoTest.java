package br.mackenzie.mackplay;

import br.mackenzie.mackplay.jogador.JogadorHumano;
import br.mackenzie.mackplay.jogo.Jogo;
import org.junit.Test;
import static org.junit.Assert.*;

public class JogoTest {

    @Test
    public void testaConstrutorPadrao(){
        Jogo jogo1 = new Jogo();
        assertEquals("a definir",jogo1.getRegras());
        assertEquals("nao definido",jogo1.getNome());
        assertEquals("nao definida",jogo1.getDescricao());
        assertEquals(0, jogo1.getNumParticipacoes());
       assertEquals(200,jogo1.getParticipacoes().length);
    }
    @Test
    public void testaConstrutorNaoPadrao(){
        String descricao="descricao do novo jogo.";
        String nome = "novo jogo";
        String regras = "regras do novo jogo";
        Jogo jogo1 = new Jogo(descricao, nome, regras);
        assertEquals(descricao,jogo1.getDescricao());
        assertEquals(nome,jogo1.getNome());
        assertEquals(regras,jogo1.getRegras());
        assertEquals(0, jogo1.getNumParticipacoes());
       assertEquals(200,jogo1.getParticipacoes().length);
    }
    
    @Test
    public void testaModificadorDescricao(){
        String descricao="descricao do novo jogo.";
        Jogo jogo1 = new Jogo();
        jogo1.setDescricao(descricao);
        assertEquals(descricao,jogo1.getDescricao());
        assertEquals("a definir",jogo1.getRegras());
        assertEquals("nao definido",jogo1.getNome());
       }
       @Test
    public void testaModificadorNome(){
        String nome = "novo jogo";       
        Jogo jogo1 = new Jogo();
        jogo1.setNome(nome);
        assertEquals(nome,jogo1.getNome());
        assertEquals("a definir",jogo1.getRegras());
        assertEquals("nao definida",jogo1.getDescricao());
    }
          @Test
    public void testaModificadorRegras(){
        String regras = "regras do novo jogo";
        Jogo jogo1 = new Jogo();
        jogo1.setRegras(regras);
        assertEquals(regras,jogo1.getRegras());
        assertEquals("nao definido",jogo1.getNome());
        assertEquals("nao definida",jogo1.getDescricao());
    }
    
    @Test
   public void testaAddParticipacao(){
        String nome = "Mack Junior";
        String alias = "The Junior";
        String login = "mack@mackenzie.com.br";
        Jogador jogador1 = new JogadorHumano(alias, nome, login);
        
        String nome2 = "Mack Neto";
        String alias2 = "The Neto";
        String login2 = "neto@mackenzie.com.br";
        Jogador jogador2 = new JogadorHumano(alias2, nome2, login2);

        String descricao = "descricao do novo jogo.";
        String nomeJogo = "novo jogo";
        String regras = "regras do novo jogo";
        Jogo jogo1 = new Jogo(descricao, nomeJogo, regras);
        
        Participacao participacao1 = new Participacao(jogador1,jogo1);
        jogo1.addParticipacoes(participacao1);
        
        Participacao participacao2 = new Participacao(jogador2,jogo1);
        jogo1.addParticipacoes(participacao2);
      
        assertEquals(2, jogo1.getNumParticipacoes());
        
        assertEquals(participacao1,jogo1.getParticipacoes()[0]);
        assertEquals(jogador1, jogo1.getParticipacoes()[0].getParticipante());
        
        assertEquals(participacao2,jogo1.getParticipacoes()[1]);
        assertEquals(jogador2, jogo1.getParticipacoes()[1].getParticipante());
   }   
}