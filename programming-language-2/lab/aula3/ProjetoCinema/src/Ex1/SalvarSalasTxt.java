package Ex1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import projetocinema.SalaProjecao;

public class SalvarSalasTxt {

    public static void main(String args[]) throws IOException {
        
        SalaProjecao s1 = new SalaProjecao();
        SalaProjecao s2 = new SalaProjecao();
        SalaProjecao s3 = new SalaProjecao();
        
        FileWriter fw = new FileWriter("salas.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.println(s1.toString());
        pw.println(s2.toString());
        pw.println(s3.toString());
        pw.close();
        fw.close();
    }
}
