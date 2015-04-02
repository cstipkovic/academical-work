package cinema.dominio;

public class Atendente {

    public int id;
    public String nome;
    public Gerente gerente;

    public Atendente(int id, String nome, Gerente gerente) {
        this.id = id;
        this.nome = nome;
        this.gerente = gerente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}
