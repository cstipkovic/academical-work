// Clauber Pereira Stipkovic Halic - 31243045

package Exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main (String[] args) {
        int vetor[];

        Scanner sysIn = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int n = sysIn.nextInt();

        vetor = new int[n];

        System.out.println("Informe os elementos do vetor para ordenacao:");
        for (int i = 0; i < n; i++) {
            vetor[i] = sysIn.nextInt();
        }

        // Ordenando
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];  
                    
                    vetor[j] = vetor[j + 1]; 
                    vetor[j + 1] = temp;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + ",");
        }
    }
}