package cinema.apps;

import cinema.dao.api.ClienteDaoInterface;
import cinema.dao.impl.relacional.ClienteDaoRelacional;
import cinema.dao.impl.relacional.ConexaoInterface;
import cinema.dao.impl.relacional.javadb.ConexaoJavaDB;
import cinema.dominio.Cliente;
import java.sql.SQLException;
import java.util.List;

public class AppsSelectClienteComDao {

    public static void main(String args[]) throws SQLException {
    
        ConexaoInterface conexao;
        conexao = new ConexaoJavaDB("app", "app", "127.0.0.1", 1527, "projeto_cinema");
        
        ClienteDaoInterface dao;
        dao = new ClienteDaoRelacional(conexao);
        
        List<Cliente> clientes;
        clientes = dao.listarTudo();
        
        for (Cliente c : clientes) {
            System.out.print("Nro: " + c.getId());
            System.out.print(" - ");
            System.out.print("Nome: " + c.getNome());
            System.out.print(" - ");
            System.out.print("Beneficiario: " + c.isBeneficiario());
        }
        
        Cliente c;

        // Adicionar
        c = new Cliente(1, "Cliente 1", true);
        dao.adicionar(c);
        
        // Update
        c.setNome("Cliente 01");
        dao.atualizar(c);
        
        // Delete
        dao.remover(c);
    }
}
