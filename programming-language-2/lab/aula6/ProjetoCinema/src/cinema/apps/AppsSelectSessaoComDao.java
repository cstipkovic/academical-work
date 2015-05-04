package cinema.apps;

import cinema.dao.api.SessaoDaoInterface;
import cinema.dao.impl.relacional.ConexaoInterface;
import cinema.dao.impl.relacional.SessaoDaoRelacional;
import cinema.dao.impl.relacional.javadb.ConexaoJavaDB;
import cinema.dominio.Sessao;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;

public class AppsSelectSessaoComDao {

    public static void main(String args[]) throws SQLException {
        
        ConexaoInterface conexao;
        conexao = new ConexaoJavaDB ("app", "app", "127.0.0.1", 1527, "projeto_cinema");
        
        SessaoDaoInterface dao;
        dao = new SessaoDaoRelacional(conexao);
        
        List<Sessao> sessoes;
        sessoes = dao.listarTudo();
        
        for (Sessao s : sessoes) {
            System.out.print("Nro: " + s.getId());
            System.out.print(" - ");
            System.out.print("Sala: " + s.getSala());
            System.out.print(" - ");
            System.out.print("Filme: " + s.getFilme());
            System.out.print(" - ");
            System.out.print("Capacidade: " + s.getCapacidade());
            System.out.print(" - ");
            System.out.print("Horario: " + s.getHorario());
            System.out.print(" - ");
            System.out.print("Sessão cheia: " + s.isFull());
            System.out.print(" - ");
        }
        
        Sessao s;

        Time hora;
        hora = new Time(10, 10, 00);
        s = new Sessao(1, 1, 1, 1, hora, true);
        dao.adicionar(s);
        
        // Update
        s.setFull(false);
        dao.atualizar(s);
        
        // Delete
        dao.remover(s);
    }
}
