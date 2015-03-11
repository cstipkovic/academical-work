package geral;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Titular {
    
    public void ImprimeTitulares (Statement st) throws SQLException {
        String sql = "SELECT nro_titular, nome, rg, cpf FROM titulares";
        ResultSet resultados;
        resultados = st.executeQuery(sql);
        
        System.out.println("Dados dos titulares:");
        while (resultados.next()) {            
            System.out.print("Numero: " + resultados.getLong("nro_titular") + " - ");
            System.out.print("Nome: " + resultados.getString("nome") + " - ");
            System.out.print("RG: " + resultados.getString("rg") + " - ");
            System.out.println("CPF: " + resultados.getString("cpf"));
        }
    }
    
    public int ApagaTitular(Statement st, int numeroTitular) throws SQLException {
        String sql = "DELETE from titulares WHERE nro_titular = " + numeroTitular;
        
        return st.executeUpdate(sql);
    }
}
