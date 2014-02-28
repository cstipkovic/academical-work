package Exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main (String[] args) {
        int vetor[],
        vetorOrd[];

        Scanner sysIn = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int n = sysIn.nextInt();

        vetor = new int[n];
        vetorOrd = new int[n];

        System.out.println("Informe os elementos do vetor para ordenacaro:");
        for (int i = 0; i < n; i++) {
            vetor[i] = sysIn.nextInt();
        }

        // Ordenando por insertion sort
        for (int i = 0; i < 10; i++) {

        }
    }
}