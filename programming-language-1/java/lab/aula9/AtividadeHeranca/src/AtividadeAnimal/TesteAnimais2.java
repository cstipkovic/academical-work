package AtividadeAnimal;

import java.util.Scanner;

public class TesteAnimais2 {
    
    public static void main(String args[]) {
        int qtAnimaisMax;
        int qtAnimais = 0;
        int qtMamifero = 0;
        int qtPeixe = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qt maxima de animais no zoo: ");
        qtAnimaisMax = entrada.nextInt();
        
        Animal zoo[] = new Animal[qtAnimaisMax];
        
        while (qtMamifero < 10) {
            String nome;
            System.out.print("Nome: ");
            nome = entrada.next();
            
            String cor;
            System.out.println("Cor: ");
            cor = entrada.next();
            
            String alimento;
            System.out.println("Alimento: ");
            alimento = entrada.next();
            
            int comprimento;
            System.out.println("Comprimento: ");
            comprimento = entrada.nextInt();
            
            float velocidade;
            System.out.println("Velocidade(m/s): ");
            velocidade = (float) entrada.nextDouble();
            
            Mamifero m = new Mamifero(nome, cor, alimento, comprimento, velocidade);
            zoo[qtAnimais - 1] = m;
            qtAnimais++;
            qtMamifero++;
        }
        
        while (qtPeixe < 10) {
            String nome;
            System.out.print("Nome: ");
            nome = entrada.next();
            
            String caracteristica;
            System.out.println("Caracteristica: ");
            caracteristica = entrada.next(); 
            
            int comprimento;
            System.out.println("Comprimento: ");
            comprimento = entrada.nextInt();
            
            float velocidade;
            System.out.println("Velocidade(m/s): ");
            velocidade = (float) entrada.nextFloat();
            
            Peixe p = new Peixe(nome, caracteristica, comprimento, velocidade);
            zoo[qtAnimais] = p;
            qtAnimais++;
            qtPeixe++;
        }
    }
}
