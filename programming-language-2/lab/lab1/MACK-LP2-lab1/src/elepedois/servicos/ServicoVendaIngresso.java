package elepedois.servicos;

import elepedois.entidades.Ingresso;
import elepedois.entidades.Sessao;

public class ServicoVendaIngresso {
    public Ingresso venderIngresso(Sessao sessao, Integer poltrona, Ingresso.TipoIngresso tipo) {
        Ingresso ingresso = sessao.createIngresso(poltrona, tipo);
        
        return ingresso;
    }
}
