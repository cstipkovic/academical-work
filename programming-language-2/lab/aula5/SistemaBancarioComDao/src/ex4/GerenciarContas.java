package ex4;

import banco.dao.api.ContaDaoInterface;
import banco.dao.impl.relacional.ConexaoInterface;
import banco.dao.impl.relacional.ContaDaoRelacional;
import banco.dao.impl.relacional.javadb.ConexaoJavaDB;
import banco.dominio.Conta;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class GerenciarContas {

    public static void main(String args[]) {
        
        System.out.println("(1) Listar todas as contas.");
        System.out.println("(2) Adicionar uma nova conta.");
        System.out.println("(3) Remover uma conta.");
        System.out.println("(4) Atualizar os dados de uma conta.");
        System.out.println("(5) Sair.");
        
        ConexaoInterface conexao;
        conexao = new ConexaoJavaDB("app", "app", "127.0.0.1", 1527, "sistema_bancario");
        ContaDaoInterface dao;
        dao = new ContaDaoRelacional(conexao);
        
        System.out.println("Informe sua opção: ");
        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();
        int nroConta;
        BigDecimal saldo;
        
        while (opcao != 5) {            
            switch(opcao) {
                case 1:
                    List<Conta> todasContas;
                    todasContas = dao.listarTudo();

                    for (Conta c : todasContas) {
                        System.out.print("Nro: " + c.getNumero());
                        System.out.print(" - ");
                        System.out.println("Saldo: R$" + c.getSaldo());
                    }
                    
                    System.out.print("\nInforme sua opção: ");
                    opcao = entrada.nextInt();
                    break;
                    
                case 2: // Adicionar
                    System.out.print("Informe o numero: ");
                    nroConta = entrada.nextInt();
                    System.out.print("Informe o saldo: ");
                    saldo = entrada.nextBigDecimal();
                    
                    Conta cAdicionar;
                    cAdicionar = new Conta(nroConta, saldo);
                    dao.adicionar(cAdicionar);
                    
                    System.out.print("\nInforme sua opção: ");
                    opcao = entrada.nextInt();
                    break;
                    
                case 3: // Remover
                    System.out.print("Informe o numero: ");
                    nroConta = entrada.nextInt();
                    
                    Conta cRemover;
                    cRemover = new Conta(nroConta, null);
                    dao.remover(cRemover);
                    
                    System.out.print("\nInforme sua opção: ");
                    opcao = entrada.nextInt();
                    break;
                    
                case 4: // Atualizar
                    System.out.print("Informe o numero: ");
                    nroConta = entrada.nextInt();
                    System.out.print("Informe o saldo: ");
                    saldo = entrada.nextBigDecimal();
                    
                    Conta cAtualizar;
                    cAtualizar = new Conta(nroConta, null);
                    
                    cAtualizar.setSaldo(saldo);
                    dao.atualizar(cAtualizar);
                    
                default:
                    System.out.print("Informe sua opção: ");
                    opcao = entrada.nextInt();
                    break;
            }
        }
    }
}
