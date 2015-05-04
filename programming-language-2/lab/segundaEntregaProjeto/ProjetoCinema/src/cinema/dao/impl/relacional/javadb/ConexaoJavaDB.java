package cinema.dao.impl.relacional.javadb;

import cinema.dao.impl.relacional.ConexaoInterface;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoJavaDB implements ConexaoInterface {

    private String usuario;
    private String senha;
    private String hostname;
    private int porta;
    private String nomeDB;
    private Connection connection;

    public ConexaoJavaDB(String usuario, String senha, String hostname, int porta, String nomeDB) {
        this.usuario = usuario;
        this.senha = senha;
        this.hostname = hostname;
        this.porta = porta;
        this.nomeDB = nomeDB;
    }
    
    @Override
    public Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                String url = "jdbc:derby://" + hostname + ":" + porta + "/" + nomeDB;
                connection = DriverManager.getConnection(url, usuario, senha);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return connection;
    }
    
    @Override
    public void close() {
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
