package br.mackenzie.aula6;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cstipkovic
 */
public class CalculadoraTest {
    
    @Test
    public void testSomar() {
        Calculadora instance = new Calculadora();
        double expResult = 10.0;
        double result = instance.Somar(5, 5);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testSubtrair() {
        Calculadora instance = new Calculadora();
        double expResult = 5;
        double result = instance.Subtrair(10, 5);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testMultiplicar() {
        Calculadora instance = new Calculadora();
        double expResult = 4;
        double result = instance.Multiplicar(2, 2);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testDividir() {
        Calculadora instance = new Calculadora();
        double expResult = 5;
        double result = instance.Dividir(10, 2);
        assertEquals(expResult, result, 0);
    }
}
