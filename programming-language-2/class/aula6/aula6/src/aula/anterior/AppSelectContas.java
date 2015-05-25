package aula.anterior;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppSelectContas {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conexao;
        String url = "jdbc:derby://127.0.0.1:1527/banco";
        String usuario = "app";
        String senha = "app";
        conexao = DriverManager.getConnection(url, usuario, senha);
        
        Statement st;
        st = conexao.createStatement();
        
        String sql = "select nro_conta, saldo, from contas";
        ResultSet resultados = st.executeQuery(sql);
        
        System.out.println("Dados das contas");
        while (resultados.next()) {            
            System.out.print("Numero: " + resultados.getLong("nro_conta") + " - ");
            System.out.println("Saldo R$ " + resultados.getBigDecimal("saldo"));
        }
        
        conexao.close();
    }
}
