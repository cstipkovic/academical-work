package cinema.dao.api;

import cinema.dominio.Ingresso;
import java.util.List;

public interface IngressoDaoInterface {

    List<Ingresso> listarTudo();
    
    void adicionar(Ingresso i);
    
    void remover(Ingresso i);
    
    void atualizar(Ingresso i);
}
