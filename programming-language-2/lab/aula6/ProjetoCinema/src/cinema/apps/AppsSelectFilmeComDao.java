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
            System.out.print("Titulo: " + f.getTitulo());
            System.out.print(" - ");
            System.out.print("Duração: " + f.getDuracao());
            System.out.print(" - ");
            System.out.print("Diretor: " + f.getDiretor());
            System.out.print(" - ");
            System.out.print("Distribuidora: " + f.getDistribuidora());
            System.out.print(" - ");
            System.out.print("Status: " + f.getStatus());
            System.out.print(" - ");
            System.out.print("Genero: " + f.getGenero());
            System.out.print(" - ");
            System.out.println("Elenco: " + f.getElenco());
        }
        
        Filme f;

        // Adicionar
        f = new Filme(1, "Filme 1", "2 horas", 10, "Diretor 1", "Distribuicao 1", "Status 1", "Genero 1", 1);
        dao.adicionar(f);
        
        // Update
        f.setClassificacao(12);
        dao.atualizar(f);
        
        // Delete
        dao.remover(f);
    }
}
