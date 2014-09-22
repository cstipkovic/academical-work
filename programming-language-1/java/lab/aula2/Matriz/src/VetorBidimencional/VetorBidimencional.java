package VetorBidimencional;

public class VetorBidimencional {
    
    public static void main(String args[]) {
        int m1[][] = {{1, 2, 3}, {4, 5, 6}};
        int matriz[][] = {{1, 2}, {3}, {4, 5, 6}};
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("%da. linha: ", (i + 1));
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d \t", matriz[i][j]);
            }
            System.out.println("\n");
        }
    }
}
