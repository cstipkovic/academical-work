package cinema.dao.impl.relacional;

import cinema.dao.api.FilmeDaoInterface;
import cinema.model.Filme;
import cinema.model.Sala;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FilmeDaoRelacional implements FilmeDaoInterface {
    
    private ConnectionInterface connection;
    private Statement st;

    public FilmeDaoRelacional(ConnectionInterface connection) throws SQLException {
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
                int idator = resultados.getInt("elenco");
                
                Filme f = new Filme(idfilme, titulo, duracao, classificacao, diretor, distribuidora, status, genero, idator);
                filmes.add(f);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return filmes;
    }
    
    @Override
    public void adicionar(Filme f) {
        try {
            String sql = "insert into filmes values (" + f.getId() + ",'" + f.getTitulo() + "','" + f.getDuracao() + "'," + f.getClassificacao() + ",'" + f.getDiretor() + "','" + f.getDistribuidora() + "','" + f.getStatus() + "','" + f.getGenero() + "'," + f.getElenco() + ")";
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
            String sql  = "update filme set titulo = '" + f.getTitulo() + "', duracao = '" + f.getDuracao() + "', classificacao = " + f.getClassificacao() + ", diretor = '" + f.getDiretor() + "', distribuidora = '" + f.getDistribuidora() + "', status = '" + f.getStatus() + "', genero = '" + f.getGenero() + "', elenco = " + f.getElenco() + " where idfilme = " + f.getId();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public List<String> listarSalasFilme(int id) {
        List<String> salas;
        salas = new ArrayList<>();
        
        String sql = "select sala from sessao where filme = " + id;
        
        try {
            ResultSet resultados = st.executeQuery(sql);
            
            while (resultados.next()) {
                String sala;
                sala = Integer.toString(resultados.getInt("sala"));
                salas.add(sala);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return salas;
    }
}
