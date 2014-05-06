package Biblioteca;

public class Revista extends Item {
    private String ISSN;
    
    public Revista (String titulo, int ano, int volume, String ISSN) {
        this.titulo = titulo;
        this.ano = ano;
        this.volume = volume;
        this.ISSN = ISSN;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }
}
