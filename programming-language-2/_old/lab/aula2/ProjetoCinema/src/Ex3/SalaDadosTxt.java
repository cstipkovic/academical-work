package Ex3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import projetocinema.SalaProjecao;

public class SalaDadosTxt {

    private File fl;
    private String nomeArquivo;
    
    public SalaDadosTxt(String nomeArquivo) {
        this.fl = new File(nomeArquivo);
        this.nomeArquivo = nomeArquivo;
        
        if (fl.exists() == false ) {
            try {
                fl.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void salvar(List<SalaProjecao> salas) {
        try {
            FileWriter fw = new FileWriter(this.nomeArquivo, false);
            for (int i = 0; i < salas.size(); i++) {
                fw.write(salas.get(i).toString());
                fw.write("\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public List<SalaProjecao> lerTodos() {
        List<SalaProjecao> lsp = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fl));
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] atributos = line.split(";");
                SalaProjecao sp;
                sp = new SalaProjecao(Integer.parseInt(atributos[0]), Integer.parseInt(atributos[1]), Boolean.parseBoolean(atributos[2]), Integer.parseInt(atributos[3]));
                lsp.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lsp;
    }
}
