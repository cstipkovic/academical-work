package ex1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    
    Calculadora calculadora;

    public CalculadoraTest() {
        calculadora = new Calculadora();
    }
    
    @Test
    public void testSoma() {
        assertEquals(calculadora.somar(2, 2), 4);
    }
    
    @Test
    public void testSoma2() {
        assertEquals(calculadora.somar(1, 0), 1);
    }
    
    @Test
    public void testSubtracao() {
        assertTrue(calculadora.subtrair(1, 1) == 0);
    }
    
    @Test
    public void testSubtracao2() {
        assertTrue(calculadora.subtrair(-1, -2) == 1);
    }
    
    @Test
    public void testSubtracao3() {
        assertFalse(calculadora.subtrair(3, 3) == 3);
    }
    
    @Test
    public void testMultiplicacao() {
        assertEquals(calculadora.multiplicar(3, 3), 9);
    }
    
    @Test
    public void testMultiplicacao2() {
        assertTrue(calculadora.multiplicar(2, 3) == 6);
    }
    
    @Test
    public void testMultiplicacao3() {
        assertFalse(calculadora.multiplicar(4, 5) == 25);
    }
    
    @Test
    public void testDivisao() {
        assertEquals(calculadora.dividir(3, 2), 1);
    }
    
    @Test
    public void testDivisao2() {
        assertFalse(calculadora.dividir(3, 3) == 3);
    }
    
    @Test
    public void testDivisao3() {
        assertTrue(calculadora.dividir(3, 4) == 0);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivisao4() {
        assertNotNull(calculadora.dividir(3, 0));
    }
    
}
