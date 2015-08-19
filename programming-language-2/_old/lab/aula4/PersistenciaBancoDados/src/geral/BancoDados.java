package geral;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDados {
    
    private String url;
    private String usuario;
    private String senha;

    public BancoDados() throws ClassNotFoundException{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        this.url = "jdbc:derby://127.0.0.1:1527/sistema_bancario";
        this.usuario = "app";
        this.senha = "app";
    }
    
    public Connection Conectar() throws SQLException {
        Connection conexao;
        conexao = DriverManager.getConnection(url, usuario, senha);
        
        return conexao;
    }
}
