package cinema.dao.api;

import cinema.dominio.Atendente;
import java.util.List;

public interface AtendenteDaoInterface {
    
    List<Atendente> listarTudo();
    
    void adicionar(Atendente a);
    
    void remover(Atendente a);
    
    void atualizar(Atendente a);
}
