package tdd.chassi.util;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChassiUtilTest {
    private ChassiUtil util = null;
    
    @Before
    public void inicializar() {
        util = new ChassiUtil();
    }
    
    @Test
    public void testarAnoAChassi() {
        assertEquals(2010, util.obterAno("9BP17164GA0000001", 10));
    }
    
    @Test
    public void testarAnoAMinusculoChassi() {
        assertEquals(2010, util.obterAno("9bp17164ga0000001", 10));
    }
    
    @Test
    public void testarAnoBChassi() {
        assertEquals(2011, util.obterAno("9BP17164GB0000001", 10));
    }
    
    @Test
    public void testarAnoCChassi() {
        assertEquals(2012, util.obterAno("9BP17164GC0000001", 10));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testarExcecaoDeChassiInvalido() {
        util.obterAno("teste", 10);
    }
}