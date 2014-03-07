// Clauber Pereira Stipkovic Halic - 31243045

package Exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main (String[] args) {
        int a[], b[], c[], n;

        Scanner sysIn = new Scanner(System.in);

        System.out.print("Informe o tamanho dos vetores: ");
        n = sysIn.nextInt();

        a = new int[n];
        b = new int[n];
        c = new int[(n * 2)];

        // Popula os vetores
        System.out.println("Informe os numeros do primeiro vetor.");
        System.out.print("Vetor A: ");
        for (int i = 0; i < n; i++) {
            a[i] = sysIn.nextInt();
        }

        System.out.print("Vetor B: ");
        for (int i = 0; i < n; i++) {
            b[i] = sysIn.nextInt();
        }

        // Merge dos vetores
        int countVetorC = 0;
        for (int i = 0; i < (n); i++) {
            c[countVetorC] = a[i];
            c[countVetorC + 1] = b[i];
            
            countVetorC = countVetorC + 2;
        }

        System.out.print("Vetor com c, com merge: ");
        for (int i = 0; i < (n * 2); i++) {
            System.out.print(c[i] + ", ");
        }
    }
}