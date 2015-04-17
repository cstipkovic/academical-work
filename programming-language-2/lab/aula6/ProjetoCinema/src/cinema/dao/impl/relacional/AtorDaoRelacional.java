package cinema.dao.impl.relacional;

import cinema.dao.api.AtorDaoInterface;
import cinema.dominio.Ator;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AtorDaoRelacional implements AtorDaoInterface {
    
    private ConexaoInterface connection;
    private Statement st;

    public AtorDaoRelacional(ConexaoInterface connection) throws SQLException {
        this.connection = connection;
        this.st = connection.getConnection().createStatement();
    }
    
    @Override
    public List<Ator> listarTudo() {
        List<Ator> atores;
        atores = new ArrayList<>();
        try {
            String sql = "select idator, nome, nacionalidade, idade from ator";
            ResultSet resultados = st.executeQuery(sql);
            
            while (resultados.next()) {                
                int id  = resultados.getInt("idator");
                String nome = resultados.getString("nome");
                String nacionalidade = resultados.getString("nacionalidade");
                int idade = resultados.getInt("idade");
                
                Ator a = new Ator(id, nome, nacionalidade, idade);
                atores.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return atores;
    }
    
    @Override
    public void adicionar(Ator a) {
        try {
            String sql = "insert into ator value (" + a.getId() + "," + a.getNome() + "," + a.getNacionalidade() + "," + a.getIdade() + ")";
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void remover(Ator a) {
        try {
            String sql = "delete from ator where idator = " + a.getId();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void atualizar(Ator a) {
        try {
            String sql = "update ator set nome = " + a.getNome() + ", nacionalidade = " + a.getNacionalidade() + ", idade = " + a.getIdade() + " where idator = " + a.getId();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
