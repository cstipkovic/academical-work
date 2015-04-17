package cinema.dao.impl.relacional;

import cinema.dao.api.SessaoDaoInterface;
import cinema.dominio.Filme;
import cinema.dominio.Sala;
import cinema.dominio.Sessao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SessaoDaoRelacional implements SessaoDaoInterface {
    
    private ConexaoInterface connection;
    private Statement st;

    public SessaoDaoRelacional(ConexaoInterface connection) throws SQLException {
        this.connection = connection;
        st = connection.getConnection().createStatement();
    }
    
    @Override
    public List<Sessao> listarTudo() {
        List<Sessao> sessoes;
        sessoes = new ArrayList<>();
        
        try {
            String sql = "select idsessao, sala, filme, capacidade, horario, isFull";
            ResultSet resultados = st.executeQuery(sql);
            
            while (resultados.next()) {                
                int id = resultados.getInt("idsessao");
                Sala sala = new Sala(resultados.getInt("sala"));
                Filme filme = new Filme(resultados.getInt("filme"));
                int capacidade = resultados.getInt("capacidade");
                int horario = resultados.getInt("horario");
                boolean isFull = resultados.getBoolean("isFull");
                
                Sessao s = new Sessao(id, sala, filme, capacidade, sql, isFull);
                sessoes.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return sessoes;
    }
    
    @Override
    public void adicionar(Sessao s) {
        try {
            String sql = "insert into sessao value (" + s.getId() + ", " + s.getSala() + ", " + s.getFilme() + ", " + s.getCapacidade() + ", " + s.getHorario() + ", " + s.isIsFull() + ")";
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void remover(Sessao s) {
        try {
            String sql = "delele from sessao where idsessao = " + s.getId();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void atualizar(Sessao s) {
        try {
            String sql = "update sessao set sala = " + s.getSala() + ", filme = " + s.getFilme() + ", capacidade = " + s.getCapacidade() + ", horario = " + s.getHorario() + ", isFull = " + s.isIsFull() + " where idsessao = " + s.getId();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
