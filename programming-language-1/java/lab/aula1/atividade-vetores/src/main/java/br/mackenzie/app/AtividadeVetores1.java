package br.mackenzie.app;

import java.util.Scanner;

public class AtividadeVetores1 {
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

        int vetorInterseccao[] = interseccao(a, b);
        for (int i = 0; i < vetorInterseccao.length; i++) {
            System.out.print(vetorInterseccao[i] + " ");
        }
    }

    public static int[] interseccao (int a[], int b[]) {
        int vetorInterseccao[];

        if (a.length > b.length) {
            vetorInterseccao = new int[b.length];
        } else {
            vetorInterseccao = new int[a.length];
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    vetorInterseccao[i] = a[i];
                }
            }
        }

        return vetorInterseccao;
    }
}
