package br.mackenzie.app;

import java.util.Scanner;

public class AtividadeVetores2 {

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

        uniao(a, b);
    }

    private static int[] uniao(int a[], int b[]) {
        int uniao[];
        int aux[] = new int[a.length + b.length];
        int posicao = a.length;

        for(int i = 0; i < a.length; i++)
            aux[i] = a[i];

        for(int i = 0; i < b.length; i++)
            if(!contains(aux, b[i]))
                aux[posicao] = b[i];

        uniao = new int[posicao + 1];

        for(int i = 0; i <= posicao; i++)
            uniao[i] = aux[i];

        printArray(uniao);
        return uniao;
    }

    public static void printArray(int v[]) {
        for(int i=0; i<v.length; i++)
            System.out.println(v[i]);
    }

    private static boolean contains(int a[], int value) {
        for(int i = 0; i < a.length; i++) {
            if(a[i] == value) {
                return true;
            }
        }
        return false;
    }
}