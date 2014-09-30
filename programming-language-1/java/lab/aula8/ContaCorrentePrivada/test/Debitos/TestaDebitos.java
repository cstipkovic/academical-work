package Debitos;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestaDebitos {
    
    @Test
    public void DesbloqueiaTest() {
        Debitos d = new Debitos();
        assertFalse(d.desbloqueia());
    }
    
    @Test
    public void SacarMenorSaldoTest() {
        Debitos d = new Debitos();
        d.desbloqueia();
        d.sacar(50.0);
        assertEquals(50.0, d.getSaldo(), 0);
    }
    
    @Test
    public void SacarTotalSaldoTest() {
        Debitos d = new Debitos();
        d.desbloqueia();
        d.sacar(100.0);
        assertEquals(0.0, d.getSaldo(), 0);
    }
    
    @Test
    public void SacarMaiorSaldoComLimiteTest() {
        Debitos d = new Debitos();
        d.desbloqueia();
        d.sacar(200.0);
        assertEquals(0.0, d.getSaldo(), 0);
        assertEquals(0.0, d.getLimite(), 0);
    }
    
    @Test
    public void SacarMaiorSaldoMaiorLimiteTest() {
        Debitos d = new Debitos();
        d.desbloqueia();
        d.sacar(300.0);
        assertEquals(100.0, d.getSaldo(), 0);
        assertEquals(100.0, d.getLimite(), 0);
    }
    
    @Test
    public void DepositarTest() {
        Debitos d = new Debitos();
        d.desbloqueia();
        d.depositar(100.0);
        assertEquals(200.0, d.getSaldo(), 0);
        assertEquals(100.0, d.getLimite(), 0);
    }
}