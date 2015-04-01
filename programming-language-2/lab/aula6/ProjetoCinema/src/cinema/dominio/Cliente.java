package cinema.dominio;

public class Cliente {

    public String nome;
    public boolean beneficiario;

    public Cliente(String nome, boolean beneficiario) {
        this.nome = nome;
        this.beneficiario = beneficiario;
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
