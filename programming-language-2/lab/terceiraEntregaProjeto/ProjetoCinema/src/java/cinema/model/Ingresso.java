package cinema.model;

import java.math.BigDecimal;

public class Ingresso {

    public int id;
    public int sessao;
    public int beneficiario;
    public BigDecimal valor;
    public int atendente;

    public Ingresso(int id, int sessao, int beneficiario, BigDecimal valor, int atendente) {
        this.id = id;
        this.sessao = sessao;
        this.beneficiario = beneficiario;
        this.valor = valor;
        this.atendente = atendente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSessao() {
        return sessao;
    }

    public void setSessao(int sessao) {
        this.sessao = sessao;
    }

    public int getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(int beneficiario) {
        this.beneficiario = beneficiario;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getAtendente() {
        return atendente;
    }

    public void setAtendente(int atendente) {
        this.atendente = atendente;
    }
}
