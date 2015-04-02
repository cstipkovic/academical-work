package cinema.dominio;

public class Cliente {

    public int id;
    public String nome;
    public boolean beneficiario;

    public Cliente(int id, String nome, boolean beneficiario) {
        this.id = id;
        this.nome = nome;
        this.beneficiario = beneficiario;
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

    public boolean isBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(boolean beneficiario) {
        this.beneficiario = beneficiario;
    }
}
