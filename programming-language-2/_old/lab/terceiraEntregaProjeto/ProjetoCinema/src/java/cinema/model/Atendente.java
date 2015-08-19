package cinema.model;

public class Atendente {

    public int id;
    public String nome;
    public int idgerente;

    public Atendente(int id, String nome, int idgerente) {
        this.id = id;
        this.nome = nome;
        this.idgerente = idgerente;
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

    public int getIdgerente() {
        return idgerente;
    }

    public void setIdgerente(int idgerente) {
        this.idgerente = idgerente;
    }
}
