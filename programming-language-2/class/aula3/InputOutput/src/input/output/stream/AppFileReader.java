package input.output.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppFileReader {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr;
        fr = new FileReader("entrada.txt");
        char[] cbuf = new char[100];
        fr.read(cbuf);
        System.out.println(cbuf);
        fr.close();
    }
}