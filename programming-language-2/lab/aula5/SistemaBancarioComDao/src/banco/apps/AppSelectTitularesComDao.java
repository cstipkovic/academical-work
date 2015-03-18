package banco.apps;

import banco.dao.api.TitularDaoInterface;
import banco.dao.impl.relacional.ConexaoInterface;
import banco.dao.impl.relacional.TitularDaoRelacional;
import banco.dao.impl.relacional.javadb.ConexaoJavaDB;
import banco.dominio.Titular;
import java.util.List;

public class AppSelectTitularesComDao {

    public static void main(String args[]) {
        
        ConexaoInterface conexao;
        conexao = new ConexaoJavaDB("app", "app", "127.0.0.1", 1527, "sistema_bancario");
        TitularDaoInterface dao;
        dao = new TitularDaoRelacional(conexao);
        List<Titular> todosTitulares;
        todosTitulares = dao.listarTudo();
        
        for (Titular t : todosTitulares) {
            System.out.print("Nro: " + t.getNumero());
            System.out.print(" - ");
            System.out.print("Nome: " + t.getNome());
            System.out.print(" - ");
            System.out.println("RG: " + t.getRg());
            System.out.print(" - ");
            System.out.println("CPF: " + t.getCpf());
        }
    }
}
