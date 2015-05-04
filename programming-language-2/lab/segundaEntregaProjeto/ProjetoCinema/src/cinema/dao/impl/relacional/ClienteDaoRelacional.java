package cinema.dao.impl.relacional;

import cinema.dao.api.ClienteDaoInterface;
import cinema.dominio.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDaoRelacional implements ClienteDaoInterface {
    
    private ConexaoInterface connection;
    private Statement st;

    public ClienteDaoRelacional(ConexaoInterface connection) throws SQLException {
        this.connection = connection;
        this.st = connection.getConnection().createStatement();
    }
    
    @Override
    public List<Cliente> listarTudo() {
        List<Cliente> clientes;
        clientes = new ArrayList<>();
        
        try {
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
            String sql = "insert into cliente values (" + c.getId() + ",'" + c.getNome() + "'," + c.isBeneficiario() + ")";
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void remover(Cliente c) {
        try {
            String sql = "delete from cliente where idcliente = " + c.getId();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void atualizar(Cliente c) {
        try {
            String sql = "update cliente set nome = '" + c.getNome() + "', beneficiario = " + c.isBeneficiario() + " where idcliente = " + c.getId();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
