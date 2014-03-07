// Clauber Pereira Stipkovic Halic - 31243045
// 06/03/2014

package Exercicio2;

import java.util.Scanner;

public class RetanguloPontos {
    
    public void desenhaRetangulo (int coluna, int linha) {
        for (int i = 0; i < coluna; i++) {
            for (int j = 0; j < linha; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void main (String[] args) {
        int coluna1, coluna2, 
            linha1, linha2;
        
        RetanguloPontos ret1 = new RetanguloPontos();
        RetanguloPontos ret2 = new RetanguloPontos();
        
        Scanner ent = new Scanner(System.in);
        
        // Retangulo 1
        System.out.print("Informe o numero de colunas do retangulo1: ");
        coluna1 = ent.nextInt();
        
        System.out.print("Informe o numero de linhas do retangulo1: ");
        linha1 = ent.nextInt();
        
        ret1.desenhaRetangulo(coluna1, linha1);
        
        // Retangulo 2
        System.out.print("Informe o numero de colunas do retangulo2: ");
        coluna2 = ent.nextInt();
        
        System.out.print("Informe o numero de linhas do retangulo2: ");
        linha2 = ent.nextInt();
        
        ret2.desenhaRetangulo(coluna2, linha2);
    }
}
