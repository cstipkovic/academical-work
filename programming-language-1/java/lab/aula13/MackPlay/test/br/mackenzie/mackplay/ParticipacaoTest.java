package br.mackenzie.mackplay;

import br.mackenzie.mackplay.jogador.JogadorHumano;
import br.mackenzie.mackplay.jogo1.Jogo1;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

public class ParticipacaoTest {

    @Test
    public void testaConstrutor() {
        String nome = "Mack Junior";
        String alias = "The Junior";
        String login = "mack@mackenzie.com.br";
        Jogador jogador1 = new JogadorHumano(alias, nome, login);

        String descricao = "descricao do novo jogo.";
        String nomeJogo = "novo jogo";
        String regras = "regras do novo jogo";
        Jogo jogo1 = new Jogo1(descricao, nomeJogo, regras);
        
        Participacao participacao = new Participacao(jogador1,jogo1);
        
        assertEquals(jogador1,participacao.getParticipante());
        assertEquals(jogo1,participacao.getPartida());
        assertEquals(0.0, participacao.getPontuacao(),0.0001);
    }
    
    
    @Test
    public void testaModificadorPontuacao() {
        String nome = "Mack Junior";
        String alias = "The Junior";
        String login = "mack@mackenzie.com.br";
        Jogador jogador1 = new JogadorHumano(alias, nome, login);

        String descricao = "descricao do novo jogo.";
        String nomeJogo = "novo jogo";
        String regras = "regras do novo jogo";
        Jogo jogo1 = new Jogo1(descricao, nomeJogo, regras);
        
        Participacao participacao = new Participacao(jogador1,jogo1);
        
        participacao.setPontuacao(200.0);
        assertEquals(200.0, participacao.getPontuacao(),0.0001);
    }
    
    @Test
    public void testaModificadorInicio() {
        String nome = "Mack Junior";
        String alias = "The Junior";
        String login = "mack@mackenzie.com.br";
        Jogador jogador1 = new JogadorHumano(alias, nome, login);

        String descricao = "descricao do novo jogo.";
        String nomeJogo = "novo jogo";
        String regras = "regras do novo jogo";
        Jogo jogo1 = new Jogo1(descricao, nomeJogo, regras);
        
        Participacao participacao = new Participacao(jogador1,jogo1);
        
        Date inicio = new Date();
        participacao.setInicio(inicio);
        assertEquals(inicio, participacao.getInicio());
    }
    
    @Test
    public void testaModificadorFim() {
        String nome = "Mack Junior";
        String alias = "The Junior";
        String login = "mack@mackenzie.com.br";
        Jogador jogador1 = new JogadorHumano(alias, nome, login);

        String descricao = "descricao do novo jogo.";
        String nomeJogo = "novo jogo";
        String regras = "regras do novo jogo";
        Jogo jogo1 = new Jogo1(descricao, nomeJogo, regras);
        
        Participacao participacao = new Participacao(jogador1,jogo1);
        
        Date fim = new Date();
        participacao.setFim(fim);
        assertEquals(fim, participacao.getFim());
    }
}