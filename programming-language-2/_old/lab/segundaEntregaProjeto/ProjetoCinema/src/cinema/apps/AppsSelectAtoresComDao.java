package cinema.apps;

import cinema.dao.api.AtorDaoInterface;
import cinema.dao.impl.relacional.AtorDaoRelacional;
import cinema.dao.impl.relacional.ConexaoInterface;
import cinema.dao.impl.relacional.javadb.ConexaoJavaDB;
import cinema.dominio.Ator;
import java.sql.SQLException;
import java.util.List;

public class AppsSelectAtoresComDao {

    public static void main(String args[]) throws SQLException {
        ConexaoInterface conexao;
        conexao = new ConexaoJavaDB("app", "app", "127.0.0.1", 1527, "projeto_cinema");
        
        AtorDaoInterface dao;
        dao = new AtorDaoRelacional(conexao);
        
        List<Ator> atores;
        atores = dao.listarTudo();
        
        for (Ator a : atores) {
            System.out.print("Nro: " + a.getId());
            System.out.print(" - ");
            System.out.print("Nome: " + a.getNome());
            System.out.print(" - ");
            System.out.print("Nacionalidade: " + a.getNacionalidade());
            System.out.print(" - ");
            System.out.print("Idade: " + a.getIdade());
        }
        
        Ator a;

        // Adicionar
        a = new Ator(100, "Ator 1", "brasileiro", 30);
        dao.adicionar(a);
        
        // Update
        a.setIdade(31);
        dao.atualizar(a);
        
        // Delete
        dao.remover(a);
    }
}
