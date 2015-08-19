package input.output.stream;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class AppFileWriter {
    
    public static void main(String args[]) throws FileNotFoundException, IOException {
        
        FileWriter fw;
        fw = new FileWriter("saida.txt");
        fw.write("L");
        fw.write("P");
        fw.write("I");
        fw.write("I");
        fw.close();
    }
            
}
