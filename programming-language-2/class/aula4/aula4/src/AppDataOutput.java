
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class AppDataOutput {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("dataoutput.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeShort(65);
        dos.writeShort(66);
        dos.writeShort(67);
        dos.writeShort(68);
        dos.close();
        
        FileWriter fw = new FileWriter("datawrite.txt");
        fw.append("65");
        fw.append("66");
        fw.append("67");
        fw.append("68");
        fw.close();
    }
}
