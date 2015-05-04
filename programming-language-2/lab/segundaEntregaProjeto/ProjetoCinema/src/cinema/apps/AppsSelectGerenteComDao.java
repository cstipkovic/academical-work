package cinema.apps;

import cinema.dao.api.GerenteDaoInterface;
import cinema.dao.impl.relacional.ConexaoInterface;
import cinema.dao.impl.relacional.GerenteDaoRalacional;
import cinema.dao.impl.relacional.javadb.ConexaoJavaDB;
import cinema.dominio.Gerente;
import java.sql.SQLException;
import java.util.List;

public class AppsSelectGerenteComDao {

    public static void main(String args[]) throws SQLException {
        
        ConexaoInterface conexao;
        conexao = new ConexaoJavaDB ("app", "app", "127.0.0.1", 1527, "projeto_cinema");
        
        GerenteDaoInterface dao;
        dao = new GerenteDaoRalacional(conexao);
        
        List<Gerente> gerentes;
        gerentes = dao.listarTudo();
        
        for (Gerente g : gerentes) {
            System.out.print("Nro: " + g.getId());
            System.out.print(" - ");
            System.out.println("Nome: " + g.getNome());
        }
        
        Gerente g;

        // Adicionar
        g = new Gerente(1, "Gerente 1");
        dao.adicionar(g);
        
        // Update
        g.setNome("Gerente 01");
        dao.atualizar(g);
        
        // Delete
        dao.remover(g);
    }
}
