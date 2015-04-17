package cinema.apps;

import cinema.dao.api.IngressoDaoInterface;
import cinema.dao.impl.relacional.ConexaoInterface;
import cinema.dao.impl.relacional.IngressoDaoRelacional;
import cinema.dao.impl.relacional.javadb.ConexaoJavaDB;
import cinema.dominio.Ingresso;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public class AppsSelectIngressoComDao {

    public static void main(String args[]) throws SQLException {
        
        ConexaoInterface conexao;
        conexao = new ConexaoJavaDB ("app", "app", "127.0.0.1", 1527, "projeto_cinema");
        
        IngressoDaoInterface dao;
        dao = new IngressoDaoRelacional(conexao);
        
        List<Ingresso> ingressos;
        ingressos = dao.listarTudo();
        
        for (Ingresso i : ingressos) {
            System.out.print("Nro: " + i.getId());
            System.out.print(" - ");
            System.out.print("Sessao: " + i.getSessao());
            System.out.print(" - ");
            System.out.print("Beneficiario: " + i.getBeneficiario());
            System.out.print(" - ");
            System.out.print("Valor: " + i.getValor());
            System.out.print(" - ");
            System.out.println("Atendente: " + i.getAtendente());
        }
        
        Ingresso i;

        // Adicionar
        BigDecimal b = new BigDecimal(60);
        i = new Ingresso(1, 1, 1, b, 1);
        dao.adicionar(i);
        
        // Update
        i.setSessao(2);
        dao.atualizar(i);
        
        // Delete
        dao.remover(i);
    }
}
