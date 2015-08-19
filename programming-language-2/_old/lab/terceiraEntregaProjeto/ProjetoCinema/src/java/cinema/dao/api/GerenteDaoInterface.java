package cinema.dao.api;

import cinema.model.Gerente;
import java.util.List;

public interface GerenteDaoInterface {

    List<Gerente> listarTudo();
    
    void adicionar(Gerente g);
    
    void remover(Gerente g);
    
    void atualizar(Gerente g);
    
    List<String> listarAtendentesGerente(int id);
}
