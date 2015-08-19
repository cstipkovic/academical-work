package ex6;

import ingresso.dao.api.SalaDaoInterface;
import ingresso.dao.impl.realacional.ConexaoInterface;
import ingresso.dao.impl.realacional.SalaDaoRelacional;
import ingresso.dao.impl.relacional.javadb.ConexaoJavaDB;
import ingresso.dominio.Sala;
import java.util.List;
import java.util.Scanner;

public class GerenciarSalas {
    
    public static void main(String args[]) {
        System.out.println("(1) Listar todas as salas.");
        System.out.println("(2) Adicionar uma nova sala.");
        System.out.println("(3) Remover uma sala.");
        System.out.println("(4) Atualizar os dados de uma sala.");
        System.out.println("(5) Sair.");

        ConexaoInterface conexao;
        conexao = new ConexaoJavaDB("app", "app", "127.0.0.1", 1527, "sistema_ingresso");
        SalaDaoInterface dao;
        dao = new SalaDaoRelacional(conexao);

        System.out.println("Informe sua opção: ");
        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();
        long nroSala;
        int capacidade;
        int qtPoltronaEspecial;
        boolean emManutencao;

        while (opcao != 5) {            
            switch(opcao) {
                case 1: // Listar
                    List<Sala> todasSalas;
                    todasSalas = dao.listarTudo();

                    for (Sala s : todasSalas) {
                        System.out.print("Numero: " + s.getNumero() + " - ");
                        System.out.print("Capacidade: " + s.getCapacidade() + " - ");
                        System.out.print("Poltronas Especiais: " + s.getQtPoltronaEspecial() + " - ");
                        System.out.println("Em manutenção: " + s.isEmManutencao());
                    }

                    System.out.print("\nInforme sua opção: ");
                    opcao = entrada.nextInt();
                    break;

                case 2: // Adicionar
                    System.out.print("Informe o numero: ");
                    nroSala = entrada.nextInt();
                    System.out.print("Informe a capacidade: ");
                    capacidade = entrada.nextInt();
                    System.out.print("Informe a qt de poltronas especiais: ");
                    qtPoltronaEspecial = entrada.nextInt();
                    System.out.print("Informe se esta em manutencao: ");
                    emManutencao = entrada.nextBoolean();

                    Sala sAdicionar;
                    sAdicionar = new Sala(nroSala, capacidade, qtPoltronaEspecial, emManutencao);
                    dao.adicionar(sAdicionar);

                    System.out.print("\nInforme sua opção: ");
                    opcao = entrada.nextInt();
                    break;

                case 3: // Remover
                    System.out.print("Informe o numero: ");
                    nroSala = entrada.nextInt();

                    Sala sRemover;
                    sRemover = new Sala(nroSala);
                    dao.remover(sRemover);

                    System.out.print("\nInforme sua opção: ");
                    opcao = entrada.nextInt();
                    break;

                case 4: // Atualizar
                    System.out.print("Informe o numero: ");
                    nroSala = entrada.nextInt();
                    System.out.print("Informe a capacidade: ");
                    capacidade = entrada.nextInt();
                    System.out.print("Informe a qt de poltronas especiais: ");
                    qtPoltronaEspecial = entrada.nextInt();
                    System.out.print("Informe se esta em manutencao: ");
                    emManutencao = entrada.nextBoolean();

                    Sala sAtualizar;
                    sAtualizar = dao.buscarPeloNumero(nroSala);

                    sAtualizar.setCapacidade(capacidade);
                    sAtualizar.setQtPoltronaEspecial(qtPoltronaEspecial);
                    sAtualizar.setEmManutencao(emManutencao);
                    dao.atualizar(sAtualizar);
                    break;

                default:
                    System.out.print("Informe sua opção: ");
                    opcao = entrada.nextInt();
                    break;
            }
        }
    } 
}
