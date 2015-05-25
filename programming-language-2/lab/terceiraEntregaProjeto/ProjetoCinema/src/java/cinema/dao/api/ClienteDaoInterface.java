package cinema.dao.api;

import cinema.model.Cliente;
import java.util.List;

public interface ClienteDaoInterface {

    List<Cliente> listarTudo();
    
    void adicionar(Cliente c);
    
    void remover(Cliente c);
    
    void atualizar(Cliente c);
}
