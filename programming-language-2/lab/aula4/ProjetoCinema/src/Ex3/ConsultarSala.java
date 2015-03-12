package Ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConsultarSala {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conexao;
        String url  = "jdbc:derby://localhost:1527/sistema_ingresso";
        String usuario = "app";
        String senha = "app";
        conexao = DriverManager.getConnection(url, usuario, senha);
        
        Statement st;
        st = conexao.createStatement();
        
        System.out.println("Consultar um item, digite 1.");
        System.out.println("Listar todos os items, digite 2.");
        System.out.println("Sair, digite 0.");
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nInforme sua opção:");
        int opcao = entrada.nextInt();
        String sql;
        ResultSet resultado;
        
        while (opcao != 0) {
            switch(opcao) {
                case 1:
                    System.out.println("Informe o numero da sala: ");
                    int sala = entrada.nextInt();

                    sql = "SELECT * from salas WHERE nro_sala = " + sala;
                    resultado = st.executeQuery(sql);

                    System.out.print("Numero: " + resultado.getInt("nro_sala") + " - ");
                    System.out.print("Capacidade: " + resultado.getInt("capacidade") + " - ");
                    System.out.print("Em manutencao: " + resultado.getBoolean("em_manutencao") + " - ");
                    System.out.println("Qt Poltronas Especiais: " + resultado.getInt("qt_poltrona_especial"));                
                    
                case 2:
                    sql = "SELECT * from salas";
                    resultado = st.executeQuery(sql);

                    while (resultado.next()) {                    
                        System.out.print("Numero: " + resultado.getInt("nro_sala") + " - ");
                        System.out.print("Capacidade: " + resultado.getInt("capacidade") + " - ");
                        System.out.print("Em manutencao: " + resultado.getBoolean("em_manutencao") + " - ");
                        System.out.println("Qt Poltronas Especiais: " + resultado.getInt("qt_poltrona_especial"));
                    }
                
                default:
                    System.out.print("\nConsultar um item,  digite 1.");
                    System.out.print("Listar todos os items,  digite 2.");
                    System.out.print("Sair, digite 0.");
                    
                    System.out.print("\nInforme sua opção:");
                    opcao = entrada.nextInt();
            }
        }
    }
}
