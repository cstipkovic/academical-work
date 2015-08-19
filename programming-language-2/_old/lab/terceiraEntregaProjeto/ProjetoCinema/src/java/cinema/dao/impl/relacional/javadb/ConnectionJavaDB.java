package cinema.dao.impl.relacional.javadb;

import cinema.dao.impl.relacional.ConnectionInterface;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author cstipkovic
 */
public class ConnectionJavaDB implements ConnectionInterface {

    private String user;
    private String password;
    private String hostname;
    private int port;
    private String nameDB;
    private Connection connection;

    public ConnectionJavaDB(String user, String password, String hostname, int port, String nameDB, Connection connection) {
        this.user = user;
        this.password = password;
        this.hostname = hostname;
        this.port = port;
        this.nameDB = nameDB;
    }
    
    @Override
    public Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                String url = "jdbc:derby://" + hostname + ":" + port + "/" + nameDB;
                connection = DriverManager.getConnection(url, user, password);
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
