package ingresso.dao.impl.realacional;

import ingresso.dao.api.SalaDaoInterface;
import ingresso.dominio.Sala;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SalaDaoRelacional implements SalaDaoInterface {
    
    private ConexaoInterface conexao;

    public SalaDaoRelacional(ConexaoInterface conexao) {
        this.conexao = conexao;
    }
    
    @Override
    public List<Sala> listarTudo() {
        List<Sala> salas;
        salas = new ArrayList<>();
        
        try {
            Statement st;
            st = conexao.getConnection().createStatement();
            String sql = "select nro_sala, capacidade, qt_poltrona_especial, em_manutencao from salas";
            ResultSet resultados = st.executeQuery(sql);
            
            while (resultados.next()) {                
                long n = resultados.getLong("nro_sala");
                int c = resultados.getInt("capacidade");
                int pe = resultados.getInt("qt_poltrona_especial");
                boolean em = resultados.getBoolean("em_manutencao");
                
                Sala s = new Sala(n, pe, pe, em);
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
            Statement st;
            st = conexao.getConnection().createStatement();
            String sql = "insert into salas values (" + s.getNumero() + "," + s.getCapacidade() + "," + s.getQtPoltronaEspecial() + "," + s.isEmManutencao() + ")";
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void remover(Sala s) {
        try {
            Statement st;
            st = conexao.getConnection().createStatement();
            String sql = "delete from salas where nro_sala = " + s.getNumero();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void atualizar(Sala s) {
        try {
            Statement st;
            st = conexao.getConnection().createStatement();
            String sql = "update salas set capacidade = " + s.getCapacidade() + ", qt_poltrona_especial = " + s.getQtPoltronaEspecial() + ", em_manutencao = " + s.isEmManutencao() + " where nro_sala = " + s.getNumero();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public Sala buscarPeloNumero(long nroSala) {
        Sala sala = null;
        try {
            Statement st;
            st = conexao.getConnection().createStatement();
            String sql = "select nro_sala, capacidade, qt_poltrona_especial, em_manutencao from salas where nro_sala = " + nroSala;
            ResultSet resultados = st.executeQuery(sql);
            
            while (resultados.next()) {
                if (resultados.getLong("nro_sala") == nroSala) {
                    long numero = resultados.getLong("nro_sala");
                    int capacidade = resultados.getInt("capacidade");
                    int qtPoltronaEspecial = resultados.getInt("qt_poltrona_especial");
                    boolean emManutencao = resultados.getBoolean("em_manutencao");
                    
                    Sala s = new Sala(numero, capacidade, qtPoltronaEspecial, emManutencao);
                    sala = s;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return sala;
    }
}
