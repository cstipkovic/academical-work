package banco.dao.api;

import banco.dominio.Conta;
import java.util.List;

public interface ContaDaoInterface {

    List<Conta> listarTudo();
    
    // insere uma nova conta
    void adicionar(Conta c);
    
    // apaga uma conta
    void remover(Conta c);
    
    // atuliazar os dados de uma conta já existente
    void atualizar(Conta c);
    
    // obtém a instância de Conta que possui o número informado
    Conta buscarPeloNumero(long nroConta);
    
}
