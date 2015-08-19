package hotelaria.persistencia;

import hotelaria.modelo.Hotel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cstipkovic
 */
public class HotelBd {

    public List<Hotel> ler() {
        List<Hotel> hoteis = new ArrayList<Hotel>();
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String dbUrl = "jdbc:derby://localhost:1527/Hotelaria";
            Connection connection = DriverManager.getConnection(dbUrl, "APP", "APP");
            Statement statement = connection.createStatement();
            String query = "select id, nome, logradouro, numero from app.hotel";
            ResultSet result = statement.executeQuery(query);
            
            while (result.next()) {                
                Hotel h = new Hotel();
                h.setId(result.getLong("id"));
                h.setNome(result.getString("nome"));
                h.setLogradouro(result.getString("logradouro"));
                h.setNumero(result.getInt("numero"));
                hoteis.add(h);
            }
        } catch (ClassNotFoundException e) {
            System.err.println("erro carregando o driver" + e);
        } catch (SQLException e) {
            System.err.println("erro SQL: " + e);
        }
        
        return hoteis;
    }
}
