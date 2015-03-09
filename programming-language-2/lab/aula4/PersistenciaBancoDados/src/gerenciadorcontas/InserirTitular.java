package gerenciadorcontas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InserirTitular {
    
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://127.0.0.1:1527/sistema_bancario";
        String usuario = "app";
        String senha = "app";
        
        Connection conexao;
        conexao = DriverManager.getConnection(url, usuario, senha);
        
        Statement st;
        st = conexao.createStatement();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insercao de novo titular: ");
        System.out.print("Dgite o numero: ");
        long nu = entrada.nextLong();
        entrada.nextLine();
        System.out.print("Digite o nome: ");
        String no = entrada.nextLine();
        System.out.print("Digite o RG: ");
        String rg = entrada.nextLine();
        System.out.print("Digite o CPF: ");
        String cpf = entrada.nextLine();
        
        String sql = "insert into titulares ";
        sql += "values (" + nu + ", '" + no + "', '" + rg + "', '" + cpf + "')";
        
        st.executeUpdate(sql);
        
        System.out.println("Registro inserido com sucesso!");
        conexao.close();
    }
}
