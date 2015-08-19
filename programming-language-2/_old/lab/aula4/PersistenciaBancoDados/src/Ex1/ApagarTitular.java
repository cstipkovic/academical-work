package Ex1;

import geral.BancoDados;
import geral.Titular;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ApagarTitular {
    
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        
        BancoDados db = new BancoDados();
        Connection conexao = db.Conectar();
        
        Statement st;
        st = conexao.createStatement();
        
        Titular titular = new Titular();
        titular.ImprimeTitulares(st);
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("\nInforme o numero do titular que deseja remover: ");
        int numeroTitular = entrada.nextInt();
        
        int resultado;
        resultado = titular.ApagaTitular(st, numeroTitular);
        if (resultado == 1) {
            System.out.println("Removido com sucesso.");
        } else {
            System.out.println("Titular não encontrado.");
        }
    }
}
