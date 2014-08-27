package AtividadeMatriz;

/**
 *
 * @author 31243045
 */
public class AtividadeMatriz {
    public static void main (String args []) {
        double tabelaDePreco[][] = new double[][]{
            {20.50, 15.12, 30.15, 40.10, 68.24},
            {35.23, 18.99, 35.10, 35.80, 60.41},
            {40.00, 12.90, 27.05, 70.90, 50.55}
        };
        double tabelaSomaPorProduto[][] new double[][];
        int tabelaQuantidades[] = new int[]{10, 8, 17};
        
        for (int i = 0; i < tabelaDePreco.length; i++) {
            for (int j = 0; j < tabelaQuantidades.length; j++) {
                tabelaSomaPorProduto[i][j] = tabelaDePreco[i][j] * tabelaQuantidades[j];
            }
        }
    } 
}
