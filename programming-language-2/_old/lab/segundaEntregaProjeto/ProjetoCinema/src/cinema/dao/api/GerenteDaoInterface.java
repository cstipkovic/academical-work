package cinema.dao.api;

import cinema.dominio.Gerente;
import java.util.List;

public interface GerenteDaoInterface {

    List<Gerente> listarTudo();
    
    void adicionar(Gerente g);
    
    void remover(Gerente g);
    
    void atualizar(Gerente g);
}
