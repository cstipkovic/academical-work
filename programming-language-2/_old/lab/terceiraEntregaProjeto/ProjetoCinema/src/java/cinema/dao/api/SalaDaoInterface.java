package cinema.dao.api;

import cinema.model.Sala;
import java.util.List;

public interface SalaDaoInterface {

    List<Sala> listarTudo();
    
    void adicionar(Sala s);
    
    void remover(Sala s);
    
    void atualizar(Sala s);
    
    List<String> listarFilmesSala(int id);
}
