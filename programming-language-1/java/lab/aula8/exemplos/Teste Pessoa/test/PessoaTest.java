import org.junit.Test;
import org.junit.Assert;

public class PessoaTest {
    
    @Test
    public void PessoaTest1 () {
        Pessoa gente = new Pessoa();
        gente.idade = 18;
        Assert.assertEquals(18, gente.idade);
    }
    
    @Test
    public void fazAniversario () {
        Pessoa gente = new Pessoa();
        gente.idade = 18;
        gente.fazAniversario();
        Assert.assertEquals(19, gente.idade);
    }    
}