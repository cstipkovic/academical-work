package cinema.dominio;

import java.math.BigDecimal;

public class Ingresso {

    public Sessao sessao;
    public Cliente beneficiario;
    public BigDecimal valor;
    public Atendente atendente;

    public Ingresso(Sessao sessao, Cliente beneficiario, BigDecimal valor, Atendente atendente) {
        this.sessao = sessao;
        this.beneficiario = beneficiario;
        this.valor = valor;
        this.atendente = atendente;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Cliente getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Cliente beneficiario) {
        this.beneficiario = beneficiario;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }
}
