package br.mackenzie;

import java.util.Scanner;

public class AtividadeVetor1 {

    public static void main (String args[]) {
        int a[];
        int b[];
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor A: ");
        int tamanhoVetorA = entrada.nextInt();
        a = new int[tamanhoVetorA];

        System.out.print("Informe o tamanho do vetor B: ");
        int tamanhoVetorB = entrada.nextInt();
        b = new int[tamanhoVetorB];
    }
}
