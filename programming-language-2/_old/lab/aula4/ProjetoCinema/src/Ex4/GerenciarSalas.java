package Ex4;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GerenciarSalas {

    public static void main (String args[]) throws ClassNotFoundException, SQLException {
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conexao;
        String url = "jdbc:derby://localhost:1527/sistema_ingresso";
        String usuario = "app";
        String senha = "app";
        conexao = DriverManager.getConnection(url, usuario, senha);
        
        Statement st;
        
        System.out.println("(1) Listar todas as salas.");
        System.out.println("(2) Adicionar uma sala.");
        System.out.println("(3) Sair.");
        
        System.out.print("\nInforme sua opcao: ");
        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();
        String sql;
        ResultSet resultado;
        
        while(opcao != 3) {
            if (opcao == 1) {
                st = conexao.createStatement();
                sql = "SELECT * from salas";
                resultado = st.executeQuery(sql);

                while (resultado.next()) {                    
                    System.out.print("Numero: " + resultado.getInt("nro_sala") + " - ");
                    System.out.print("Capacidade: " + resultado.getInt("capacidade") + " - ");
                    System.out.print("Em manutencao: " + resultado.getBoolean("em_manutencao") + " - ");
                    System.out.println("Qt Poltronas Especiais: " + resultado.getInt("qt_poltrona_especial"));
                }
                conexao.close();
            } else if (opcao == 2) {
                System.out.print("\nInforme numero da sala: ");
                int numeroSala = entrada.nextInt();

                System.out.print("Capacidade: ");
                int capacidade = entrada.nextInt();

                System.out.print("Manutenção (true/false): ");
                boolean emManutencao = entrada.nextBoolean();

                System.out.print("Qt Pottronas Especiais: ");
                int qtPoltronaEspecial = entrada.nextInt();
                
                st = conexao.createStatement();

                sql = "INSERT "
                        + "INTO salas (nro_sala, capacidade, em_manutencao, qt_poltrona_especial) "
                        + "VALUE (" + numeroSala + ", " + capacidade + ", " + emManutencao + ", " + qtPoltronaEspecial +")";
                st.executeUpdate(sql);
                conexao.close();
            } else {
                System.out.println("\n(1) Listar todas as salas.");
                System.out.println("(2) Adicionar uma sala.");
                System.out.println("(3) Sair.");

                System.out.print("\nInforme sua opcao: ");
                opcao = entrada.nextInt();
            }
        }
        conexao.close();
    }
}
