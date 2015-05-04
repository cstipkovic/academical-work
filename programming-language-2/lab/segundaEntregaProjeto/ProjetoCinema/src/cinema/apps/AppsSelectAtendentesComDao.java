package cinema.apps;

import cinema.dao.api.AtendenteDaoInterface;
import cinema.dao.impl.relacional.AtendenteDaoRelacional;
import cinema.dao.impl.relacional.ConexaoInterface;
import cinema.dao.impl.relacional.javadb.ConexaoJavaDB;
import cinema.dominio.Atendente;
import java.sql.SQLException;
import java.util.List;

public class AppsSelectAtendentesComDao {
    
    public static void main(String args[]) throws SQLException {
    
        ConexaoInterface conexao;
        conexao = new ConexaoJavaDB ("app", "app", "127.0.0.1", 1527, "projeto_cinema");
        
        AtendenteDaoInterface dao;
        dao = new AtendenteDaoRelacional(conexao);
        
        List<Atendente> atendentes;
        atendentes = dao.listarTudo();
        
        for (Atendente a : atendentes) {
            System.out.print("Nro: " + a.getId());
            System.out.print(" - ");
            System.out.print("Nome: " + a.getNome());
            System.out.print(" - ");
            System.out.println("Gerente: " + a.getIdgerente());
        }
        
        Atendente a;

        // Adicionar
        a = new Atendente(1, "Atendente 1", 1);
        dao.adicionar(a);
        
        // Update
        a.setIdgerente(101);
        dao.atualizar(a);
        
        // Delete
        dao.remover(a);
    }
}
