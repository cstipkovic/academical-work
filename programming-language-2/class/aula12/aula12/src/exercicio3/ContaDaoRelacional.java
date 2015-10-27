package exercicio3;

import exercicio1.ContaDaoException;
import exercicio2.ContaDaoInterface;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaDaoRelacional implements ContaDaoInterface {

    @Override
    public List<Conta> listarTudo() throws ContaDaoException {
        List<Conta> contas = new ArrayList<>();
        try {
            // codigo omitido
        } catch (SQLException e) {
            throw new ContaDaoException();
        }
        
        return contas;
    }
}
