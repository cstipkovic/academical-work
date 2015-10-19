package exercicio4;

import exercicio1.ContaDaoException;
import exercicio2.ContaDaoInterface;
import exercicio3.ContaDaoRelacional;
import java.util.List;

public class AppSelectContasComDao {

    public static void main(String args[]) {
        ConexaoInterface conexao;
        conexao = new ConexaoJavaDB("app", "app", "127.0.0.1", 1527, "sistema_bancario");
        
        ContaDaoInterface dao;
        dao = new ContaDaoRelacional(conexao);
        
        try {
            List<Conta> todasContas;
            todasContas = dao.listarTudo();
            
            for (Conta c : todasContas) {
                System.out.print("Nro: " + c.getNumero());
                System.out.print(" - ");
                System.out.print("Saldo: R$ " + c.getSaldo());
            }
        } catch (ContaDaoException e) {
            System.out.println("Falha ao listar os dados das contas");
        }
        
        conexao.close();
    }
}
