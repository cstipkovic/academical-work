import org.junit.Test;
import org.junit.Assert;

public class MediaTest {
    
    @Test
    public void MediaTest() {
        double n1 = 7,
               n2 = 7;
        
        Media md = new Media();
        
        Assert.assertEquals(7.0, md.calculaMedia(n1, n2), 0);
    }
}