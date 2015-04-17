package cinema.dao.impl.relacional;

import cinema.dao.api.FilmeDaoInterface;
import cinema.dominio.Ator;
import cinema.dominio.Cliente;
import cinema.dominio.Filme;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilmeDaoRelacional implements FilmeDaoInterface {
    
    private ConexaoInterface connection;
    private Statement st;

    public FilmeDaoRelacional(ConexaoInterface connection) throws SQLException {
        this.connection = connection;
        this.st = connection.getConnection().createStatement();
    }
    
    @Override
    public List<Filme> listarTudo() {
        List<Filme> filmes;
        filmes = new ArrayList<>();
       
        try {
            String sql = "select idfilme, titulo, duracao, classificacao, diretor, distribuidora, status, genero, elenco from filme";
            ResultSet resultados = st.executeQuery(sql);
            
            while (resultados.next()) {                
                int idfilme = resultados.getInt("idfilme");
                String titulo = resultados.getString("titulo");
                String duracao = resultados.getString("duracao");
                int classificacao = resultados.getInt("classificacao");
                String diretor = resultados.getString("diretor");
                String distribuidora = resultados.getString("distribuidora");
                String status = resultados.getString("status");
                String genero = resultados.getString("genero");
                Ator idator = new Ator(resultados.getInt("elenco"));
                
                Filme f = new Filme(idfilme, titulo, duracao, classificacao, diretor, distribuidora, status, genero, idator);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return filmes;
    }
    
    @Override
    public void adicionar(Filme f) {
        try {
            String sql = "insert into filmes value (" + f.getId() + "," + f.getTitulo() + "," + f.getDuracao() + "," + f.getClassificacao() + "," + f.getDiretor() + "," + f.getDistribuidora() + "," + f.getStatus() + "," + f.getGenero() + "," + f.getElenco() + ")";
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void remover(Filme f) {
        try {
            String sql = "delete from filme where idfilme = " + f.getId();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void atualizar(Filme f) {
        try {
            String sql  = "update filme set titulo = " + f.getTitulo() + ", duracao = " + f.getDuracao() + ", classificacao = " + f.getClassificacao() + ", diretor = " + f.getDiretor() + ", distribuidora = " + f.getDistribuidora() + ", status = " + f.getStatus() + ", genero = " + f.getGenero() + ", elenco = " + f.getElenco().getId() + " where idfilme = " + f.getId();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
