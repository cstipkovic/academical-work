
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SalvarCarrosObj {
    
    public static void main(String[] args) throws IOException {
        Carro c1 = new Carro("vm", "up", 2014);
        Carro c2 = new Carro("gm", "corsa", 2009);
        Carro c3 = new Carro("honda", "fit", 2007);
        
        FileOutputStream fos = new FileOutputStream("carros.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c1);
        oos.writeObject(c2);
        oos.writeObject(c3);
        
        oos.close();
        fos.close();
    }
}
