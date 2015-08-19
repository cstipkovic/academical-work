package cinema.dao.api;

import cinema.dominio.Sessao;
import java.util.List;

public interface SessaoDaoInterface {

    List<Sessao> listarTudo();
    
    void adicionar(Sessao s);
    
    void remover(Sessao s);
    
    void atualizar(Sessao s);
}
