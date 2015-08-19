package gerenciadorcontas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelecionarTitulares {
    
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conexao;
        String url = "jdbc:derby://127.0.0.1:1527/sistema_bancario";
        String usuario = "app";
        String senha = "app";
        conexao = DriverManager.getConnection(url, usuario, senha);
        
        Statement st;
        st = conexao.createStatement();
        
        String sql = "select nro_titular, nome, rg, cpf from titulares";
        ResultSet resultados = st.executeQuery(sql);
        
        System.out.println("Dados dos titulares:");
        while (resultados.next()) {            
            System.out.print("Numero: " + resultados.getLong("nro_titular") + " - ");
            System.out.print("Nome: " + resultados.getString("nome") + " - ");
            System.out.print("RG: " + resultados.getString("rg") + " - ");
            System.out.println("CPF: " + resultados.getString("cpf"));
        }
        
        conexao.close();
    }
}
