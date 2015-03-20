package ingresso.dao.api;

import ingresso.dominio.Sala;
import java.util.List;

public interface SalaDaoInterface {
    
    List<Sala> listarTudo();

    void adicionar(Sala s);
    
    void remover(Sala s);
    
    void atualizar(Sala s);

    Sala buscarPeloNumero(long nroSala);
}
