package Ex2;

import geral.BancoDados;
import geral.Conta;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DebitarSaldo {
    
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        
        BancoDados db = new BancoDados();
        Connection conexao = db.Conectar();
        
        Statement st;
        st = conexao.createStatement();
        
        Conta conta = new Conta();
        conta.ImprimirContas(st);
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe qual o valor a ser debitado: ");
        int valor = entrada.nextInt();
        
        System.out.println("Valor debitado de " + conta.DebitaValorContas(st, valor) + " conta(s).");
        
        conta.ImprimirContas(st);
    }
}
