package elepedois.prorgramas;

import elepedois.entidades.Filme;
import elepedois.entidades.Ingresso;
import elepedois.entidades.Sala;
import elepedois.entidades.Sessao;
import elepedois.servicos.ServicoVendaIngresso;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class ProgramaTestaVendaIngresso {
    private static Sessao sessao;
    
    public static void inicializar() {
        Filme filme = new Filme("Total Recall", "Len Wiseman", 2012);
        Sala sala = new Sala(2, 80);
        
        sessao = new Sessao(filme, sala, LocalDateTime.parse("2015-08-25T17:00:00"));
        sessao.createIngresso(45, Ingresso.TipoIngresso.MEIA);
        sessao.createIngresso(38, Ingresso.TipoIngresso.INTEIRA);
    }
    
    public static void vender() {
        System.out.println("Compra de ingresso para a " + sessao);
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre o numero da poltrona: ");
        Integer poltrona = entrada.nextInt();
        
        ServicoVendaIngresso servico = new ServicoVendaIngresso();
        Ingresso ingressoVendido = servico.venderIngresso(sessao, poltrona, Ingresso.TipoIngresso.MEIA);
        
        if (ingressoVendido != null) {
            System.out.println("INGRESSO VENDIDO COM SUCESSO");
        } else {
            System.out.println("NAO E POSSIVEL VENDER O INGRESSO");
        }
    }
    
    public static void listar() {
        System.out.println("\nLista de ingressos da " + sessao);
        List<Ingresso> ingressos = sessao.getIngressos();
        
        for (Ingresso ingresso : ingressos) {
            System.out.println(ingresso);
        }
    }
    
    public static void main(String args[]) {
        inicializar();
        vender();
        listar();
        
        System.out.println("Numero de Ingressos Vendidos: " + sessao.getNumeroIngressosVendidos());
    }
    
}
