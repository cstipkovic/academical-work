package cinema.dao.impl.relacional;

import cinema.dao.api.GerenteDaoInterface;
import cinema.dominio.Gerente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GerenteDaoRalacional implements GerenteDaoInterface {

    private ConexaoInterface connection;
    private Statement st;

    public GerenteDaoRalacional(ConexaoInterface connection) throws SQLException {
        this.connection = connection;
        this.st = connection.getConnection().createStatement();
    }
    
    @Override
    public List<Gerente> listarTudo() {
        List<Gerente> gerentes;
        gerentes = new ArrayList<>();
        
        try {
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
            String sql = "insert into gerente values (" + g.getId() + ",'" + g.getNome() + "')";
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void remover(Gerente g) {
        try {
            String sql = "delele from gerente where idgerente = " + g.getId();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void atualizar(Gerente g) {
        try {
            String sql = "update gerente set nome = '" + g.getNome() + "' where idgerente = " + g.getId();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public List<String> listarAtendentesGerente(int id) {
        List<String> atendentes;
        atendentes = new ArrayList<>();
        
        try {
            String sql = "select nome from atendente where (A.idgerente = " + id + ")";
            ResultSet resultados = st.executeQuery(sql);
            
            while (resultados.next()) {                
                String n = resultados.getString("nome");
                
                atendentes.add(n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return atendentes;
    }
}
