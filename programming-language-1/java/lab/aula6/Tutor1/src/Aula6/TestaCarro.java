package Aula6;

import java.util.Scanner;

public class TestaCarro {
    
    public static void main(String args[]) {
        
        Carro fusca;
        fusca = new Carro();
        
        fusca.ligar();
        fusca.buzinar();
        
        fusca.velocidadeMaxima = 100;
        
        Scanner ent = new Scanner(System.in);
        System.out.println("Quanto você quer acelerar?");
        double valor = ent.nextDouble();
        int respAcelerar = fusca.acelearar(valor);
        int respMarcha = fusca.pegarMarcha();
        
        switch(respMarcha) {
            case 1:
                System.out.println("1 marcha");
                break;
            
            case 2:
                System.out.println("2 marcha");
                break;
                
            case 3:
                System.out.println("3 marcha");
                break;
                
            case 4:
                System.out.println("4 marcha");
                break;
                
            case 5:
                System.out.println("5 marcha");
                break;
                
            default:
                System.out.println("Carro parado");
                fusca.desligar();
                break;
        }
        System.out.println("A velocidade atual é " + fusca.velocidadeAtual + "km/h");
        if (respAcelerar == -1) {
            System.out.println("A velocidade é igual ou superior a velocidade máxima!");
        }
    }
}
