package Ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CarregarSalasTxt {
    
    public static void main(String args[]) {
        
        File arquivo = new File("salas.txt");
        if (arquivo.exists()) {
            BufferedReader br;
            try {
                br = new BufferedReader(new FileReader(arquivo));
                String line = null;
                while ((line = br.readLine()) != null) {
                    System.out.println("Sala de Projeção: " + line);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Arquivo não exsite!");
        }
    }
}
