package Atividade3;

import java.util.Random;

public class ProdutoMatriz {
    
    public static int[][] geraMatriz(int matriz[][]) {
        Random gerador = new Random();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt();
            }
        }
        
        return matriz;
    }
    
    public static void leMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println();
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        
    }
}
