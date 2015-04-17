package cinema.dominio;

import java.util.List;

public class Filme {
    
    public int id;
    public String titulo;
    public String duracao;
    public int classificacao;
    public String diretor;
    public String distribuidora;
    public String status;
    public String genero;
    public int elenco;

    public Filme(int id, String titulo, String duracao, int classificacao, String diretor, String distribuidora, String status, String genero, int elenco) {
        this.id = id;
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacao = classificacao;
        this.diretor = diretor;
        this.distribuidora = distribuidora;
        this.status = status;
        this.genero = genero;
        this.elenco = elenco;
    }
    
    public Filme(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getElenco() {
        return elenco;
    }

    public void setElenco(int elenco) {
        this.elenco = elenco;
    }
}
