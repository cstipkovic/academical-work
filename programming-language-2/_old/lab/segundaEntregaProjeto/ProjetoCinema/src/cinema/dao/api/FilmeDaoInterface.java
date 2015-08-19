package cinema.dao.api;

import cinema.dominio.Filme;
import java.util.List;

public interface FilmeDaoInterface {

    List<Filme> listarTudo();
    
    void adicionar(Filme f);
    
    void remover(Filme f);
    
    void atualizar(Filme f);
}
