package Debitos;

import java.util.Scanner;

public class main {
    
    public static void main(String args[]) {
        String dono;
        double saldo;
        double limite;
        double deposita;
        
        Scanner s = new Scanner(System.in);
        
        // Dono
        System.out.print("Informe o nome do dono: ");
        dono = s.nextLine();
        
        // Saldo
        System.out.print("Informe o saldo: ");
        saldo = s.nextDouble();
        
        // Limite
        System.out.print("Informe o limite: ");
        limite = s.nextDouble();
        
        // Deposito
        System.out.print("Informe o deposito: ");
        deposita = s.nextDouble();
        
        Debitos d = new Debitos(dono, saldo, limite, deposita);
        System.out.println("");
        
        System.out.println("Dono: " + d.getDono());
        System.out.println("Saldo: " + d.getSaldo());
        System.out.println("Limite: " + d.getLimite());
        System.out.println("Deposita: " + d.getDeposita());
        System.out.println("Bloqueado: " + d.getBloqueado());
    }
}