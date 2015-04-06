package cinema.dao.impl.relacional;

import cinema.dao.api.SalaDaoInterface;
import cinema.dominio.Sala;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SalaDaoRelacional implements SalaDaoInterface {
    private ConexaoInterface connection;

    public SalaDaoRelacional(ConexaoInterface connection) {
        this.connection = connection;
    }
    
    @Override
    public List<Sala> listarTudo() {
        List<Sala> salas;
        salas = new ArrayList<>();
        
        try {
            Statement st;
            st = connection.getConnection().createStatement();
            
            String sql = "select idsala, capacidade, poltronaEspecialDiferenciada, emManutencao";
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
            Statement st;
            st = connection.getConnection().createStatement();
            
            String sql = "insert into sala value (" + s.getId() + "," + s.getCapacidade() + ", " + s.getPoltronaEspecialDiferenciada() + ", " + s.isEmManutencao() + ")";
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void remover(Sala s) {
        try {
            Statement st;
            st = connection.getConnection().createStatement();
            
            String sql = "delele from sala where idsala = " + s.getId();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void atualizar(Sala s) {
        try {
            Statement st;
            st = connection.getConnection().createStatement();
            
            String sql = "update sala set capacidade = " + s.getCapacidade() + ", poltronaEspecialDiferenciada = " + s.getPoltronaEspecialDiferenciada() + ", emManutencao = " + s.isEmManutencao() + " where idsala = " + s.getId(); ;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
