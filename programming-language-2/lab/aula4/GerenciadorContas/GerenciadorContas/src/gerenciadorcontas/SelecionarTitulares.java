package gerenciadorcontas;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelecionarTitulares {
    
    public static void main (String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conexao;
        String url = "jdbc:derby://127.0.0.1:1527/sistema_bancario";
        String usuario = "app";
        String senha = "123";
        conexao = DriverManager.getConnection(url, usuario, senha);
        
        Statement st;
        st = conexao.createStatement();
        
        String sql = "SELECT nro_titular, nome, rg, cpf FROM titulares";
        ResultSet resultados = st.executeQuery(sql);
        
        System.out.println("Dados dos titulares");
        while (resultados.next()) {
            System.out.println("Numero: " + resultados.getLong("nro_titulares" + " - "));
        }
    }
}
