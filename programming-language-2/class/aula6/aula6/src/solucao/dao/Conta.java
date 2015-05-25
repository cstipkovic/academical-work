package solucao.dao;

import java.math.BigDecimal;

/**
 *
 * @author cstipkovic
 */
public class Conta {

    public long numero;
    public BigDecimal saldo;

    public Conta(long numero, BigDecimal saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
