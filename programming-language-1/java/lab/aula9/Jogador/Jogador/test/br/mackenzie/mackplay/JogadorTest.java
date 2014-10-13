package br.mackenzie.mackplay;

import org.junit.Test;
import static org.junit.Assert.*;

public class JogadorTest {
    
    @Test
    public void testaConstrutorPadrao() {
        Jogador jogador1 = new Jogador();
        
        assertEquals(0.0, jogador1.getScore(), 0.001);
        assertEquals(0, jogador1.getNumParticipacoes());
        assertEquals(200, jogador1.getParticipacoes().length);
    }
    
    @Test
    public void testaConstrutorNaoPadrao() {
        String nome = "Macke Junior";
        String alias = "The Junior";
        String login = "mack@mackenzie.com.br";
        Jogador jogador1 = new Jogador();
        
        assertEquals(nome, jogador1.getNome());
        assertEquals(alias, jogador1.getAlias());
        assertEquals(login, jogador1.getLogin());
        assertEquals(0.0, jogador1.getScore(), 0.001);
        assertEquals(0, jogador1.getNumParticipacoes());
        assertEquals(200, jogador1.getParticipacoes().length);
    }
    
    @Test
    public void testaModificadorNome() {
        String nome = "Mack Junior";
        Jogador jogador1 = new Jogador();
        
        jogador1.setNome(nome);
        assertEquals(nome, jogador1.getNome());
    }
    
    @Test
    public void testaModificadorAlias() {
        String alias = "The Junior";
        Jogador jogador1 = new Jogador();
        
        jogador1.setAlias(alias);
        assertEquals(alias, jogador1.getAlias());
    }
    
    @Test
    public void testaModificadorLogin() {
        String login = "mack@mackenzie.com.br";
        Jogador jogador1 = new Jogador();
        
        jogador1.setLogin(login);
        assertEquals(login, jogador1.getLogin());
    }
    
    @Test
    public void testaAddParticipacao() {
        String nome = "Mack Junior";
        String alias = "The Junior";
        String login = "mack@mackenzie.com.br";
        Jogador jogador1 = new Jogador(alias, nome, login);
        
        String descricao = "descricao do novo jogo.";
        String nomeJogo = "novo jogo";
        String regras = "regras do novo jogo";
        Jogo jogo1 = new Jogo(descricao, nomeJogo, regras);
        
        String descricao2 = "descricao do jogo.";
        String nomeJogo2 = "jogo";
        String regras2 = "regras do jogo";
        Jogo jogo2 = new Jogo(descricao2, nomeJogo2, regras2);
        
        Participacao participacao1 = new Participacao(jogador1, jogo1);
        jogador1.addParticipacoes(participacao1);
        
        Participacao participacao2 = new Participacao(jogador1, jogo2);
        jogador1.addParticipacoes(participacao2);
        
        assertEquals(2, jogador1.getNumParticipacoes());
        
        assertEquals(participacao1, jogador1.getParticipacoes()[0]);
        assertEquals(jogo1, jogador1.getParticipacoes()[0].getPartida());
        
        assertEquals(participacao2, jogador1.getParticipacoes()[1]);
        assertEquals(jogo2, jogador1.getParticipacoes()[1].getPartida());
    }
}