package exercicio2;

import exercicio1.ContaDaoException;
import java.util.List;

public interface ContaDaoInterface {

    List<Conta> listarTudo() throws ContaDaoException;
}
