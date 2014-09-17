import org.junit.Test;
import static org.junit.Assert.*;

public class PopulacaoDeInsetosTest {
    
    @Test
    public void defaultConstructorTest() {
        PopulacaoDeInsetos p = new PopulacaoDeInsetos();
        assertEquals(1000, p.getInsetos());
    }
    
    @Test
    public void nonDefaultConstructorTest() {
        PopulacaoDeInsetos p = new PopulacaoDeInsetos(500);
        assertArrayEquals(1000, p.getInsetos(2000));
    }
    
    @Test
    public void procriarTest() {
        PopulacaoDeInsetos p = new PopulacaoDeInsetos();
        int procriar;
        procriar = p.procriar();
        assertEquals(2000, p.getInsetos(4000));
    }
    
    @Test
    public void pulverizarTest() {
        PopulacaoDeInsetos p = new PopulacaoDeInsetos();
        p.pulverizar();
        assertEquals(250, p.getInsetos(500));
    }
}