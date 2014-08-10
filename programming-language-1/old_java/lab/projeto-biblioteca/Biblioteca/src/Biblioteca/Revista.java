package Biblioteca;

public class Revista extends Item {

    private String ISSN;

    public Revista(String titulo, int ano, int volume, String ISSN) {
        setTitulo(titulo);
        setAno(ano);
        setVolume(volume);
        this.ISSN = ISSN;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }
}
