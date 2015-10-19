
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class CarregarCarrosObj {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("carros.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        List<Carro> carros = new ArrayList<>();
        
        while (fis.available() != 0) {            
            Carro c = (Carro) ois.readObject();
            carros.add(c);
        }
        
        ois.close();
        fis.close();
        
        for (Carro carro : carros) {
            System.out.println("Dados do carro: " + carro.toString());
        }
    }
}
