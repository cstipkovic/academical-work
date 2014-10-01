package ContaCorrentePrivadaDebitos;

import ContaCorrentePrivadaDebitos.Debitos;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestaDebitos {
    
    @Test
    public void desbloqueiaTest() {
        Debitos d = new Debitos();
        assertFalse(d.desbloqueia());
    }
    
    @Test
    public void sacarMenorSaldoTest() {
        Debitos d = new Debitos();
        d.desbloqueia();
        d.sacar(50.0);
        assertEquals(50.0, d.getSaldo(), 0);
    }
    
    @Test
    public void sacarTotalSaldoTest() {
        Debitos d = new Debitos();
        d.desbloqueia();
        d.sacar(100.0);
        assertEquals(0.0, d.getSaldo(), 0);
    }
    
    @Test
    public void sacarMaiorSaldoComLimiteTest() {
        Debitos d = new Debitos();
        d.desbloqueia();
        d.sacar(200.0);
        assertEquals(0.0, d.getSaldo(), 0);
        assertEquals(0.0, d.getLimite(), 0);
    }
    
    @Test
    public void sacarMaiorSaldoMaiorLimiteTest() {
        Debitos d = new Debitos();
        d.desbloqueia();
        d.sacar(300.0);
        assertEquals(100.0, d.getSaldo(), 0);
        assertEquals(100.0, d.getLimite(), 0);
    }
    
    @Test
    public void depositarTest() {
        Debitos d = new Debitos();
        d.desbloqueia();
        d.depositar(100.0);
        assertEquals(200.0, d.getSaldo(), 0);
        assertEquals(100.0, d.getLimite(), 0);
    }
}
