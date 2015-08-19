package input.output.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AppBytesDisponiveis {
    
    public static void main(String args[]) throws FileNotFoundException, IOException {
        
        FileInputStream fis = new FileInputStream("entrada.txt");
        int leitura = fis.read();
        System.out.println("Primeiro valor: " + leitura);
        leitura = fis.read();
        System.out.println("Segundo valor: " + leitura);
        int b = fis.available();
        System.out.println("Bytes disponiveis: " + b);
        fis.close();
    }
}
