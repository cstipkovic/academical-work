import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SalvarCarroTxt {
    
    public static void main(String[] args) throws IOException {
        Carro c1 = new Carro("VM", "up", 2014);
        Carro c2 = new Carro("gm", "corsa", 2009);
        Carro c3 = new Carro("honda", "fit", 2007);
        
        FileWriter fw = new FileWriter("carros.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.println(c1.toString());
        pw.println(c2.toString());
        pw.println(c3.toString());
        pw.close();
        fw.close();
    }
}
