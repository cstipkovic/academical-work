package input.output.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AppFileInputStream {
    
    public static void main(String args[]) throws FileNotFoundException, IOException {
        
        FileInputStream fis;
        fis = new FileInputStream("entrada.txt");
        int leitura = fis.read();
        System.out.println("Primeiro valor: " + leitura);
        leitura = fis.read();
        System.out.println("Segundo valor: " + leitura);
        fis.close();
    }
}
