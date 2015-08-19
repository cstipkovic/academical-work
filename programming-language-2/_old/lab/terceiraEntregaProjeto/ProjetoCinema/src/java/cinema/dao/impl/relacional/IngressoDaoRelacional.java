package cinema.dao.impl.relacional;

import cinema.dao.api.IngressoDaoInterface;
import cinema.model.Atendente;
import cinema.model.Cliente;
import cinema.model.Ingresso;
import cinema.model.Sessao;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class IngressoDaoRelacional implements IngressoDaoInterface {
    
    private ConnectionInterface connection;
    private Statement st;

    public IngressoDaoRelacional(ConnectionInterface connection) throws SQLException {
        this.connection = connection;
        this.st = connection.getConnection().createStatement();
    }
    
    @Override
    public List<Ingresso> listarTudo() {
        List<Ingresso> ingressos;
        ingressos = new ArrayList<>();
        
        try {
            String sql = "select idingresso, sessao, beneficiario, valor, atendente from ingresso";
            ResultSet resuldados = st.executeQuery(sql);
            
            while (resuldados.next()) {                
                int id = resuldados.getInt("idingresso");
                int sessao = resuldados.getInt("sessao");
                int beneficiario = resuldados.getInt("beneficiario");
                BigDecimal valor = resuldados.getBigDecimal("valor");
                int atendente = resuldados.getInt("atendente");
                
                Ingresso s = new Ingresso(id, sessao, beneficiario, valor, atendente);
                ingressos.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ingressos;
    }
    
    @Override
    public void adicionar(Ingresso i) {
        try {
            String sql = "insert into ingresso values (" + i.getId() + "," + i.getSessao() + "," + i.getBeneficiario() + ", " + i.getValor() + ", " + i.getAtendente() + ")";
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void remover(Ingresso i) {
        try {
            String sql = "delete from ingresso where idingresso =" + i.getId();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void atualizar(Ingresso i) {
        try {
            String sql = "update ingresso set sessao = " + i.getSessao() + ", beneficiario = " + i.getBeneficiario() + ", valor = " + i.getValor() + ", atendente = " + i.getAtendente() + " where idingresso = " + i.getId();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
