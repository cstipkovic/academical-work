package ingresso.dao.impl.relacional.javadb;

import ingresso.dao.impl.realacional.ConexaoInterface;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoJavaDB implements ConexaoInterface{
    
   private String usuario;
   private String senha;
   private String hostname;
   private int porta;
   private String nomeDB;
   private Connection conexao;

    public ConexaoJavaDB(String usuario, String senha, String hostname, int porta, String nomeDB) {
        this.usuario = usuario;
        this.senha = senha;
        this.hostname = hostname;
        this.porta = porta;
        this.nomeDB = nomeDB;
    }
    
    @Override
    public Connection getConnection() {
        if (conexao == null) {
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                String url = "jdbc:derby://" + hostname + ":" + porta + "/" + nomeDB;
                conexao = DriverManager.getConnection(url, usuario, senha);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return conexao;
    }
    
    @Override
    public void close() {
        try {
            conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
