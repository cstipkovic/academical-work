package banco.apps;

import banco.dao.api.ContaDaoInterface;
import banco.dao.impl.relacional.ConexaoInterface;
import banco.dao.impl.relacional.ContaDaoRelacional;
import banco.dao.impl.relacional.javadb.ConexaoJavaDB;
import banco.dominio.Conta;
import java.math.BigDecimal;
import java.util.List;

public class AppSelectContasComDao {

    public static void main (String args[]) {
        ConexaoInterface conexao;
        conexao = new ConexaoJavaDB("app", "app", "127.0.0.1", 1527, "sistema_bancario");
        ContaDaoInterface dao;
        dao = new ContaDaoRelacional(conexao);
        List<Conta> todasContas;
        todasContas = dao.listarTudo();
        
        for (Conta c : todasContas) {
            System.out.print("Nro: " + c.getNumero());
            System.out.print(" - ");
            System.out.println("Saldo: R$" + c.getSaldo());
        }
        
        Conta c;

        // Adicionar
        BigDecimal b = new BigDecimal(500);
        c = new Conta(127, b);
        dao.adicionar(c);
        
        // Update
        b = new BigDecimal(1500);
        c.setSaldo(b);
        dao.atualizar(c);
        
        // Delete
        dao.remover(c);
    }
}
