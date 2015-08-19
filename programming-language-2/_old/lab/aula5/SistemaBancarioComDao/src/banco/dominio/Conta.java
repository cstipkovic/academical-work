package banco.dominio;

import java.math.BigDecimal;

public class Conta {

    private long numero;
    private BigDecimal saldo;

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
