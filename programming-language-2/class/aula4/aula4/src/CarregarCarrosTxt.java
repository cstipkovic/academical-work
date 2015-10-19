
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarregarCarrosTxt {
    
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("carros.txt");
        BufferedReader br = new BufferedReader(fr);
        
        List<Carro> carros = new ArrayList<>();
        
        String linha;
        while ((linha = br.readLine()) != null) {            
            String[] v = linha.split(":");
            Carro c = new Carro(v[0], v[1], Integer.parseInt(v[2]));
            carros.add(c);
        }
        
        for (Carro carro : carros) {
            System.out.println("Dados do carro: " + carro.toString());
        }
    }
}
