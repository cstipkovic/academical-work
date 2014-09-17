import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    
    @Test
    public void testSomar() {
        Calculadora instance = new Calculadora();
        double expResult = 10.0;
        double result = instance.somar(5, 5);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testSubtrair() {
        Calculadora instance = new Calculadora();
        double expResult = 2;
        double result = instance.subtrair(5, 3);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testMultiplicar() {
        Calculadora instance = new Calculadora();
        double expResult = 6;
        double result = instance.multiplicar(2, 3);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testDividir() {
        Calculadora instance = new Calculadora();
        double expResult = 2.5;
        double result = instance.dividir(5, 2);
        assertEquals(expResult, result, 0);
    }
}