package Ex1;

import java.io.PrintWriter;
import projetocinema.SalaProjecao;

public class SalvarSalasTxt {
    
    public static void main(String args[]) {
        
        SalaProjecao sp1 = new SalaProjecao(100, 10, false, 1);
        SalaProjecao sp2 = new SalaProjecao(200, 20, true, 2);
        SalaProjecao sp3 = new SalaProjecao(300, 30, false, 3);
        
        PrintWriter pw;
        try {
            pw = new PrintWriter("salas.txt");
            pw.println(sp1);
            pw.println(sp2);
            pw.println(sp3);
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
