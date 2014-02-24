// Nome: Clauber Pereira Stipkovic Halic
// TIA: 3124304-5

package aula5;

import java.util.Scanner;

public class Aula5 {

    public static void main(String[] args) {
        int tam  = 6;
        
        double vetorA[],
               vetorB[];
        
        vetorA = new double[tam];
        vetorB = new double[tam];
        
        Scanner ent = new Scanner(System.in);
                
        int i;
        // Carregar o vetorA
        for (i = 0; i < tam; i++) {
            System.out.print("vetorA[" + i + "] = ");
            vetorA[i] = ent.nextDouble();
        }
        
        // Gerar vetorB
        for (i = 0; i < tam; i++) {
            if (i % 2 == 0) {
                vetorB[i] = vetorA[i] / 2;
            } else {
                vetorB[i] = vetorA[i] * 1.5;
            }
        }
        
        // Apresentacao do vetorB
        for (i = 0; i < tam; i++) {
            System.out.println("vetorB[" + i + "] = " + vetorB[i]);
        }
    }
}