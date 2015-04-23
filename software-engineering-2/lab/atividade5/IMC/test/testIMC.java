import imc.Ex2;
import org.junit.Test;
import static org.junit.Assert.*;

public class testIMC {
    
    public Ex2 ex2;
    private double imc;
    
    public testIMC() {
        ex2 = new Ex2();
    }

    @Test
    public void testCalcularIMC() {
        double peso = 90.0;
        double altura = 190.0;
        imc = peso/(altura*altura);
        assertEquals(imc, ex2.calculorIMC(peso, altura), 0);
    }
    
    @Test
    public void testMensagemAbaixoDoPeso() {
        imc = 18;
        String result = String.format("Você está abaixo do peso recomendado. IMC %.2f", imc);
        assertEquals("Message is not equal", result, ex2.gerarMensagem(imc));
    }
    
    @Test
    public void testMensagemPesoNormal() {    
        imc = 19;
        String result = String.format("Você está muito bem! Continue assim! IMC %.2f", imc);
        assertEquals("Message is not equal", result, ex2.gerarMensagem(imc));
    }
    
    @Test
    public void testMensagemAcimaPeso() {    
        imc = 25;
        String result = String.format("Você está acima do peso recomendado.\nCuidado! IMC %.2f", imc);
        assertEquals("Message is not equal", result, ex2.gerarMensagem(imc));
    }
    
    @Test
    public void testMensagemObeso() {    
        imc = 30.0;
        String result = String.format("Você está Obeso. Procure o acompanhamento de um nutricionista e\nrealize mais atividades físicas! IMC %.2f", imc);
        assertEquals("Message is not equal", result, ex2.gerarMensagem(imc));
    }
}
