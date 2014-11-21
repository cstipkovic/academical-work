package br.mackenzie.mackplay;

import br.mackenzie.mackplay.jogador.JogadorHumano;
import br.mackenzie.mackplay.jogador.JogadorMaquina;
import br.mackenzie.mackplay.jogo1.Jogo1;
import br.mackenzie.mackplay.jogoVelha.JogoVelha;
import br.mackenzie.mackplay.main.Jogador;
import br.mackenzie.mackplay.main.Jogo;
import br.mackenzie.mackplay.main.Participacao;
import org.junit.Test;
import static org.junit.Assert.*;

public class JogoTest {
    
    @Test
    public void testaConstrutorNaoPadraoNovo(){
        String descricao = "descricao do jogo da velha.";
        String nome = "Jogo da Velha";
        String regras = "Descricao das regras do jogo da velha...";
        
        Jogo jogoVelha = new JogoVelha(descricao, nome, regras);
        
        assertEquals(descricao,jogoVelha.getDescricao());
        assertEquals(nome,jogoVelha.getNome());
        assertEquals(regras,jogoVelha.getRegras());
        assertEquals(0, jogoVelha.getNumParticipacoes());
        assertEquals(200, jogoVelha.getParticipacoes().length);
        assertFalse(jogoVelha.isFinalizado());
        assertEquals(2, jogoVelha.getNumeroMaxParticipantes());
        assertEquals(9, jogoVelha.getLancesDoJogo().size());
    }
    
    @Test
    public void testaRegistraParticipante(){
        Jogador participante = new JogadorHumano();
        Jogador participante2 = new JogadorMaquina();
        
        String descricao="descricao do jogo da velha.";
        String nome = "Jogo da Velha";
        String regras = "Descricao das regras do jogo da velha...";
        
        Jogo jogoVelha = new JogoVelha(descricao, nome, regras);
        
        assertEquals(1,jogoVelha.registraParticipante(participante));
        assertEquals(2,jogoVelha.registraParticipante(participante2));
        
        jogoVelha.setPrimeiroJogador(participante);
        assertEquals(0, jogoVelha.listaLances(participante2).size());
        assertEquals(9, jogoVelha.listaLances(participante).size());
        
        assertEquals(participante, jogoVelha.getParticipacoes()[0].getParticipante());
        assertEquals(participante2, jogoVelha.getParticipacoes()[1].getParticipante());
    }
    
    @Test
    public void testaPartida(){
        Jogador participante1 = new JogadorHumano();
        Jogador participante2 = new JogadorHumano();
        
        String descricao="descricao do jogo da velha.";
        String nome = "Jogo da Velha";
        String regras = "Descricao das regras do jogo da velha...";
        
        Jogo jogoVelha = new JogoVelha(descricao, nome, regras);
        
        assertEquals(1, jogoVelha.registraParticipante(participante1));
        assertEquals(2, jogoVelha.registraParticipante(participante2));
        
        jogoVelha.setPrimeiroJogador(participante1);
        assertEquals(0, jogoVelha.listaLances(participante2).size());
        assertEquals(9, jogoVelha.listaLances(participante1).size());
        
        jogoVelha.registraLance(jogoVelha.listaLances(participante1).get(0));
        
        assertEquals(8, jogoVelha.listaLances(participante2).size());
        assertEquals(0, jogoVelha.listaLances(participante1).size());
        
        jogoVelha.registraLance(jogoVelha.listaLances(participante2).get(7));
        
        assertEquals(0, jogoVelha.listaLances(participante2).size());
        assertEquals(7, jogoVelha.listaLances(participante1).size());
        
        jogoVelha.registraLance(jogoVelha.listaLances(participante1).get(0));
        
        assertEquals(6, jogoVelha.listaLances(participante2).size());
        assertEquals(0, jogoVelha.listaLances(participante1).size());
        
        jogoVelha.registraLance(jogoVelha.listaLances(participante2).get(4));
        assertEquals(0, jogoVelha.listaLances(participante2).size());
        assertEquals(5, jogoVelha.listaLances(participante1).size());
        
        jogoVelha.registraLance(jogoVelha.listaLances(participante1).get(0));
        
        assertEquals(0, jogoVelha.listaLances(participante2).size());
        assertEquals(0, jogoVelha.listaLances(participante1).size());
        
        assertTrue(jogoVelha.isFinalizado());
        
        assertEquals(0.0, jogoVelha.getParticipacoes()[1].getPontuacao(),0.001);
        assertEquals(3.0, jogoVelha.getParticipacoes()[0].getPontuacao(),0.001);
    }
    
    @Test
    public void testaConstrutorPadrao(){
        Jogo jogo1 = new Jogo1();
        
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
        Jogo jogo1 = new Jogo1(descricao, nome, regras);
        
        assertEquals(descricao,jogo1.getDescricao());
        assertEquals(nome,jogo1.getNome());
        assertEquals(regras,jogo1.getRegras());
        assertEquals(0, jogo1.getNumParticipacoes());
        assertEquals(200,jogo1.getParticipacoes().length);
    }
    
    @Test
    public void testaModificadorDescricao(){
        String descricao="descricao do novo jogo.";
        Jogo jogo1 = new Jogo1();
        jogo1.setDescricao(descricao);
        
        assertEquals(descricao,jogo1.getDescricao());
        assertEquals("a definir",jogo1.getRegras());
        assertEquals("nao definido",jogo1.getNome());
    }
    
    @Test
    public void testaModificadorNome(){
        String nome = "novo jogo";       
        Jogo jogo1 = new Jogo1();
        jogo1.setNome(nome);
        
        assertEquals(nome,jogo1.getNome());
        assertEquals("a definir",jogo1.getRegras());
        assertEquals("nao definida",jogo1.getDescricao());
    }
    
    @Test
    public void testaModificadorRegras(){
        String regras = "regras do novo jogo";
        Jogo jogo1 = new Jogo1();
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
        Jogo jogo1 = new Jogo1(descricao, nomeJogo, regras);
        
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