package AtividadeLab;

/**
 *
 * @author cstipkovic
 */
public class CalcularPreco {
    
    public static void main(String args[]) {
        double precos[][] = {
            {20.50, 15.12, 30.15, 40.10, 68.24}, 
            {35.23, 18.99, 35.10, 35.80, 60.41}, 
            {40.00, 12.90, 27.05, 70.90, 50.55}
        };
        int qt[] = {10, 8, 17};
        double precoXQt[][] = new double[3][5];
        double total[] = new double[5];
        double estMaisBarato = 0.0;
        String nomeEstMaisBarato = "";
        
        for (int p = 0; p < precos.length; p++) {
            for (int e = 0; e < precos[p].length; e++) {
                precoXQt[p][e] = precos[p][e] * qt[p];
            }
        }
        
        for (int p = 0; p < precoXQt.length; p++) {
            for (int e = 0; e < precoXQt[p].length; e++) {
                
                total[e] = total[e] + precoXQt[p][e];
            }
        }
        
        // Imprime tabela com os valores * quantidade
        for (int p = 0; p < precoXQt.length; p++) {
            for (int e = 0; e < precoXQt[p].length; e++) {
                System.out.print(precoXQt[p][e] + "\t");
            }
            System.out.print("\n");
        }       
        
        estMaisBarato = total[0];
        for (int i = 0; i < total.length; i++) {
            if (total[i] < estMaisBarato) {
                estMaisBarato = total[i];
                nomeEstMaisBarato = "Estabelecimento " + (i + 1);
            }
        }
        System.out.print("\n");
        
        // Imprime o total de cada estabelecimento
        for (int i = 0; i < total.length; i++) {
            System.out.print(total[i] + "\t");
        }
        System.out.print("\n");
        
        
        System.out.println("\nMais barato para comprar: " + nomeEstMaisBarato + " com valor total de " + estMaisBarato);
    }
}
