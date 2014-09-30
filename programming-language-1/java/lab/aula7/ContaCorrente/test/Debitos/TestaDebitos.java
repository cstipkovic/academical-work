package Debitos;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestaDebitos {
    
    @Test
    public void desbloqueiaTest() {
        Debitos d = new Debitos();
        assertFalse(d.desbloqueia());
    }
    
    @Test
    public void sacarTest() {
        Debitos d = new Debitos();
        d.desbloqueia();
        d.sacar(200.0);
        assertEquals(0.0, (d.getSaldo() + d.getLimite()), 0);
    }
    
    @Test
    public void depositarTest() {
        Debitos d = new Debitos();
        d.depositar(100.0);
        assertEquals(200.0, d.getSaldo(), 0);
    }
}