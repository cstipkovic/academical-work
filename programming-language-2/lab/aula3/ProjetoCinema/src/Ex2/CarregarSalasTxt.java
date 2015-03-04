package Ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import projetocinema.SalaProjecao;

public class CarregarSalasTxt {
    
    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("salas.txt");
        BufferedReader br = new BufferedReader(fr);
        
        List<SalaProjecao> salas = new ArrayList<>();
        
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] v = linha.split(";");
            SalaProjecao sp = new SalaProjecao(v[0]);
            salas.add(sp);
        }
        
        for(SalaProjecao sala: salas){
            System.out.println("Informacoes da sala: " + sala.toString());
        }
    }
}
