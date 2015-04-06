package cinema.dao.impl.relacional;

import cinema.dao.api.GerenteDaoInterface;
import cinema.dominio.Gerente;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GerenteDaoRalacional implements GerenteDaoInterface {

    private ConexaoInterface connection;

    public GerenteDaoRalacional(ConexaoInterface connection) {
        this.connection = connection;
    }
    
    @Override
    public List<Gerente> listarTudo() {
        List<Gerente> gerentes;
        gerentes = new ArrayList<>();
        
        try {
            Statement st;
            st = connection.getConnection().createStatement();
            
            String sql = "select idgerente, nome from gerente";
            ResultSet resultados = st.executeQuery(sql);
            
            while (resultados.next()) {                
                int id = resultados.getInt("idgerente");
                String nome = resultados.getString("nome");
                
                Gerente g = new Gerente(id, nome);
                gerentes.add(g);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return gerentes;
    }
    
    @Override
    public void adicionar(Gerente g) {
        try {
            Statement st;
            st = connection.getConnection().createStatement();
            
            String sql = "insert into gerente value (" + g.getId() + "," + g.getNome() + ")";
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void remover(Gerente g) {
        try {
            Statement st;
            st = connection.getConnection().createStatement();
            
            String sql = "delele from gerente where idgerente = " + g.getId();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void atualizar(Gerente g) {
        try {
            Statement st;
            st = connection.getConnection().createStatement();
            
            String sql = "update gerente set nome = " + g.getNome() + " where idgerente = " + g.getId();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
