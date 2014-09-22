package Exemplo;

public class Exemplo {
    
    public static void main(String args[]) {
        float matriz [][] = new float[][]{{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz [" + i + "]" + "[" + j + "] = " + matriz[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
