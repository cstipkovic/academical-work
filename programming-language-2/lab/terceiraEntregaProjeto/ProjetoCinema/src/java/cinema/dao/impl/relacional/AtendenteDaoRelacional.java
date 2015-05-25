package cinema.dao.impl.relacional;

import cinema.dao.api.AtendenteDaoInterface;
import cinema.model.Atendente;
import cinema.model.Gerente;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AtendenteDaoRelacional implements AtendenteDaoInterface {

    private ConnectionInterface connection;
    private Statement st;

    public AtendenteDaoRelacional(ConnectionInterface connection) throws SQLException {
        this.connection = connection;
        this.st = connection.getConnection().createStatement();
    }
    
    @Override
    public List<Atendente> listarTudo() {
        List<Atendente> atendentes;
        atendentes = new ArrayList<>();
        
        try {
            String sql = "select idatendente, nome, idgerente from atendente";
            ResultSet resultados = st.executeQuery(sql);
            
            while (resultados.next()) {                
                int id = resultados.getInt("idatendente");
                String nome = resultados.getString("nome");
                int idgerente = resultados.getInt("idgerente");
                
                Atendente a = new Atendente(id, nome, idgerente);
                atendentes.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return atendentes;
    }
    
    @Override
    public void adicionar(Atendente a) {
        try {
            String sql = "insert into atendente values (" + a.getId() + ",'" + a.getNome() + "'," + a.getIdgerente() + ")";
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void remover(Atendente a) {
        try {
            String sql = "delete from atendente where idatendente = " + a.getId();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void atualizar(Atendente a) {
        try {
            String sql = "update atendente set nome = '" + a.getNome() + "', gerente = " + a.getIdgerente() + "where idatendente = " + a.getId();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
