package Ex3;

import java.util.ArrayList;
import java.util.List;
import projetocinema.SalaProjecao;

public class Main {
    
    public static void main(String args[]) {
        SalaProjecao sp1 = new SalaProjecao(10, 10, false, 1);
        SalaProjecao sp2 = new SalaProjecao(20, 20, true, 2);
        SalaProjecao sp3 = new SalaProjecao(30, 30, true, 3);
        
        List<SalaProjecao> lsp = new ArrayList();
        lsp.add(sp1);
        lsp.add(sp2);
        lsp.add(sp3);
        
        SalaDadosTxt sdt = new SalaDadosTxt("salas-ex3.txt");
        sdt.salvar(lsp);
        
        System.out.println(sdt.lerTodos());
    }
}
