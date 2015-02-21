package Banco;

import java.math.BigDecimal;

public class ContaBancaria {
    private String titular;
    private BigDecimal saldo;
    private long numero;
    private Correntista correntista;

    public void depositar(BigDecimal valor) {
        saldo.add(valor);
    }

    public boolean sacar(BigDecimal valor) {
        try {
            saldo.subtract(valor);
        } catch (error) {
            return false;
        }
        return true;
    }

    public BigDecimal consultarSaldo() {
        return saldo;
    }

    public Correntista consultarCorrentista() {
        return this.correntista;
    }
}
