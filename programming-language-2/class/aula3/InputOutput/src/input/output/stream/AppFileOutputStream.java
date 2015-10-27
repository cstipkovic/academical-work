package input.output.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppFileOutputStream {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos;
        fos = new FileOutputStream("saida.txt");
        fos.write(76);
        fos.write(80);
        fos.write(73);
        fos.write(73);
        fos.close();
    }
}