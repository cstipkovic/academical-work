import org.junit.Test;
import org.junit.Assert;

public class CalculadoraTest {

    @Test
    public void testSomar() { 
        System.out.println("somar");
        int n1 = 5;
        int n2 = 5;
        Calculadora instance = new Calculadora();
        double expResult = 10.0;
        Assert.assertEquals(expResult, instance.somar(n1, n2), 0);
    } 
    
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        int n1 = 5;
        int n2 = 3;
        Calculadora instance = new Calculadora();
        double expResult = 2;
        Assert.assertEquals(expResult, instance.subtrair(n1, n2), 0);
    }
    
    @Test 
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int n1 = 2;
        int n2 = 3;
        Calculadora instance = new Calculadora();
        double expResult = 6;
        Assert.assertEquals(expResult, instance.multiplicar(n1, n2), 0);
    }
 
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int n1 = 5;
        int n2 = 2;
        Calculadora instance = new Calculadora();
        double expResult = 2.5;
        double result = instance.dividir(n1, n2);
        Assert.assertEquals(expResult, result, 0);
    }
}