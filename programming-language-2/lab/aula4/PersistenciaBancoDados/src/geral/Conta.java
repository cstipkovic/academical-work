package geral;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conta {

    public void ImprimirContas(Statement st) throws SQLException {
        String sql = "SELECT nro_conta, saldo FROM contas";
        ResultSet resultados;
        resultados = st.executeQuery(sql);
        
        System.out.println("Dados das contas:");
        while(resultados.next()) {            
            System.out.print("Numero da Conta: " + resultados.getLong("nro_conta") + " - ");
            System.out.println("Saldo da conta: " + resultados.getInt("saldo") + " - ");
        }       
    }
    
    public int DebitaValorContas(Statement st, int valor) throws SQLException {
        String sql = "UPDATE contas SET saldo = saldo - " + valor;
        
        return st.executeUpdate(sql);
    }
}
