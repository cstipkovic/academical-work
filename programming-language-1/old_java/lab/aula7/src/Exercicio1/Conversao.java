// Clauber Pereira Stipkovic Halic - 31243045
// 06/03/2014

package Exercicio1;

import java.util.Scanner;

public class Conversao {
    public double convertePesCM (double pes) {
        return (pes * 30.48);
    }
    
    public double converteJardasM (double jardas) {
        return (jardas * 0.9144);
    }
    
    public double converteMilhasKM (double milhas) {
        return (milhas * 1.609344);
    }
    
    public static void main (String[] args) {
        Conversao conv = new Conversao();
        
        System.out.println("Digite 1 para pés para centimetros.");
        System.out.println("Digite 2 para jardas para metros.");
        System.out.println("Digite 3 para milhas para quilometros.");
        
        System.out.print("\nQual opcao: ");
        Scanner ent = new Scanner(System.in);
        
        switch (ent.nextLine()) {
            case "1":
                System.out.print("Quantos pés: ");
                System.out.println(conv.convertePesCM(ent.nextDouble()) + " cm");
                break;
            case "2":
                System.out.print("Quantos jardas: ");
                System.out.println(conv.converteJardasM(ent.nextDouble()) + " m");
                break;
            case "3":
                System.out.print("Quantos milhas: ");
                System.out.println(conv.converteMilhasKM(ent.nextDouble()) + " km");
                break;
            default:
                System.out.println("Nenhum opcao escolhida. Obrigado.");
        }
    }
}
