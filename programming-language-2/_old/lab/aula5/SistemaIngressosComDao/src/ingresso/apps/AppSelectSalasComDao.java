package ingresso.apps;

import ingresso.dao.api.SalaDaoInterface;
import ingresso.dao.impl.realacional.ConexaoInterface;
import ingresso.dao.impl.realacional.SalaDaoRelacional;
import ingresso.dao.impl.relacional.javadb.ConexaoJavaDB;
import ingresso.dominio.Sala;
import java.util.List;

public class AppSelectSalasComDao {
    
    public static void main(String args[]) {
        
        ConexaoInterface conexao;
        conexao = new ConexaoJavaDB("app", "app", "127.0.0.1", 1527, "sistema_ingresso");
        
        SalaDaoInterface dao;
        dao = new SalaDaoRelacional(conexao);
        
        List<Sala> todasSalas;
        todasSalas = dao.listarTudo();
        
        for (Sala s : todasSalas) {
            System.out.print("Numero: " + s.getNumero() + " - ");
            System.out.print("Capacidade: " + s.getCapacidade() + " - ");
            System.out.print("Poltronas Especiais: " + s.getQtPoltronaEspecial() + " - ");
            System.out.println("Em manutenção: " + s.isEmManutencao());
        }
    }
}
