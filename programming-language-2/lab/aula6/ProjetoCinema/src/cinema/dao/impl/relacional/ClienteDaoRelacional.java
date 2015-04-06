package cinema.dao.impl.relacional;

import cinema.dao.api.ClienteDaoInterface;
import cinema.dominio.Cliente;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoRelacional implements ClienteDaoInterface {
    
    private ConexaoInterface connection;

    public ClienteDaoRelacional(ConexaoInterface connection) {
        this.connection = connection;
    }
    
    @Override
    public List<Cliente> listarTudo() {
        List<Cliente> clientes;
        clientes = new ArrayList<>();
        
        try {
            Statement st;
            st = connection.getConnection().createStatement();
            
            String sql = "select idcliente, nome, beneficiario from cliente";
            ResultSet resultados = st.executeQuery(sql);
            
            while (resultados.next()) {                
                int id = resultados.getInt("idcliente");
                String nome = resultados.getString("nome");
                boolean beneficiario = resultados.getBoolean("beneficiario");
                
                Cliente c = new Cliente(id, nome, beneficiario);
                clientes.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return clientes;        
    }
    
    @Override
    public void adicionar(Cliente c) {
        try {
            Statement st;
            st = connection.getConnection().createStatement();
            
            String sql = "insert into cliente value (" + c.getId() + "," + c.getNome() + "," + c.isBeneficiario() + ")";
            st.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void remover(Cliente c) {
        try {
            Statement st;
            st = connection.getConnection().createStatement();
            
            String sql = "delele from cliente where idcliente = " + c.getId();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void atualizar(Cliente c) {
        try {
            Statement st;
            st = connection.getConnection().createStatement();
            
            String sql = "update cliente set nome = " + c.getNome() + ", beneficiario = " + c.isBeneficiario() + " where idcliente = " + c.getId();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
