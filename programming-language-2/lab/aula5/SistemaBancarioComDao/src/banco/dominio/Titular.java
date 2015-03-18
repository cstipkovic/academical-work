package banco.dominio;

public class Titular {

    public long numero;
    public String nome;
    public String rg;
    public String cpf;

    public Titular(long numero, String nome, String rg, String cpf) {
        this.numero = numero;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }   
}
