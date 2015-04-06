package cinema.dao.impl.relacional;

import cinema.dao.api.IngressoDaoInterface;
import cinema.dominio.Atendente;
import cinema.dominio.Cliente;
import cinema.dominio.Ingresso;
import cinema.dominio.Sessao;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class IngressoDaoRelacional implements IngressoDaoInterface {
    
    private ConexaoInterface connection;

    public IngressoDaoRelacional(ConexaoInterface connection) {
        this.connection = connection;
    }
    
    @Override
    public List<Ingresso> listarTudo() {
        List<Ingresso> ingressos;
        ingressos = new ArrayList<>();
        
        try {
            Statement st;
            st = connection.getConnection().createStatement();
            
            String sql = "select idingresso, sessao, beneficiario, valor, atendente from ingresso";
            ResultSet resuldados = st.executeQuery(sql);
            
            while (resuldados.next()) {                
                int id = resuldados.getInt("idingresso");
                Sessao sessao = new Sessao(resuldados.getInt("sessao"));
                Cliente beneficiario = new Cliente(resuldados.getInt("beneficiario"));
                BigDecimal valor = resuldados.getBigDecimal("valor");
                Atendente atendente = new Atendente(resuldados.getInt("atendente"));
                
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
            Statement st;
            st = connection.getConnection().createStatement();
            
            String sql = "insert into ingresso value (" + i.getId() + "," + i.getSessao().getId() + "," + i.getBeneficiario().getId() + ", " + i.getValor() + ", " + i.getAtendente().getId() + ")";
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void remover(Ingresso i) {
        try {
            Statement st;
            st = connection.getConnection().createStatement();
            
            String sql = "delete from ingresso where idingresso =" + i.getId();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void atualizar(Ingresso i) {
        try {
            Statement st;
            st = connection.getConnection().createStatement();
            
            String sql = "update ingresso set sessao = " + i.getSessao().getId() + ", beneficiario = " + i.getBeneficiario().getId() + ", valor = " + i.getValor() + ", atendente = " + i.getAtendente().getId() + " where idingresso = " + i.getId();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
