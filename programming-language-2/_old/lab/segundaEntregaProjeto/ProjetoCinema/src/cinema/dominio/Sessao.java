package cinema.dominio;

public class Sessao {

    public int id;
    public int sala;
    public int filme;
    public int capacidade;
    public String horario;
    public boolean isFull;

    public Sessao(int id, int sala, int filme, int capacidade, String horario, boolean isFull) {
        this.id = id;
        this.sala = sala;
        this.filme = filme;
        this.capacidade = capacidade;
        this.horario = horario;
        this.isFull = isFull;
    }
    
    public Sessao(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getFilme() {
        return filme;
    }

    public void setFilme(int filme) {
        this.filme = filme;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean isFull) {
        this.isFull = isFull;
    }
}
