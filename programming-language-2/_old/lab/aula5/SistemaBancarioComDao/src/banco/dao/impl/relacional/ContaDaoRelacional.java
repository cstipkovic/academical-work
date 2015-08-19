package banco.dao.impl.relacional;

import banco.dao.api.ContaDaoInterface;
import banco.dominio.Conta;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContaDaoRelacional implements ContaDaoInterface {
    
    private ConexaoInterface conexao;

    public ContaDaoRelacional(ConexaoInterface conexao) {
        this.conexao = conexao;
    }
    
    @Override
    public List<Conta> listarTudo() {
        List<Conta> contas;
        contas = new ArrayList<>();
        try {
            Statement st;
            st = conexao.getConnection().createStatement();
            String sql = "select nro_contas, saldo from contas";
            ResultSet resultados = st.executeQuery(sql);
            
            while (resultados.next()) {                
                long n = resultados.getLong("nro_contas");
                BigDecimal b = resultados.getBigDecimal("saldo");
                Conta c = new Conta(n, b);
                contas.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return contas;
    }
    
    @Override
    public void adicionar(Conta c) {
        try {
            Statement st;
            st = conexao.getConnection().createStatement();
            String sql = "insert into contas values (" + c.getNumero() + "," + c.getSaldo() + ")";
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void remover(Conta c) {
        try {
            Statement st;
            st = conexao.getConnection().createStatement();
            String sql = "delete from contas where nro_contas = " + c.getNumero();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void atualizar(Conta c) {
        try {
            Statement st;
            st = conexao.getConnection().createStatement();
            String sql = "update contas set saldo = " + c.getSaldo() + "where nro_contas = " + c.getNumero();
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public Conta buscarPeloNumero(long nroConta) {
        Conta conta = null;
        try {
            Statement st;
            st = conexao.getConnection().createStatement();
            String sql = "select nro_contas, saldo from contas where nro_contas = " + nroConta;
            ResultSet resultados = st.executeQuery(sql);
            
            while (resultados.next()) {
                if (resultados.getLong("nro_conta") == nroConta) {
                    long n = resultados.getLong("nro_contas");
                    BigDecimal b = resultados.getBigDecimal("saldo");
                    Conta c = new Conta(n, b);
                    conta = c;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return conta;
    }
}
