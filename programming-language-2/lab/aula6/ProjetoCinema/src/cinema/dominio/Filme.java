package cinema.dominio;

import java.util.List;

public class Filme {

    public String titulo;
    public String duracao;
    public int classificacao;
    public String diretor;
    public String distribuidora;
    public String status;
    public String genero;
    public List<Ator> elenco;

    public Filme(String titulo, String duracao, int classificacao, String diretor, String distribuidora, String status, String genero, List<Ator> elenco) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacao = classificacao;
        this.diretor = diretor;
        this.distribuidora = distribuidora;
        this.status = status;
        this.genero = genero;
        this.elenco = elenco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Ator> getElenco() {
        return elenco;
    }

    public void setElenco(List<Ator> elenco) {
        this.elenco = elenco;
    }
}
