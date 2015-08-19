package elepedois.entidades;

public class Filme {
    private String titulo;
    private String diretor;
    private Integer ano;

    public Filme() {
    }

    public Filme(String titulo, String diretor, Integer ano) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
    
    @Override
    public String toString() {
        return "filme " + titulo + " de " + diretor + " (" + ano + ")";
    }
}
