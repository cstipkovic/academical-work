package cinema.dao.impl.relacional;

import cinema.dao.api.SalaDaoInterface;
import cinema.dominio.Sala;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SalaDaoRelacional implements SalaDaoInterface {
    
    private ConexaoInterface connection;
    private Statement st;

    public SalaDaoRelacional(ConexaoInterface connection) throws SQLException {
        this.connection = connection;
        this.st = connection.getConnection().createStatement();
    }
    
    @Override
    public List<Sala> listarTudo() {
        List<Sala> salas;
        salas = new ArrayList<>();
        
        try {
            String sql = "select idsala, capacidade, poltronaEspecialDiferenciada, emManutencao from sala";
            ResultSet resultados = st.executeQuery(sql);
            
            while (resultados.next()) {
                int id = resultados.getInt("idsala");
                int capacidade = resultados.getInt("capacidade");
                int poltronaEspecialDiferenciada = resultados.getInt("poltronaEspecialDiferenciada");
                boolean emManutencao = resultados.getBoolean("emManutencao");
                
                Sala s = new Sala(id, capacidade, poltronaEspecialDiferenciada, emManutencao);
                salas.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return salas;
    }
    
    @Override
    public void adicionar(Sala s) {
        try {
            String sql = "insert into sala values (" + s.getId() + "," + s.getCapacidade() + ", " + s.getPoltronaEspecialDiferenciada() + ", " + s.isEmManutencao() + ")";
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void remover(Sala s) {
        try {
            String sql = "delele from sala where idsala = " + s.getId();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void atualizar(Sala s) {
        try {
            String sql = "update sala set capacidade = " + s.getCapacidade() + ", poltronaEspecialDiferenciada = " + s.getPoltronaEspecialDiferenciada() + ", emManutencao = " + s.isEmManutencao() + " where idsala = " + s.getId(); ;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public List<String> listarFilmesSala(int id) {
        List<String> filmes;
        filmes = new ArrayList<>();
        
        try {
            String sql = "select distinct F.titulo from filme F, sessao S where (S.sala = " + id + ") and (F.idfilme = S.filme)";
            ResultSet resultados = st.executeQuery(sql);
            
            while (resultados.next()) {
                String titulo = resultados.getString("titulo");
                
                filmes.add(titulo);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return filmes;
    } 
}
