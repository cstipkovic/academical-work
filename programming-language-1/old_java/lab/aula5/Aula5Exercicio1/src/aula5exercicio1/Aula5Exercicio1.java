// Nome: Clauber Pereira Stipkovic Halic
// TIA: 3124304-5
package aula5exercicio1;

import java.util.Scanner;

public class Aula5Exercicio1 {

    public static void main(String[] args) {
        int vetorA[],
            vetorB[],
            tam;
        
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Informe o tamanho do vetor: ");
        tam = ent.nextInt();
        
        if (tam <= 0) {
            System.out.print("Tamanho do vetor deve ser maior que 0.");
        } else {
            int i;
            
            vetorA = new int[tam];
            vetorB = new int[tam];
            
            for (i = 0; i < tam; i++) {
                 System.out.print("vetorA[" + i + "] = ");
                 vetorA[i] = ent.nextInt();
            }
            
            int j = 0;
            for (i = 0; i < tam; i++) {
                if ((vetorA[i] % 2) == 0) {
                    vetorB[j] = vetorA[i];
                    j++;
                }
            }
            
            System.out.println("VetorB, como ficou ...");
            for (i = 0; i < j; i++) {
                System.out.println("vetorB[" + i + "] = " + vetorB[i]);
            }
        }
    }
}
