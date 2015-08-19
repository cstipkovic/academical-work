package input.output.stream;

import java.io.PrintWriter;
import java.util.Date;

public class CriarArquivo {
    
    public static void main(String args[]) {
        
        PrintWriter pw;
        
        try {
            pw = new PrintWriter("meu_arquivo.txt");
            pw.println("Teste");
            pw.println(new Date());
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
