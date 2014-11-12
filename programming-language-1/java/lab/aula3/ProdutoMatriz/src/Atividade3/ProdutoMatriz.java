package Atividade3;

import java.util.Random;

public class ProdutoMatriz {
    
    public static int[][] geraMatriz(int matriz[][]) {
        Random gerador = new Random();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt(10);
            }
        }
        
        return matriz;
    }
    
    public static void leMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static int[][] produtoMatriz(int matrizA[][], int matrizB[][]) {
        int n = matrizA[0].length;
        int m = matrizA.length;
        int q = matrizB[0].length;
        
        int prod[][] = new int[m][q];

        for(int i = 0; i < m; i++){
           for(int j = 0; j < q; j++){
              for(int k = 0; k < n; k++){
                 prod[i][j] += matrizA[i][k] * matrizB[k][j];
              }
           }
        }
        
        return prod;
    }
    
    public static void main(String args[]) {
        int A[][] = new int[2][3];
        int B[][] = new int[3][2];
        int R[][] = new int[2][2];
        
        geraMatriz(A);
        leMatriz(A);
        
        System.out.println("");
        
        geraMatriz(B);
        leMatriz(B);
        
        System.out.println("");
        
        R = produtoMatriz(A, B);
        leMatriz(R);
        
    }
}
