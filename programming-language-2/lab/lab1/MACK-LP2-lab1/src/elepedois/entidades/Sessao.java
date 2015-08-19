package elepedois.entidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private Filme filme;
    private Sala sala;
    private LocalDateTime dataHora;
    private List<Ingresso> ingressos;

    public Sessao() {
        ingressos = new ArrayList<Ingresso>();
    }

    public Sessao(Filme filme, Sala sala, LocalDateTime dataHora) {
        this();
        this.filme = filme;
        this.sala = sala;
        this.dataHora = dataHora;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }
    
    public Ingresso createIngresso(Integer poltrona, Ingresso.TipoIngresso tipo) {
        if (poltrona > sala.getCapacidade() || poltrona <= 0) {
            return null;
        }
        
        for (Ingresso ingressoVendido : ingressos) {
            if (ingressoVendido.getPoltrona() == poltrona) {
                return null;
            }
        }
        
        Ingresso ingresso = new Ingresso(this, poltrona, tipo);
        ingressos.add(ingresso);
        
        return ingresso;
    }
    
    public Integer getNumeroIngressosVendidos() {
        return ingressos.size();
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    
    @Override
    public String toString() {
        DateTimeFormatter formatadorDia = DateTimeFormatter.ofPattern("d/M/y");
        DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("h:mm:ss");
        
        return "sessao do " + this.filme.toString() + 
                ", na " + this.sala.toString() + 
                ", as " + formatadorHora.format(this.dataHora) + 
                " do dia " + formatadorDia.format(this.dataHora);
    }
}
