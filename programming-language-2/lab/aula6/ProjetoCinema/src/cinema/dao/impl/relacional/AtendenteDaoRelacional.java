package cinema.dao.impl.relacional;

import cinema.dao.api.AtendenteDaoInterface;
import cinema.dominio.Atendente;
import cinema.dominio.Gerente;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AtendenteDaoRelacional implements AtendenteDaoInterface {

    private ConexaoInterface connection;

    public AtendenteDaoRelacional(ConexaoInterface connection) {
        this.connection = connection;
    }
    
    @Override
    public List<Atendente> listarTudo() {
        List<Atendente> atendentes;
        atendentes = new ArrayList<>();
        try {
            Statement st;
            st = connection.getConnection().createStatement();
            String sql = "select idatendente, nome, gerente from atendente";
            ResultSet resultados = st.executeQuery(sql);
            
            while (resultados.next()) {                
                int id = resultados.getInt("idatendente");
                String nome = resultados.getString("nome");
                Gerente gerente = new Gerente(resultados.getString("gerente"));
                Atendente a = new Atendente(id, nome, gerente);
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
            Statement st;
            st = connection.getConnection().createStatement();
            String sql = "insert into atendente values (" + a.getNome() + "," + a.getGerente().getNome() + ")";
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void remover(Atendente a) {
        try {
            Statement st;
            st = connection.getConnection().createStatement();
            String sql = "delete from atendente where idatendente= " + a.getId();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void atualizar(Atendente a) {
        try {
            Statement st;
            st = connection.getConnection().createStatement();
            String sql = "update atendente set nome = " + a.getNome() + ", gerente = " + a.getGerente().getNome() + "where idatendente = " + a.getId();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
