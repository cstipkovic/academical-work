package br.mackenzie.app;

import java.util.Scanner;

public class AtividadeVetores3 {
    public static void main (String args []) {
        int a[];
        int b[];
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor A: ");
        int tamanhoVetorA = entrada.nextInt();
        a = new int[tamanhoVetorA];

        System.out.print("Informe o tamanho do vetor B: ");
        int tamanhoVetorB = entrada.nextInt();
        b = new int[tamanhoVetorB];

        System.out.print("informe os valores do vetor A: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = entrada.nextInt();
        }

        System.out.print("informe os valores do vetor B: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = entrada.nextInt();
        }

        intercalacao(a, b);
    }

    public static int[] intercalacao (int a[], int b[]) {
        int c[] = new int[a.length + b.length];
        int position = 0;
        for (int i = 0; i < a.length; i++) {
            c[position] = a[i];
            position++;
            c[position] = b[i];
            position++;
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        return c;
    }
}
