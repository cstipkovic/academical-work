package cinema.apps;

import cinema.dao.api.SalaDaoInterface;
import cinema.dao.impl.relacional.ConexaoInterface;
import cinema.dao.impl.relacional.SalaDaoRelacional;
import cinema.dao.impl.relacional.javadb.ConexaoJavaDB;
import cinema.dominio.Sala;
import java.sql.SQLException;
import java.util.List;

public class AppsSelectSalaComDao {

    public static void main(String args[]) throws SQLException {
        
        ConexaoInterface conexao;
        conexao = new ConexaoJavaDB ("app", "app", "127.0.0.1", 1527, "projeto_cinema");
        
        SalaDaoInterface dao;
        dao = new SalaDaoRelacional(conexao);
        
        List<Sala> salas;
        salas = dao.listarTudo();
        
        for (Sala s : salas) {
            System.out.print("Nro: " + s.getId());
            System.out.print(" - ");
            System.out.print("Capacidade: " + s.getId());
            System.out.print(" - ");
            System.out.print("Poltrona Especial diferenciada: " + s.getPoltronaEspecialDiferenciada());
            System.out.print(" - ");
            System.out.println("Em manutenção: " + s.isEmManutencao());
        }
        
        Sala s;

        // Adicionar
        s = new Sala(1, 110, 10, true);
        dao.adicionar(s);
        
        // Update
        s.setEmManutencao(false);
        dao.atualizar(s);
        
        // Delete
        dao.remover(s);
    }
}
