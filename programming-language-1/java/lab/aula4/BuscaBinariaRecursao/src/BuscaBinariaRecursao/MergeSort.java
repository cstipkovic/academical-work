package BuscaBinariaRecursao;

import java.util.Scanner;

public class MergeSort {
    
    public static void mergeSort(int v[], int ini, int fim) {
        if (ini < fim) {
            int meio = (ini + fim) / 2;
            
            mergeSort(v, ini, meio);
            mergeSort(v, meio + 1, fim);
            merge(v, ini, meio, fim);
        }
    }
    
    public static void merge(int v[], int ini, int meio, int fim) {
        int[] w = new int[fim - ini + 1];
        int i = ini;
        int j = meio + 1;
        int k = 0;
        
        while (i <= meio && j <= fim) {
            if (v[i] <= v[j]) {
                w[k] = v[i];
                k++; i++;
            } else {
                w[k] = v[j];
                k++; j++;
            }
        }
        
        while (i <= meio) { //Copia restante da primeira metade
            w[k] = v[i];
            k++; i++;
        }
        
        while (j <= fim) { //Copia restante da segunda metade
            w[k] = v[j];
            k++; j++;
        }
        
        // Copia os elementos levados para w de volta para o vetor v
        for (i = 0; i <= fim - ini; i++) {
            v[ini + i] = w[i];
        }
    }
    
    public static void main(String[] args) { 
       Scanner entrada = new Scanner(System.in);
      
        // vamos declarar e construir um vetor de 10 elementos
        int valores[] = new int[10];
    
        // vamos pedir que o usuário informe os valores
        for(int i = 0; i < valores.length; i++){
            System.out.print("Informe o valor para o índice " + i + ": ");
            valores[i] = entrada.nextInt();
        }
        
        mergeSort(valores, 0,  9);
        for(int i = 0; i < valores.length; i++){
           System.out.print("valores após mergesort para o índice " + i + ": "+valores[i]+"\n");
        }
    }
}
