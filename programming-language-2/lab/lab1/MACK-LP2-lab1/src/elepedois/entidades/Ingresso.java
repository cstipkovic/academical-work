package elepedois.entidades;

public class Ingresso {
    public enum TipoIngresso {MEIA, INTEIRA};
    private Sessao sessao;
    private Integer poltrona;
    private TipoIngresso tipo;

    public Ingresso() {
    }

    public Ingresso(Sessao sessao, Integer poltrona, TipoIngresso tipo) {
        this.sessao = sessao;
        this.poltrona = poltrona;
        this.tipo = tipo;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Integer getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(Integer poltrona) {
        this.poltrona = poltrona;
    }

    public TipoIngresso getTipo() {
        return tipo;
    }

    public void setTipo(TipoIngresso tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "ingresso de " + sessao + ", poltrona " + poltrona + " tipo " + tipo.toString();
    }
}
