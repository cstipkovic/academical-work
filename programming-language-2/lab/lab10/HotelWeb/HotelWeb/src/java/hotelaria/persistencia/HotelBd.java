package hotelaria.persistencia;

import hotelaria.modelo.Hotel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

public class HotelBd {
    
    public List<Hotel> ler() {
        List<Hotel> hoteis = new ArrayList<Hotel>();
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String dbUrl = "jdbc:derby://localhost:1527/Hotelaria";
            Connection connection = DriverManager.getConnection(dbUrl, "APP", "app");
            Statement st = connection.createStatement();
            String query = "select id, nome, logradouro, numero from app.hotel";
            ResultSet result = st.executeQuery(query);
            while (result.next()) {
                Hotel h = new Hotel();
                h.setId(result.getLong("id"));
                h.setNome(result.getString("nome"));
                h.setLogradouro(result.getString("logradouro"));
                h.setNumero(result.getInt("numero"));
                hoteis.add(h);
            }
            
            st.close();
        } catch (ClassNotFoundException e) {
            System.err.println("erro carregando o driver: " + e);
        } catch (SQLException e) {
            System.err.println("erro SQL: " + e);
        }
        
        return hoteis;
    }
    
    public void adicionar(Hotel hotel) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String dbUrl = "jdbc:derby://localhost:1527/Hotelaria";
            Connection connection = DriverManager.getConnection(dbUrl, "APP", "app");
            String query = "insert into app.hotel (nome, logradouro, numero) values (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, hotel.getNome());
            ps.setString(2, hotel.getLogradouro());
            ps.setInt(3, hotel.getNumero());
            ps.executeUpdate();
            
            ps.close();
        } catch (ClassNotFoundException e) {
            System.err.println("erro carregando o driver: " + e);
        } catch (SQLException e) {
            System.err.println("erro SQL: " + e);
        }
    }
}
