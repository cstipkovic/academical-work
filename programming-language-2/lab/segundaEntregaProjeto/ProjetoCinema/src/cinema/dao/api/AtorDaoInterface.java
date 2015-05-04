package cinema.dao.api;

import cinema.dominio.Ator;
import java.util.List;

public interface AtorDaoInterface {

    List<Ator> listarTudo();
    
    void adicionar(Ator a);
    
    void remover(Ator a);
    
    void atualizar(Ator a);
}
