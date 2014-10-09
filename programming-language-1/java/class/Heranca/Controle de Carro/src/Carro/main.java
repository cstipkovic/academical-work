package Carro;

import java.util.Scanner;

public class main {
    
    public static void main(String [] args){
        
        Scanner entN = new Scanner(System.in);
        Scanner entS = new Scanner(System.in);
        
        Automovel a = new Automovel();
        System.out.print("Automovel\nMarca: ");
        a.setMarca(entS.nextLine());
        System.out.print("Ano: ");
        a.setAno(entN.nextInt());
        System.out.print("Modelo: ");
        a.setModelo(entS.nextLine());
        System.out.print("Tanque de combustível: ");
        a.setTanqueDeCombustivel(entN.nextDouble());
        
        Utilitario u = new Utilitario();
        System.out.print("\nUtilitário\nMarca: ");
        u.setMarca(entS.nextLine());
        System.out.print("Ano: ");
        u.setAno(entN.nextInt());
        System.out.print("Modelo: ");
        u.setModelo(entS.nextLine());
        System.out.print("Tanque de combustível: ");
        u.setTanqueDeCombustivel(entN.nextDouble());
        System.out.print("Capacidade: ");
        u.setCapacidade(entN.nextInt());
        System.out.print("Altura: ");
        u.setAltura(entN.nextDouble());
        
        Popular p = new Popular();
        System.out.print("\nPopular\nMarca: ");
        p.setMarca(entS.nextLine());
        System.out.print("Ano: ");
        p.setAno(entN.nextInt());
        System.out.print("Modelo: ");
        p.setModelo(entS.nextLine());
        System.out.print("Tanque de combustível: ");
        p.setTanqueDeCombustivel(entN.nextDouble());
        System.out.print("Tipo do motor (1.0 ou 1.4): ");
        p.setTipoDoMotor(entS.nextLine());
        System.out.print("Qtde de portas (3 ou 5): ");
        p.setQtdPortas(entN.nextInt());
        
        System.out.println("\nDados do automóvel:\n" + a);
        System.out.println("\nDados do utilitário:\n" + u);
        System.out.println("\nDados do popular:\n" + p);
    }
}
