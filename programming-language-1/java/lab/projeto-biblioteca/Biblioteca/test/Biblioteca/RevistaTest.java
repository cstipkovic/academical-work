package Biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

public class RevistaTest {

    @Test
    public void construtorRevista() {
        Revista r = new Revista("Teste kit", 2014, 1, "ISSN 1018-4783");

        assertEquals(r.getTitulo(), "Teste kit");
        assertEquals(r.getAno(), 2014);
        assertEquals(r.getVolume(), 1);
        assertEquals(r.getISSN(), "ISSN 1018-4783");
    }
}