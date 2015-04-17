package cinema.apps;

import cinema.dao.api.FilmeDaoInterface;
import cinema.dao.impl.relacional.ConexaoInterface;
import cinema.dao.impl.relacional.FilmeDaoRelacional;
import cinema.dao.impl.relacional.javadb.ConexaoJavaDB;
import cinema.dominio.Filme;
import java.sql.SQLException;
import java.util.List;

public class AppsSelectFilmeComDao {

    public static void main(String args[]) throws SQLException {
        
        ConexaoInterface conexao;
        conexao = new ConexaoJavaDB("app", "app", "127.0.0.1", 1527, "projeto_cinema");
        
        FilmeDaoInterface dao;
        dao = new FilmeDaoRelacional(conexao);
        
        List<Filme> filmes;
        filmes = dao.listarTudo();
        
        for (Filme f : filmes) {
            System.out.print("Nro: " + f.getId());
            System.out.print(" - ");
            System.out.print("Nome: " + f.getNome());
            System.out.print(" - ");
            System.out.print("Nacionalidade: " + f.getNacionalidade());
            System.out.print(" - ");
            System.out.print("Idade: " + f.getIdade());
        }
        
        Filme f;

        // Adicionar
        f = new Filme();
        dao.adicionar(f);
        
        // Update
        f.setIdade(31);
        dao.atualizar(f);
        
        // Delete
        dao.remover(f);
    }
}
